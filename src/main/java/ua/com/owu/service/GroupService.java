package ua.com.owu.service;

import ua.com.owu.entity.Group;

import java.util.List;

public interface GroupService {

    void save(Group group);

    List<Group> findAll();

    Group findOne(String id);
}
