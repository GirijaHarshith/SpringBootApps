package com.example.crud.Controller;

public class ResourceNotFound extends RuntimeException{
    String message;
    String objectName;
    Long id;

    public ResourceNotFound(String message, String objectName, Long id) {
        this.message = message;
        this.objectName = objectName;
        this.id = id;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getObjectName() {
        return objectName;
    }

    public long getId() {
        return id;
    }
}
