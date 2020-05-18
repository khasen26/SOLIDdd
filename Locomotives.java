package com.company;

public class Locomotives extends Transport {

    public Locomotives(String name, int passengersNo) {
        super(name, passengersNo);
    }

    @Override
    public int getPassengersNo() {
        return super.getPassengersNo();
    }

    @Override
    public void work() {
        System.out.println("Added to train");
    }
}
