package br.edu.univas.main;

import br.edu.univas.vo.Car;

public class StartApp {

    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("blue");
        car.setModelYear(2020);
        car.setYearRelease(2019);

        System.out.println("Fase 1");
        System.out.println(car.getColor());
        System.out.println(car.getModelYear());
        System.out.println(car.getYearRelease());
    }
}
