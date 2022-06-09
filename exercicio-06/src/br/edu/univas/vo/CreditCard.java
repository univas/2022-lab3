package br.edu.univas.vo;

public class CreditCard implements PaymentMethod {
    @Override
    public String getData() {
        return "CREDIT_CARD";
    }
}
