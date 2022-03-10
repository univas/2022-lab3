package br.edu.univas.main;

import br.edu.univas.vo.Animal;

public class StartApp {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.publicAttribute = 10;
        animal.publicMethod();

        // we can't access private
        // attributes and/or methods
        //animal.privateMethod();
        //animal.privateAttribute = 10;

        // we can't access default
        // attributes and/or methods
        // when the class is not
        // in the same package
//        animal.defaultAttribute = 10;
//        animal.defaultMethod();

        // we can't access protected
        // attributes and/or methods
        // when the class is not
        // in the same package and is not
        // a child
        //animal.protectedAttribute = 10;
        //animal.protectedMethod();
    }

}
