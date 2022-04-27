package br.edu.univas.enums;

public enum Month {

    JANUARY("Janeiro"),
    FEBRUARY("Fevereiro"),
    MARCH("Março"),
    APRIL("Abril"),
    MAY("Maio"),
    JUNE("Junho"),
    JULY("Julho"),
    AUGUST("Agosto"),
    SEPTEMBER("Setembro"),
    OCTOBER("Outubro"),
    NOVEMBER("Novembro"),
    DECEMBER("Dezembro");

    private String name;

    Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
