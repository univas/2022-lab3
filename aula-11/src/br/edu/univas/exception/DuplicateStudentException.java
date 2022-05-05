package br.edu.univas.exception;

public class DuplicateStudentException extends RuntimeException {

    public DuplicateStudentException(String message) {
        super(message);
    }

    public DuplicateStudentException(String message, Throwable cause) {
        super(message, cause);
    }
}
