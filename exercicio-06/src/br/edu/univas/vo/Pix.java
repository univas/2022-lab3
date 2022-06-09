package br.edu.univas.vo;

public class Pix implements PaymentMethod {
    @Override
    public String getData() {
        return "PIX";
    }
}
