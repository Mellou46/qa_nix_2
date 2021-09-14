package com.nixsolutions.dao;

import com.nixsolutions.entity.Client;

public interface ClientDao {

    void create(Client client);
    void update(Client client);
    void delete(String id);
    Client findById(String id);
    Client[] findAll();
}
