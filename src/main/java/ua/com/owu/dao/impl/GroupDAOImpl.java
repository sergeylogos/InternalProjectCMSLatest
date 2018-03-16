package ua.com.owu.dao.impl;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.owu.dao.GroupDAO;
import ua.com.owu.entity.Group;

import java.util.List;

@Repository
public class GroupDAOImpl implements GroupDAO {
    @Autowired
    private Datastore datastore;

    @Override
    public void save(Group group) {
        datastore.save(group);

    }

    @Override
    public List<Group> findAll() {
        return datastore.find(Group.class).asList();
    }

    @Override
    public Group findOne(String id) {
        return datastore.get(Group.class, new ObjectId(id));
    }
}
