package com.company.House.java;

public class House {
    public House() {
    }

    int height;
    int width;
    int numberOfFloors;
    int numberOfResidents;

    public House(int height) {
        this.height = height;
    }

    public House(int width, int numberOfFloors) {
        this.width = width;
        this.numberOfFloors = numberOfFloors;
    }

    public House(int width,
                 int numberOfFloors,
                 int numberOfResidents) {
        this.width = width;
        this.numberOfFloors = numberOfFloors;
        this.numberOfResidents = numberOfResidents;
    }

    public int getHeight() {
        return height;
    }

    public int mewTenant(int count) {
        return numberOfResidents += count;
    }
}

class Main {

    public static void main(String[] args) {
        House Kalinin = new House();
        Kalinin.height = 20;
        Kalinin.width = 15;
        Kalinin.numberOfFloors = 6;
        Kalinin.numberOfResidents = 10;

        House Griboedov = new House();
        Griboedov.height = 23;
        Griboedov.width = 17;
        Griboedov.numberOfFloors = 8;
        Griboedov.numberOfResidents = 11;

        System.out.println(Kalinin.getHeight());
        System.out.println(Kalinin.mewTenant(2));

        System.out.println(Griboedov.getHeight());
        System.out.println(Griboedov.mewTenant(3));

    }

}
