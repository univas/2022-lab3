package br.edu.univas.vo;

public class Dog extends Animal {

    public void doSomething() {
        // we can't access private
        // attributes and/or methods
//        privateAttribute = 10;
//        privateMethod();

        defaultAttribute = 10;
        defaultMethod();

        protectedAttribute = 10;
        protectedMethod();
    }

}
