package ua.com.owu.service;

import ua.com.owu.entity.Client;

import java.util.List;
import java.util.Set;

public interface ClientService {
    void save(Client client);

    List<Client> findAll();

    Client findOne(String id);

    //    List<Client> findAllByNameOrSurnameOrPhoneOrEmail(String condition);
    Set<Client> findAll(Set<String> idList);
}
