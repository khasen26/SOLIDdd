package com.company;

public class Test {


    final static void ThirdTask(){
        System.out.println("The third task");
        Transport car1 = new Cars("BMW",5);
        System.out.println(car1.toString());
        Transport car2 = new Cars("Porsche",7);
        System.out.println(car2.toString());
        Transport car3 = new Cars("Cadillac",5);
        System.out.println(car3.toString());
        Train train1 = new Train("express train");
        train1.addLocomotive(new Locomotives("part1",200));
        train1.addLocomotive(new Locomotives("part2",100));
        train1.addLocomotive(new Locomotives("part3",150));
        train1.addLocomotive(new Locomotives("part4",300));
        train1.addLocomotive(new Locomotives("part5",200));
        train1.startWork();
        System.out.println("The total number of passengers of the first train is "+train1.getTotalPassengersNo());
        Train train2 = new Train("inter-city train");
        train2.addLocomotive(new Locomotives("part1",50));
        train2.addLocomotive(new Locomotives("part2",70));
        train2.addLocomotive(new Locomotives("part3",100));
        train2.addLocomotive(new Locomotives("part4",160));
        train2.addLocomotive(new Locomotives("part5",200));
        train2.startWork();
        System.out.println("The total number of passengers of the second train is "+train2.getTotalPassengersNo());
    }
}
