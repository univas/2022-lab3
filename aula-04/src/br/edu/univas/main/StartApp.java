package br.edu.univas.main;

import br.edu.univas.vo.Cat;
import br.edu.univas.vo.Dog;

public class StartApp {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Cat1");
        cat1.setBirthdayYear(2020);
        System.out.println("Gato: ");
        System.out.println("Nome: " + cat1.getName());
        System.out.println("Ano Nascimento: " +
                cat1.getBirthdayYear());

        Dog dog1 = new Dog();
        dog1.setName("Dog1");
        dog1.setBirthdayYear(2018);
        System.out.println("Cachorro: ");
        System.out.println("Nome: " + dog1.getName());
        System.out.println("Ano Nascimento: " +
                dog1.getBirthdayYear());


        System.out.println(dog1);
    }

}
