package br.edu.univas.vo;

import java.util.Scanner;

public class DepartamentoController {


    public Departamento createDepartamento() {
        Scanner scanner = new Scanner(System.in);
        Departamento departamento = new Departamento();
        System.out.println("Digite o nome do departamento:");
        departamento.setNome(scanner.nextLine());

        System.out.println("Digite a quantidade de funcionario");
        departamento.setQuantidadeFuncionarios(scanner.nextInt());
        return departamento;
    }
}
