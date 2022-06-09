package br.edu.univas.vo;

public class BankSlip implements PaymentMethod {
    @Override
    public String getData() {
        return "BANK_SLIP";
    }
}
