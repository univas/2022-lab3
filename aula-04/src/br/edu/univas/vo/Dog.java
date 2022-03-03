package br.edu.univas.vo;

public class Dog extends Canine {

    @Override
    public String toString() {
        return "Dog: " + this.getName();
    }
}
