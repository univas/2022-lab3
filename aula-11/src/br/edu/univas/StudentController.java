package br.edu.univas;

import br.edu.univas.exception.DuplicateStudentException;
import br.edu.univas.exception.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public void printStudentName(
            ArrayList<Student> studentList) {

        try {
            System.out.println("A");
            String name = studentList.get(0).getName();
            System.out.println("Student: "
                    + name.substring(2, 15));
            System.out.println("B");
            return;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Lista vazia!");
        } catch (NullPointerException e) {
            System.out.println("Aluno sem dado!");
        } finally {
            //this block will always be called
        }
        System.out.println("C");
    }

    public Student findStudent(List<Student> studentList,
                               String name)
            throws StudentNotFoundException {
        for (Student student : studentList) {
            if (student.getName().equals(name)) {
                return student;
            }
        }

        throw new StudentNotFoundException(
                "Student with name [" + name + "] not found!"
        );
    }

    public void addStudent(List<Student> studentList,
                           Student student) {
        if (studentList.contains(student)) {
            throw new DuplicateStudentException(
                    "Student already exist!"
            );
        }

        studentList.add(student);
    }
}
