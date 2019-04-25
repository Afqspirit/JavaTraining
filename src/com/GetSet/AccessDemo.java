package com.GetSet;

class AccessDemo {
    public static void main(String args[]){
        Myclass ob = new Myclass();

        /* Доступ к переменной возможен только с помощью
        предназначенных для этой цели методов */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is "+ ob.getAlpha());
        //Обратиться к переменной alpha так, как ипоказано ниже, нельзя.
        //ob.alpha = 10; //шибка! тк переменная закрыта

        //След обращения являются допустимы
        //beta и gamma являются открытыми
        ob.beta = 88;
        ob.gamma = 99;
    }
}
