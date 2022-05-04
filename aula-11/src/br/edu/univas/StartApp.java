package br.edu.univas;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class StartApp {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rodrigo");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);

        StudentController controller = new StudentController();
        controller.printStudentName(students);
    }

}
