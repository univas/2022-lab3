package br.edu.univas.main;

import br.edu.univas.vo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        ArrayList<Competidor> competidores =
                new ArrayList<>();

        cadastraCompetidores(competidores);

    }

    public static void cadastraCompetidores(ArrayList<Competidor> competidores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de competidores");

        for (int i = 0; i < 5; i++) {
            Competidor competidor = new Competidor();
            System.out.println((i + 1) + " competidor:");
            System.out.println("Digite o apelido:");
            competidor.setApelido(scanner.nextLine());

            System.out.println("Digite seu veículo:");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            int option = readInteger(scanner);

            Veiculo veiculo = null;
            if (option == 1) {
                veiculo = new Carro();
            } else if (option == 2) {
                veiculo = new Moto();
            }

            cadastrarVeiculo(veiculo, scanner);
            competidor.setVeiculo(veiculo);
            competidores.add(competidor);
        }
    }

    public static void cadastrarVeiculo(Veiculo veiculo, Scanner scanner) {
        System.out.println("Digite a cor do veiculo:");
        veiculo.setCor(scanner.nextLine());
        System.out.println("Digite o ano de fabricação do veiculo:");
        veiculo.setAnoFabricacao(readInteger(scanner));
        System.out.println("Digite o ano modelo do veiculo:");
        veiculo.setAnoModelo(readInteger(scanner));

        Motor motor = new Motor();
        System.out.println("Digite o torque do motor:");
        motor.setTorque(readDouble(scanner));
        System.out.println("Digite a potência do motor:");
        motor.setPotencia(readInteger(scanner));

        veiculo.setMotor(motor);
    }

    public static int readInteger(Scanner scanner) {
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public static double readDouble(Scanner scanner) {
        double result = scanner.nextDouble();
        scanner.nextLine();
        return result;
    }
}
