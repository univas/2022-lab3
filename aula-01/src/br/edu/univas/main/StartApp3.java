package br.edu.univas.main;

import br.edu.univas.vo.Car;

public class StartApp3 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModelYear(2022);
        car1.setYearRelease(2022);
        car1.setColor("Gray");
        car1.setCurrentSpeed(0);

        Car car2 = car1;
        System.out.println(car1);
        System.out.println(car2);
        if (car1 == car2) {
            System.out.println("Car1 é igual a Car2");
        } else {
            System.out.println("Car1 é diferente de Car2");
        }

        if (car1.equals(car2)) {
            System.out.println("Car1 é igual a Car2");
        } else {
            System.out.println("Car1 é diferente de Car2");
        }

        Car car3 = new Car();
        car3.setModelYear(2022);
        car3.setYearRelease(2022);
        car3.setColor("Gray");
        car3.setCurrentSpeed(0);

        if (car1 == car3) {
            System.out.println("Car1 é igual a Car3");
        } else {
            System.out.println("Car1 é diferente de Car3");
        }

        if (car1.equals(car3)) {
            System.out.println("Car1 é igual a Car3");
        } else {
            System.out.println("Car1 é diferente de Car3");
        }

    }
}
