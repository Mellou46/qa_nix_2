package com.nixsolutions;

import com.nixsolutions.entity.BaseEntity;
import com.nixsolutions.entity.Car;
import com.nixsolutions.entity.Owner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StartOOPMain {

    public static void main(String[] args) {

        Car car = new Car();
        Owner owner = new Owner();

        car.setId("grgjgc");
        car.setBrand("Seat");
        car.setModel("Leon");
        car.setMaxSpeed(240);
        car.setPrice(25000);
        owner.setName("Vasya");
        owner.setGender("man");


        List<BaseEntity> list = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            Random random = new Random();
            int r = random.nextInt(2);
            if (r == 0) {
                list.add(new Car());
            } else list.add(new Owner());
        }

        for (BaseEntity baseEntity : list) {
            System.out.println("baseEntity = " + baseEntity.getClass().getSimpleName());
            if (baseEntity instanceof Owner) {
                Owner owner1 = (Owner) baseEntity;
                System.out.println("Owner: " + owner1);
            }
            if (baseEntity instanceof Car) {
                Car car1 = (Car) baseEntity;
                System.out.println("Car: " + car1);
            }
        }
    }
}
