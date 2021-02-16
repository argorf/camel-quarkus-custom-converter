package io.argorf;

public class MyCustomType {
    private final String message;

    public MyCustomType(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyCustomType(" + message + ")";
    }
}
