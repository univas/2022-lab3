package br.edu.univas.vo2;

import br.edu.univas.vo.Animal;

public class Dog extends Animal {

    public void doSomething() {
        // we can't access private
        // attributes and/or methods
//        privateAttribute = 10;
//        privateMethod();

        // we can't access default
        // attributes and/or methods
        // when the class is not
        // in the same package
//        defaultAttribute = 10;
//        defaultMethod();

        protectedAttribute = 10;
        protectedMethod();
    }

}
