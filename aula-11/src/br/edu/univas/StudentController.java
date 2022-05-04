package br.edu.univas;

import java.util.ArrayList;

public class StudentController {

    public void printStudentName(
            ArrayList<Student> studentList) {

        try {
            System.out.println("A");
            String name = studentList.get(0).getName();
            System.out.println("Student: "
                    + name.substring(2, 15));
            System.out.println("B");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Lista vazia!");
        } catch (NullPointerException e) {
            System.out.println("Aluno sem dado!");
        }
        System.out.println("C");
    }

}
