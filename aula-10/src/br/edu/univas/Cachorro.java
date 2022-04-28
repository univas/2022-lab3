package br.edu.univas;

public class Cachorro extends Canino {

    public Cachorro(String xpto) {
        super(xpto);
    }

    @Override
    public String emiteSom(long abc) {
        return "Au au au";
    }
}
