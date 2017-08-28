package com.orrpolip;

import java.util.*;

public class Car {

    Random rand = new Random();

    int distanceTravelled = 0;
    int normalSpeed;

    String name;

    public Car() {


        name = getCarName();
        distanceTravelled = 0;
        normalSpeed = rand.nextInt(110 - 80 + 1) + 80;
    }

    public static String getCarName() {

        List<String> carNames = new ArrayList<>(Arrays.asList(
                "Magic", "Meridian","Guardian", "Scout",
                "Storm", "Heirloom", "Origin",
                "Flux", "Eminance", "Method"));

        int index = Main.rand.nextInt(carNames.size());
        String nameOne = carNames.get(index) + " ";
        int indexTwo = Main.rand.nextInt(carNames.size());
        String nameTwo = carNames.get(indexTwo);

        return nameOne + nameTwo;
    }


    public void moveForAnHour(boolean rain) {
        if (rain) {
            normalSpeed = 70;
        } else {
            normalSpeed = Main.rand.nextInt((110 - 80) + 1) + 80;
        }

        distanceTravelled += normalSpeed;
    }

}





