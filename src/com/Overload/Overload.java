package com.Overload;

class Overload {
    // Первый вариант метода
    void ovlDemo(){
        System.out.println("No parameters");
    }

    // перезагрузить метод vlDemo с одним параметром типа int
    // Второй вариант метода
    void ovlDemo(int a) {
        System.out.println("One parameter: "+a);
    }

    // перезагрузить метод vlDemo с двумя параметром типа int
    // Третий вариант метода
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: "+a+" "+b);
        return a + b;
    }
    // перезагрузить метод vlDemo с двумя параметром типа double
    // Четвертый вариант метода
    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: "+a+" "+b);
        return a+b;
    }

}
