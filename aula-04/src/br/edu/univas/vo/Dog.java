package br.edu.univas.vo;

public class Dog extends Canine {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " - Dog";
    }
}
