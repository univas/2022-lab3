package br.edu.univas.main;

import br.edu.univas.vo.Student;

import java.util.ArrayList;

public class StartApp {

    public static void main(String[] args) {
        String[] nomes = new String[10];
        nomes[0] = "João";
        nomes[1] = "Maria";

        ArrayList firstList = new ArrayList();
        //metodo para adicionar elemeto na lista
        firstList.add("João");
        firstList.add("Maria");
        firstList.add("Jose");
        firstList.add(1, "Fabio");
        //metodo para retornar o tamanho
        firstList.size();
        //metodo para limpar nossa lista
        firstList.clear();
        //metodo usado para retornar se existe elemento na lista
        firstList.isEmpty();

        Student student1 = new Student();
        student1.setName("William");
        student1.setRa(98004015);
        firstList.add(student1);

        Student student2 = new Student();
        student2.setName("Franklin");
        student2.setRa(98004010);

        ArrayList<Student> studentList = new ArrayList();
        studentList.add(student1);
//        studentList.add("Rodrigo");
//        studentList.add(10);
        studentList.add(student2);

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            System.out.println("Name: " + student.getName());
            System.out.println("RA: " + student.getRa());
        }


    }
}
