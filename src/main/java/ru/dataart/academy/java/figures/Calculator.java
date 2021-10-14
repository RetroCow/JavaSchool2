package ru.dataart.academy.java.figures;

public class Calculator {

    public double sumAreas (Figure[] figures) {

        double total = 0;

        for (Figure figure:figures) {
            total += figure.calculateArea();
        }

        return total;
    }
}
