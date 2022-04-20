package br.edu.univas.vo;

import java.util.ArrayList;

public class AlunoGraduacao extends Aluno {

    private ArrayList<Integer> notas = new ArrayList();

    public float mediaGeral() {
        float media = 0.0f;
        for (Integer nota : notas) {
            media += nota;
        }
        return media / notas.size();
    }

    public void addNota(int nota) {
        notas.add(nota);
    }

    @Override
    public boolean estaAprovado() {
        int total = 0;
        for (Integer nota : notas) {
            total += nota;
        }

        return total >= 70;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
}
