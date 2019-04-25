package com.Array;

public class Bubble {
    public static void main(String args[]) {
        int a, b, t, size,
                nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        size = 10; // Kол-во элементов для сортировки

        // Отобразить исходный массив
        System.out.println("Исходный массив: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // Реализовать алгоритм пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {//если требуемый проядок следования
                    //не соблюдается, поменять элементы местами
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        // Отобразить сортированный массив массив
        System.out.println("Сортированный массив: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

    }
}