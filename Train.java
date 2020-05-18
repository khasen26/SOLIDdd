package com.company;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private String name;
    private List<Transport> transports = new ArrayList<>();

    public Train(String name) {
        this.name = name;
    }

    public int getTotalPassengersNo(){
        int sum = 0;
        for (Transport t : transports) {
            sum+=t.getPassengersNo();
        }
        return sum;

    }
    public void addLocomotive(Transport transport) {
        transports.add(transport);
    }

    public void startWork() {
        transports.forEach(t -> t.work());
    }


}

