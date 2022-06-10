package br.edu.univas.controller;

import br.edu.univas.exception.ProductException;

public class ProductController {

    public void createProduct() {
        //faz alguma coisa
        int i = 100;

        if (i < 50) {
            throw new ProductException();
        }
    }

}
