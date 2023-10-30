package ru.geekbrains.JDK_S04;

import java.util.UUID;

public class Employee {
    private final UUID ID;
    private int phoneNumber;
    private String name;
    private int experience;

    private Employee(UUID ID, int phoneNumber, String name, int experience) {
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public Employee(int phoneNumber, String name, int experience) {
        this(UUID.randomUUID(),phoneNumber,name,experience);
    }

    public Employee(int phoneNumber, String name) {
        this(phoneNumber,name,0);
    }

    public UUID getID() {
        return ID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}