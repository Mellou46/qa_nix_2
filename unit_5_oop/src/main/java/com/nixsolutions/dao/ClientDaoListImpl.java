package com.nixsolutions.dao;

import com.nixsolutions.db.ClientDB;
import com.nixsolutions.entity.Client;

public class ClientDaoListImpl implements ClientDao {

    private ClientDB db = new ClientDB();

    public ClientDaoListImpl() {
        System.out.println("UserDaoSetImpl.UserDaoSetImpl");
    }

    public void create(Client client) {
        db.create(client);
    }

    public void update(Client client) {
        db.update(client);
    }

    public void delete(String id) {
        db.delete(id);
    }

    public Client findById(String id) {
        return db.findById(id);
    }

    public Client[] findAll() {
        return db.findAll();
    }
}
