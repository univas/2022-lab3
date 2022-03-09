package br.edu.univas.vo;

public class Canine extends Animal {

    public Canine(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return "Canine: " + this.getName();
    }
}
