package com.nixsolutions.services;

import com.nixsolutions.entyty.BaseEntyty;
import com.nixsolutions.entyty.PlanerOne;
import com.nixsolutions.entyty.PlanetThree;
import com.nixsolutions.entyty.PlanetTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlanetsStart {

    public void start() {
        PlanetsImpl planetsImpl = new PlanetsImpl();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter the planet: "
                    + "\n1 - PlanetOne"
                    + "\n2 - PlanetTwo"
                    + "\n3 - PlanetThree"
                    + "\n0 - Exit"
                    + "\nYour choice: ");

            try {
                String choice = reader.readLine();
                switch (choice) {
                    case "1":
                        BaseEntyty planetone = new PlanerOne();
                        System.out.println("Planet One: " + planetsImpl.getAcceleration(planetone.getRadius(), planetone.getWeight()));
                        break;
                    case "2":
                        BaseEntyty planettwo = new PlanetTwo();
                        System.out.println("Planet Two: " + planetsImpl.getAcceleration(planettwo.getRadius(), planettwo.getWeight()));
                        break;
                    case "3":
                        BaseEntyty planetthree = new PlanetThree();
                        System.out.println("Planet Three: " + planetsImpl.getAcceleration(planetthree.getRadius(), planetthree.getWeight()));
                        break;
                    case "0":
                        System.exit(0);
                    default:
                        System.out.println("Enter the correct planet!");
                }
                System.out.println("----------");
            } catch (IOException e) {
                System.out.println("error = " + e.getMessage());
            }
        }
    }
}
