package com.Finalize;

class FDemo {
 int x;


    FDemo(int i) {
	x = i;

    }
    //Вызывается при утилизации объекта
    protected void finalize() {
        System.out.println("Finalizing"+x);
    }

    //формирует объект, который тотчас уничтожается
    void generator (int i){
        FDemo o = new FDemo(i);
    }

}

