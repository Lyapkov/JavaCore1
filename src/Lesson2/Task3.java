package Lesson2;

public class Task3 {

    /*  Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */

    public static void main(String[] args){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3(arr);
    }

    public static void task3(int[] arr){
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6)
                arr[i] *= 2;
        for (int num : arr)
            System.out.print(num + " ");
    }
}
