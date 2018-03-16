package ua.com.owu.dao;

import ua.com.owu.entity.Client;

import java.util.List;
import java.util.Set;

public interface ClientDAO {


    public void save(Client client);

    public List<Client> findAll();

    public Set<Client> findAll(Set<String> idList);

    public Client findOne(String id);

//    public List<Client> findAllByNameOrSurnameOrPhoneOrEmail(String condition);
}
