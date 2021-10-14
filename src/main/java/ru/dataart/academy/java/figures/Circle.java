package ru.dataart.academy.java.figures;

public class Circle extends Figure{

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
