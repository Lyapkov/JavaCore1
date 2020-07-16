package Lesson2;

public class Task7 {

    /* Написать метод, которому на вход подается одномерный массив
        и число n (может быть положительным, или отрицательным),
        при этом метод должен сместить все элементымассива на n позиций.
        Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */

    //  Задача не работает, боюсь не успеть завтра отправить, поэтому отправляю как есть.

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        print(bias(arr, 10));
    }

    private static int[] bias(int[] arr, int count){
        if (arr.length == 0){
            System.out.println("Пустой массив - это несерьезно!");
            return arr;
        }

        int index = 0, newNumber = 0, newIndex = ((index + count) % arr.length);
        int oldNumber = arr[index];

        for (int i = 0; i < arr.length; i++){
            newNumber = arr[newIndex];
            arr[newIndex] = oldNumber;
            newIndex = ((newIndex + count) % arr.length);
            oldNumber = newNumber;
        }
        return arr;
    }

    private static void print(int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
