package br.edu.univas.exception;

public class PaymentMethodNotAllowedException extends Exception {

    public PaymentMethodNotAllowedException() {
    }

    public PaymentMethodNotAllowedException(String message) {
        super(message);
    }
}
