package br.edu.univas.exception;

public class TipoSanguineoNotFoundException extends RuntimeException {

    public TipoSanguineoNotFoundException() {
    }

    public TipoSanguineoNotFoundException(String message) {
        super(message);
    }
}
