package br.edu.univas.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    public void soma_withPositiveParameters_shouldReturnPositiveValue() {
       int result = calculadora.soma(27, 12);

        Assertions.assertEquals(39, result);
        Assertions.assertTrue(result > 0);
    }

    @Test
    public void soma_withNegativeParameters_shouldReturnNegativeValue() {
        int result = calculadora.soma(-27, -12);

        Assertions.assertEquals(-39, result);
        Assertions.assertTrue(result < 0);
    }

    @Test
    public void subtracao_withPositivesValues_shouldReturnPositiveValue() {
        int result = calculadora.subtracao(10, 5);

        Assertions.assertEquals(5, result);
        Assertions.assertTrue(result > 0);
    }

    @Test
    public void divisao_with10And2_shouldReturn5() {
        int result = calculadora.divisao(10, 2);

        Assertions.assertEquals(5, result);
    }

    @Test
    public void divisao_withSecondParameterAsZero_shouldReturnZero() {
        int result = calculadora.divisao(123, 0);

        Assertions.assertEquals(0, result);
    }
}
