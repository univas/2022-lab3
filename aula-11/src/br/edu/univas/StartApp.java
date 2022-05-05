package br.edu.univas;

import br.edu.univas.exception.StudentNotFoundException;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class StartApp {

    public static void main(String[] args) throws StudentNotFoundException {
        new StartApp().start();
    }

    public void start() throws StudentNotFoundException {
        Student student = new Student();
        student.setName("Rodrigo");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);

        StudentController controller = new StudentController();
        //controller.printStudentName(students);

        try {
            controller.findStudent(students, "Maria");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //controller.findStudent(students, "João");


        Student student2 = new Student();
        student2.setName("Rodrigo");
        controller.addStudent(students, student2);
    }
}
