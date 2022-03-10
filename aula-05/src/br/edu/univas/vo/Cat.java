package br.edu.univas.vo;

public class Cat {

    public void doSomething() {
        Animal animal = new Animal();
        animal.defaultAttribute = 10;
        animal.defaultMethod();

        animal.protectedAttribute = 10;
        animal.protectedMethod();
    }

}
