package com.nixsolutions.entity;

public class Owner extends BaseEntity {

    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() +
                '}';
    }

}

