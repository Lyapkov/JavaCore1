package Lesson2;

public class Task5 {

    /*  Задать одномерный массив и найти в нем минимальный
        и максимальный элементы;
     */

    public static void main(String[] args){
        int length = (int)(Math.random() * 20);
        int[] arr = new int [length];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int min = 100;
        int max = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("\nМинимальное значение массива: " + min);
        System.out.println("Махсимальное значение массива: " + max);
    }
}
