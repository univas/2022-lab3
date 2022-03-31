package br.edu.univas.vo;

public abstract class Animal {

    private String raca;

    public abstract void emiteSom();

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
