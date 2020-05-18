package com.company;

abstract public class Transport {

    private String name;
    private int passengersNo;

    public Transport(String name, int passengersNo) {
        this.name = name;
        this.passengersNo = passengersNo;
    }

    public int getPassengersNo() {
        return passengersNo;
    }

    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", passengersNo=" + passengersNo +
                '}';
    }

    abstract public void work();
}
