package com.example.backend.MicroservicioDueno.Exception;

public class DuenoNotFoundException extends RuntimeException {
    public DuenoNotFoundException(String msg){
        super(msg);
    }
}
