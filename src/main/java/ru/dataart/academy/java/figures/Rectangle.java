package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {
    private final int a;
    private final int b;

    public Rectangle (int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected double calculateArea() {
        return a * b;
    }

    @Override
    protected double calculatePerimeter() {
        return (a + b) * 2;
    }
}
