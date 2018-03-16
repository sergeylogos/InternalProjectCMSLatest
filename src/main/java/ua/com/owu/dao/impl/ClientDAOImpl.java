package ua.com.owu.dao.impl;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.owu.dao.ClientDAO;
import ua.com.owu.entity.Client;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class ClientDAOImpl implements ClientDAO {

    @Autowired
    private Datastore datastore;

    public void save(Client client) {
        datastore.save(client);
        System.out.println("client saved");
    }

    public List<Client> findAll() {
        List<Client> clientList = datastore.createQuery(Client.class).asList();
        System.out.println("found list : " + clientList);
        return clientList;
    }

    public Client findOne(String id) {
        Client client = datastore.get(Client.class, new ObjectId(id));
        System.out.println("found application : " + client);
        return client;
    }

//    @Override
//    public List<Client> findAllByNameOrSurnameOrPhoneOrEmail(String condition) {
//        Query<Client> query = datastore.createQuery(Client.class);
//        CriteriaContainer or = query.or(
//                query.criteria("name").containsIgnoreCase(condition),
//                query.criteria("surname").containsIgnoreCase(condition),
//                query.criteria("phoneNumber").containsIgnoreCase(condition),
//                query.criteria("email").containsIgnoreCase(condition)
//
//        );
//
//
//        return query.asList();
//    }


    @Override
    public Set<Client> findAll(Set<String> idList) {
        Set<Client> clients = new HashSet<>();
        idList.forEach(id -> clients.add(findOne(id)));

        return clients;
    }
}
