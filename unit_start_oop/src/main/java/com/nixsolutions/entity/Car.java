package com.nixsolutions.entity;

public class Car extends BaseEntity{

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car() {
    }
    
    public Car(int price) {
        this.price = price;
    }

    public Car(String id, String brand, String model, int maxSpeed, int price) {
        super(id, brand, model, maxSpeed);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + getId() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", price=" + price +
                '}';
    }
}
