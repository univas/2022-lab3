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

        System.out.println("Velocidade atual:");
        System.out.println(car.getCurrentSpeed());
        car.accelerate(15);
        System.out.println("Velocidade atual:");
        System.out.println(car.getCurrentSpeed());
        car.toBreak(12);
        System.out.println("Velocidade atual:");
        System.out.println(car.getCurrentSpeed());

        Car car2 = new Car();
        car2.accelerate(15);

        Car car3 = new Car();

        car3 = car2;
        car3.toBreak(100);

        Car car4 = null;
        //o código abaixo lança a famosa exceção:
        //"NullPointerException"
        //car4.accelerate(15);


        car = car2;
        car4 = car;

        Car car5 = new Car();
        car5 = car;

    }

    /*
    Corrida Maluca:
    Um programa com Menu abaixo:
    1 - Criar Carro
    2 - Acelerar Carro
    3 - Frear Carro
    4 - Imprimir velocidade atual
    9 - Sair

    Limite: 10 carros
     */
}
