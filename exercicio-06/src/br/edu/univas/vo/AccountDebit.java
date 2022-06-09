package br.edu.univas.vo;

public class AccountDebit implements PaymentMethod {
    @Override
    public String getData() {
        return "ACCOUNT_DEBIT";
    }
}
