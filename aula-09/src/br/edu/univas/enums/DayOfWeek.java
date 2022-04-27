package br.edu.univas.enums;

public enum DayOfWeek {

    SUNDAY("Domingo", 1),
    MONDAY("Segunda-feira", 2),
    TUESDAY("Terça-feira", 3),
    WEDNESDAY("Quarta-feira", 4),
    THURSDAY("Quinta-feira", 5),
    FRIDAY("Sexta-feira", 6),
    SATURDAY("Sábado", 7);

    private String name;
    private int position;

    DayOfWeek(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
