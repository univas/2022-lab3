package br.edu.univas.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CustomerControllerTest {

    CustomerController customerController = new CustomerController();


    @Test
    public void listaQuantidadeCustomer_whenHaveCustomersInDatabase_shouldReturnPositiveNumber() {
        int quantidade = customerController.listaQuantidadeCustomer();

        Assertions.assertTrue(quantidade > 0);
    }
}
