package ua.com.owu.service;

import ua.com.owu.entity.Application;

import java.util.List;

public interface ApplicationService {
    void save(Application application);

    List<Application> findAll();

    Application findOne(String id);

}
