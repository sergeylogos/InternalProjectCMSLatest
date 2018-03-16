package ua.com.owu.dao;


import ua.com.owu.entity.Application;

import java.util.List;

public interface ApplicationDAO{


    public void save(Application application) ;

    public List<Application> findAll() ;

    public Application findOne(String id);
}
