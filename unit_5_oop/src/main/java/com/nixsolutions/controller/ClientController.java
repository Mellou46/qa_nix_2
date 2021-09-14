package com.nixsolutions.controller;

import com.nixsolutions.entity.Client;
import com.nixsolutions.service.ClientService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ClientController {

    private ClientService clientService = new ClientService();

    public void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select your option");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0")) {
                    System.exit(0);
                }
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("if you want create client, please enter 1");
        System.out.println("if you want update client, please enter 2");
        System.out.println("if you want delete client, please enter 3");
        System.out.println("if you want findById client, please enter 4");
        System.out.println("if you want findAll client, please enter 5");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" : create(reader); break;
            case "2" : update(reader); break;
            case "3" : delete(reader); break;
            case "4" : findById(reader); break;
            case "5" : findAll(reader); break;
        }
        runNavigation();
    }

    private void create(BufferedReader reader) {
        System.out.println("ClientController.create");
        try {
            System.out.println("Please, enter your name");
            String name = reader.readLine();
            System.out.println("Please, enter your age");
            String ageString = reader.readLine();
            int age = Integer.parseInt(ageString);
            Client client = new Client();
            client.setAge(age);
            client.setName(name);
            clientService.create(client);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void update(BufferedReader reader) {
        System.out.println("ClientController.update");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            System.out.println("Please, enter your name");
            String name = reader.readLine();
            System.out.println("Please, enter your age");
            String ageString = reader.readLine();
            int age = Integer.parseInt(ageString);
            Client client = new Client();
            client.setId(id);
            client.setAge(age);
            client.setName(name);
            clientService.update(client);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void delete(BufferedReader reader) {
        System.out.println("ClientController.delete");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            clientService.delete(id);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void findById(BufferedReader reader) {
        System.out.println("ClientController.findById");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            Client client = clientService.findById(id);
            System.out.println("client = " + client);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void findAll(BufferedReader reader) {
        System.out.println("ClientController.findAll");
        List<Client> clients = clientService.findAll();
        clients.forEach(client -> System.out.println(client.toString()));
    }
}
