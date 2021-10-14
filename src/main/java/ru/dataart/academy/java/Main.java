package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculator;
import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {

        Figure[] figures = new Figure[]{
                new Circle(8),
                new Circle(91),
                new Circle(12),
                new Rectangle(8, 12),
                new Rectangle(4, 2),
                new Rectangle(23, 9),
        };

        Calculator calc = new Calculator();

        double result = calc.sumAreas(figures);

        System.out.println(result);
    }
}