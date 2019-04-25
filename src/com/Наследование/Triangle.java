package com.Наследование;
// Подкласс для представления треугольников
// производный от класса TwoDShape
class Triangle extends TwoDShape {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}