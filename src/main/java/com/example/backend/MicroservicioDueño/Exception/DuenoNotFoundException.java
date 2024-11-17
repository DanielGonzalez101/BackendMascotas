package com.example.backend.MicroservicioDueño.Exception;

public class DuenoNotFoundException extends RuntimeException {
    public DuenoNotFoundException(String msg){
        super(msg);
    }
}
