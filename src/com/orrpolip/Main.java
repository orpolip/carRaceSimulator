package com.orrpolip;

import java.util.*;
import java.lang.*;

public class Main {

    static Random rand = new Random();

    static boolean isRaining;

    static boolean isRaining() {
        Random rand = new Random();
        int chance = rand.nextInt(10);
        if (chance < 3) {
            isRaining = true;
        } else {
            isRaining = false;
        }
        return isRaining;

    }

    public static List createVheicles() {

        ArrayList<Car> carsArray = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Car cars = new Car();

            carsArray.add(cars);
        }
        return carsArray;
    }

    public static List simulateRace(List<Car> vehicles){


        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 50 ; j++) {
                vehicles.get(i).moveForAnHour(isRaining());

            }
        }

        Collections.sort(vehicles, new Comparator<Car>() {
            public int compare(Car c1, Car c2) {
                return Integer.compare(c1.distanceTravelled, c2.distanceTravelled);
            }});
        return vehicles;



    }


    public static void printRaceResults(List<Car> vehicles) {

        for (int i = 0; i < vehicles.size() ; i++) {

            System.out.println(vehicles.get(i).name + " " + vehicles.get(i).distanceTravelled);
        }

        System.out.println("The winner is : " + vehicles.get(9).name);
    }

    public static void main(String[] args) {

        List<Car> vehicles = createVheicles();
        simulateRace(vehicles);
        printRaceResults(vehicles);

        }




    }

