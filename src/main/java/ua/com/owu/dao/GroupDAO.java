package ua.com.owu.dao;

import ua.com.owu.entity.Group;

import java.util.List;

public interface GroupDAO {
    public void save(Group group);

    List<Group> findAll();

    Group findOne(String id);

}
