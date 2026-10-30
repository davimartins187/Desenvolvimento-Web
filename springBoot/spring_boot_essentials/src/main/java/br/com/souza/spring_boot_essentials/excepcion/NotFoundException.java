package br.com.souza.spring_boot_essentials.excepcion;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
