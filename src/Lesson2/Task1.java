package Lesson2;

import java.lang.reflect.Array;

public class Task1 {

    /* Задать целочисленный массив, состоящий из элементов 0 и 1.
       Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
       С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static void main(String[] args){
        int length = (int)(Math.random() * 20);
        int[] arr = new int[length];

        for (int i = 0; i < length; i++){
            arr[i] = (int)(Math.random() * 2);
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
