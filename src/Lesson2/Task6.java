package Lesson2;

public class Task6 {

    /* Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true, если в массиве есть место,
        в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        checkBalance([1, 1, 1, || 2, 1]) → true,
        граница показана символами ||, эти символы в массив не входят.
     */

    public static void main(String[] args){
        int[] falseArray = {2};
        int[] trueArray = {2, 1, 1};
        System.out.println(checkBalance(trueArray));
        System.out.println(checkBalance(falseArray));
    }

    private static boolean checkBalance(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        int leftSum = arr[i];
        int rightSum = 0;

        if (arr.length < 2){
            System.out.println("В массиве меньше 2 элементов!");
            return false;
        }

        while (i != j){
            if (rightSum > leftSum){
                i++;
                leftSum += arr[i];
            } else {
                rightSum += arr[j];
                j--;
            }
        }
        return (rightSum == leftSum ? true : false);
    }
}
