package br.edu.univas.main;

import br.edu.univas.vo.Cat;
import br.edu.univas.vo.Dog;

public class StartApp {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Scott");
        //dog1.setName("Scott");
        dog1.setBirthdayYear(2020);

        Dog dog2 = new Dog(null);

        Dog dog3 = new Dog(2021);

        Dog dog4 = new Dog("Kaio", 2013);

        Dog dog5 = new Dog(2013, "Kaio");

        System.out.println(dog5);

        Dog dog6 = new Dog();

        Cat cat1 = new Cat();
    }
}
