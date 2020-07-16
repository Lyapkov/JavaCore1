package Lesson2;

public class Task2 {

    /*  Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */

    public static void main(String[] args){
        int[] arr = new int[8];
        int numer = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = numer;
            numer += 3;
        }
        for (int num : arr)
            System.out.print(num + " ");
    }
}
