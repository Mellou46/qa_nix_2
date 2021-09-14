package com.nixsolutions.service;

import com.nixsolutions.dao.ClientDao;
import com.nixsolutions.dao.ClientDaoListImpl;
import com.nixsolutions.entity.Client;

import java.util.List;

public class ClientService {

    private ClientDao dao = new ClientDaoListImpl();

    public void create(Client client) {
        dao.create(client);
    }

    public void update(Client client) {
        dao.update(client);
    }

    public void delete(String id) {
        dao.delete(id);
    }

    public Client findById(String id) {
        return dao.findById(id);
    }

    public List<Client> findAll() {
        return List.of(dao.findAll());
    }
}
