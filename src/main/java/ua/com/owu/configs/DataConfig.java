package ua.com.owu.configs;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

//@Configuration
//public class DataConfig extends AbstractMongoConfiguration {
//
//
//    @Override
//    protected String getDatabaseName() {
//        return "cms";
//    }
//
//    @Override
//    public Mongo mongo() throws Exception {
//        return new MongoClient("127.0.0.1", 27017);
//    }
//
//    @Override
//    protected Collection<String> getMappingBasePackages() {
//        List<String> packs = new ArrayList<>();
//        packs.add("ua.com.owu.enity");
//        return packs;
//    }
//}
@Configuration
public class DataConfig {

    protected String getDatabaseName() {
        return "cms";
    }

//    @Bean
//    public Mongo mongo() throws Exception {
//        return mongoClient();
//    }

    @Bean
    public MongoClient mongoClient() {
        return new MongoClient("localhost");
    }

    @Bean
    public Morphia morphia() {
        Morphia morphia = new Morphia();
        morphia.mapPackage("ua.com.owu.entity");
        return morphia;
    }

    @Bean
    public Datastore datastore (){
        return morphia().createDatastore(mongoClient(), getDatabaseName());
    }

    @PostConstruct
    public void clear() {
        mongoClient().getDatabase("cms").drop();
    }


}
