package br.edu.univas.controller;

import br.edu.univas.exception.PaymentMethodNotAllowedException;
import br.edu.univas.vo.*;

import java.util.Scanner;

public class CustomerController {

    public Customer createCustomer() throws PaymentMethodNotAllowedException {
        Scanner scanner = new Scanner(System.in);
        try {
            Customer customer = new Customer();
            System.out.println("Por favor digite o nome do cliente:");
            customer.setName(scanner.nextLine());
            System.out.println("Por favor digite o CPF:");
            customer.setCpf(scanner.nextLine());

            printPaymentMethodMenu();
            int paymentMethodOption = scanner.nextInt();
            customer.setPaymentMethod(
                    getPaymentMethod(
                            paymentMethodOption
                    )
            );
            return customer;
        } finally {
            scanner.close();
        }
    }

    private PaymentMethod getPaymentMethod(int paymentMethodOption) throws PaymentMethodNotAllowedException {
        PaymentMethod paymentMethod = null;
        if (paymentMethodOption == 1) {
            paymentMethod = new CreditCard();
        } else if (paymentMethodOption == 2) {
            paymentMethod = new AccountDebit();
        } else if (paymentMethodOption == 3) {
            paymentMethod = new Pix();
        } else if (paymentMethodOption == 4) {
            paymentMethod = new BankSlip();
        } else {
            throw new PaymentMethodNotAllowedException("Opção inválida!");
        }
        return paymentMethod;
    }

    private void printPaymentMethodMenu() {
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2 - Débito em Conta");
        System.out.println("3 - PIX");
        System.out.println("4 - Boleto");
    }

}
