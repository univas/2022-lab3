package br.edu.univas.main;

public class StartApp2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        if (a == b) {
            System.out.println("A é igual a B");
        } else {
            System.out.println("A é diferente de B");
        }

        String nome1 = "Rodrigo";
        String nome2 = "Rodrigo";
        if (nome1 == nome2) {
            System.out.println("Nome1 é igual a nome2");
        } else {
            System.out.println("Nome1 é diferente de nome2");
        }

        String nome3 = new String("Rodrigo");
        String nome4 = new String("Rodrigo");
        if (nome3 == nome4) {
            System.out.println("Nome3 é igual a nome4");
        } else {
            System.out.println("Nome3 é diferente de nome4");
        }

        if (nome3.equals(nome4)) {
            System.out.println("Nome3 é igual a nome4");
        } else {
            System.out.println("Nome3 é diferente de nome4");
        }
    }
}
