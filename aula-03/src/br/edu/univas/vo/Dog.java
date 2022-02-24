package br.edu.univas.vo;

public class Dog {

    private String name;
    private int birthdayYear;

    public Dog(String name) {
        System.out.println("Estou no construtor 1!!!");
        this.name = name;
    }

    public Dog(int birthdayYear) {
        System.out.println("Estou no construtor 2!!!");
        this.birthdayYear = birthdayYear;
    }

    public Dog(String name, int birthdayYear) {
        System.out.println("Estou no construtor 3!!!");
        this.name = name;
        this.birthdayYear = birthdayYear;
    }

    public Dog(int birthdayYear, String name) {
        System.out.println("Estou no construtor 4!!!");
        this.name = name;
        this.birthdayYear = birthdayYear;
    }

    public Dog() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", birthdayYear=" + birthdayYear +
                '}';
    }
}
