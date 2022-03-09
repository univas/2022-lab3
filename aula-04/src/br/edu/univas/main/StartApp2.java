package br.edu.univas.main;

import br.edu.univas.vo.*;

import java.util.ArrayList;

public class StartApp2 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("animal1");
        System.out.println(animal);

        Feline feline = new Feline();
        feline.setName("feline1");
        System.out.println(feline);

        Cat cat = new Cat();
        cat.setName("cat1");
        System.out.println(cat);

        Canine canine = new Canine("canine1");
        System.out.println(canine);

        Dog dog = new Dog("dog1");
        System.out.println(dog);

        Wolf wolf = new Wolf();
        wolf.setName("wolf1");
        System.out.println(wolf);

        ArrayList<String> samples = wolf.getSamples();
        samples.add("Fabio");
    }
}
