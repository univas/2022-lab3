package br.edu.univas.vo;

import java.util.ArrayList;

public class AlunoPos extends Aluno implements Pesquisador {

    private ArrayList<Character> conceitos = new ArrayList();

    public char conceitoGeral() {
        int contadorA = 0;
        int contadorB = 0;

        for (Character conceito : conceitos) {
            if (conceito.equals('A')) {
                contadorA++;
            } else if (conceito.equals('B')) {
                contadorB++;
            } else if (conceito.equals('D')) {
                return 'D';
            }
        }

        if (contadorA == conceitos.size()) {
            return 'A';
        } else if (contadorB >= (conceitos.size() / 2)){
            return 'B';
        }

        return 'C';
    }

    public void addConceito(char conceito) {
        conceitos.add(conceito);
    }

    @Override
    public boolean estaAprovado() {
        char conceito = conceitoGeral();
        return conceito == 'A' || conceito == 'B';
    }

    @Override
    public int calcularConceito() {
        char conceito = conceitoGeral();
        switch(conceito) {
            case 'A': return 90;
            case 'B': return 75;
            case 'C': return 50;
        }
        return 0;
    }
}
