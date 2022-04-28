package br.edu.univas.vo;

public class Professor implements Pesquisador {

    private String nome;
    private Formacao formacao;

    @Override
    public int calcularConceito() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }
}
