package ua.com.owu.dao.impl;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.owu.dao.ApplicationDAO;
import ua.com.owu.entity.Application;

import java.util.List;

@Repository
public class ApplicationDAOImpl implements ApplicationDAO {


    @Autowired
    private Datastore datastore;

    public void save(Application application) {
        datastore.save(application);
        System.out.println("application saved");
    }

    public List<Application> findAll() {
        List<Application> applicationList = datastore.createQuery(Application.class).asList();
        System.out.println("found list : " + applicationList);
        return applicationList;
    }

    public Application findOne(String id) {
        Application application = datastore.get(Application.class, new ObjectId(id));
        System.out.println("found application : " + application);
        return application;
    }
}
