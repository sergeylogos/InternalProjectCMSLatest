package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.owu.dao.GroupDAO;
import ua.com.owu.entity.Group;
import ua.com.owu.service.GroupService;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDAO groupDAO;

    @Override
    public void save(Group group) {
        groupDAO.save(group);
    }

    @Override
    public List<Group> findAll() {
        return groupDAO.findAll();
    }

    @Override
    public Group findOne(String id) {
        return groupDAO.findOne(id);
    }
}
