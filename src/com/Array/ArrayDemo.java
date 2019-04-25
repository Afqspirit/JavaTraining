package com.Array;

public class ArrayDemo {
    public static void main(String args[]) {
        int sample[] = new int[10], i;
        int[] array1, array2, arrayN; //можно и так


            for (i = 0; i < 10; i++) {
                sample[i] = i;
                System.out.println("This is sample[" + i + "]: " + sample[i]);
            }
            System.out.println("Размер массива = "+sample.length);//размер массива
        }
    }

