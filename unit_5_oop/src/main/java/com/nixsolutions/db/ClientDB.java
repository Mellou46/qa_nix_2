package com.nixsolutions.db;

import com.nixsolutions.entity.Client;
import java.util.UUID;

public class ClientDB {

    private Client[] clients = new Client[0];

    public void create(Client client) {
        client.setId(generateId());
        boolean availableSpace = false;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null) {
                clients[i] = client;
                availableSpace = true;
                break;
            }
        }
        if (!availableSpace) {
            Client[] increasedDoctors = new Client[clients.length + 1];
            for (int i = 0; i < clients.length; i++) {
                increasedDoctors[i] = clients[i];
            }
            increasedDoctors[clients.length] = client;
            clients = increasedDoctors;
        }
    }

    private int findClientId(String id) {
        int n = 0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null && clients[i].getId().equals(id)) {
                n = i;
                break;
            }
        }
        return n;
    }

    public Client findById(String id) {
        int n = findClientId(id);
        return clients[n];
    }

    public void update(Client client) {
        int n = findClientId(client.getId());
        clients[n].setName(client.getName());
        clients[n].setAge(client.getAge());
    }

    public Client[] findAll() {
        return clients;
    }

    public void delete(String id) {
        int n = findClientId(id);
        if (n == clients.length - 1) {
            clients[n] = null;
        } else {
            for (int i = n; i < clients.length - 1; i++) {
                clients[i] = clients[i + 1];
            }
        }
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        for (Client client : clients) {
            if (client != null && client.getId().equals(id)) {
                return generateId();
            }
        }
        return id;
    }
}
