package br.edu.univas.vo;

public class Veiculo {

    private String cor;
    private int anoFabricacao;
    private int anoModelo;
    private Motor motor;
    private int velocidadeAtual;

    public void acelerar(int valor) {
        velocidadeAtual += valor;
    }

    public void frear(int valor) {
        velocidadeAtual -= valor;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
