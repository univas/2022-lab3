package br.edu.univas.controller;

import br.edu.univas.exception.CustomerException;

public class CustomerController {

    public void createCustomer() throws CustomerException {
        //faz alguma coisa

        int i = 10;

        if (i < 50) {
            throw new CustomerException();
        }
    }

    public int listaQuantidadeCustomer() {
        return 8;
    }
}
