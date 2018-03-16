package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.owu.dao.ApplicationDAO;
import ua.com.owu.entity.Application;
import ua.com.owu.service.ApplicationService;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    ApplicationDAO applicationDAO;


    @Override
    public void save(Application application) {
        applicationDAO.save(application);
    }

    @Override
    public List<Application> findAll() {
        return applicationDAO.findAll();
    }

    @Override
    public Application findOne(String id) {
        return applicationDAO.findOne(id);
    }
}
