package br.edu.univas.main;

import br.edu.univas.controller.CustomerController;
import br.edu.univas.controller.ProductController;
import br.edu.univas.exception.CustomerException;
import br.edu.univas.exception.ProductException;

public class StartApp {

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.createProduct();

        try {
            CustomerController customerController = new CustomerController();
            customerController.createCustomer();
        } catch (CustomerException e) {
            // trata da melhor forma
        } finally {
            //irá ser chamado sempre!
        }
    }
}
