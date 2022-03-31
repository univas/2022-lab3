package br.edu.univas.vo;

public class Gato extends Felino {

    public void pular() {
        System.out.println("PULA");
    }

    @Override
    public void emiteSom() {
        System.out.println("MIAU MIAU");
    }

    @Override
    public void arranha() {
        System.out.println("arranha devagar");
    }
}
