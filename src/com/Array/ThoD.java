package com.Array;

//Демонтсрация двумерного массива.
class ThoD {
    public static void main(String args[]){
        int t,i, table[][] = new int[3][4];

        for(t=0; t<3; ++t){
            for(i=0; i<4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                // Отобразить исходный массив
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
         }
    }
}
