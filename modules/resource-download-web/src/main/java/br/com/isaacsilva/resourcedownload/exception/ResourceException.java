package br.com.isaacsilva.resourcedownload.exception;

public class ResourceException extends RuntimeException {

    public ResourceException(Exception ex) {
        super(ex);
    }
}
