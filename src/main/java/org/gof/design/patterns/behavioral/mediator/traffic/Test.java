
package org.gof.design.patterns.behavioral.mediator.traffic;

public class Test {

    public static void main(String[] args) {
        Junction junction = new Junction("Adnan Menderes");
        TrafficMediator police = new TrafficPolice("Yusuf", junction);

        System.out.println();

        String[] carNames = {"Audi", "BMW", "Mercedes", "Ferrari", "Porsche"};
        int numberOfCars = carNames.length;

        Thread[] cars = new Thread[numberOfCars];


        for (int i = 0; i < numberOfCars; i++) {
            Thread car = new Car(carNames[i], junction, police, true);
            cars[i] = car;
        }

        System.out.println();

        for (Thread car : cars)
            car.start();
    }
}
