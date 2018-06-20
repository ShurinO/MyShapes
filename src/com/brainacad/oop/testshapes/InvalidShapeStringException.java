package com.brainacad.oop.testshapes;

public class InvalidShapeStringException extends Exception {
    private String text;
    public InvalidShapeStringException(String shapeString) {
        this.text = shapeString;
    }

    @Override
    public String getMessage() {
        return "Bad string \""+text+"\"";
    }
}
