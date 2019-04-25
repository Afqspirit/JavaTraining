package com.Finalize;

public class Finalize {
    public static void main (String args[]){
        int count;

        FDemo ob = new FDemo(0);

        /* А теперь сфорировать большое количество объектов.
        В какой-то момент должна начаться СБОРКА МУСОРА
        Возможно придется увеличить кол=во формируемых объектов,
        чтобы принудить СБОРКУ МУСОРА
         */
        for (count = 1; count < 1000000; count++){

            ob.generator(count);
        }

    }
}
