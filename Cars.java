package com.company;

public class Cars extends Transport {

    public Cars(String name, int passengersNo) {
        super(name, passengersNo);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getPassengersNo() {
        return super.getPassengersNo();
    }

    @Override
    public void work() {
        System.out.println("Car is added");
    }
}
