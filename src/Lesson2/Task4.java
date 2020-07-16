package Lesson2;

public class Task4 {

    /*  Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */

    public static void main(String[] args){
        int length = (int)(Math.random() * 20);
        int[][] arr = new int[length][length];

        for(int i = 0; i < length; i++){
            arr[i][i] = arr[i][length - (i + 1)] = 1;
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
