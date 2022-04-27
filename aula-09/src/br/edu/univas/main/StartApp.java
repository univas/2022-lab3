package br.edu.univas.main;

import br.edu.univas.enums.DayOfWeek;
import br.edu.univas.enums.Month;

import java.time.ZonedDateTime;
import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um mês qualquer:");
        String mes = scanner.nextLine();

        if (mes.equals(Month.JANUARY.getName())) {
            //do something...
        }

        System.out.println("Digite um dia da semana:");
        int option = scanner.nextInt();
        if (option == DayOfWeek.WEDNESDAY.getPosition()) {
            //do something...
        }

        for (Month m : Month.values()) {
            System.out.println(m);
        }

        Month month = Month.valueOf("JANUARY");
        System.out.println(month.getName());
    }
}
