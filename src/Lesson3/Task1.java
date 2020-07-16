package Lesson3;

import java.util.Scanner;

public class Task1 {

    /* Написать программу, которая загадывает случайное число от 0 до 9,
        и пользователю дается 3 попытки угадать это число.
        При каждой попытке компьютер должен сообщить больше ли указанное
        пользователем число чем загаданное, или меньше.
        После победы или проигрыша выводится запрос – «Повторить игру еще раз?
        1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    private static int MAXIMUM_GUESSED_NUMBER = 9;
    private static int MAXIMUM_NUMBER_OF_ATTEMPTS = 3;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        do {
            int correctAnswer = randomNumber();

            if (!riddle(correctAnswer, scanner)){
                System.out.println("Загаданное число: " + correctAnswer);
            }
            flag = setFlag(scanner);
        } while (flag);
        System.out.println("Приходи в следующий раз!");
    }

    private static int randomNumber(){
        return ((int)(Math.random() * MAXIMUM_GUESSED_NUMBER));
    }

    private static boolean riddle(int correctAnswer, Scanner scanner){
        for (int i = 0; i < MAXIMUM_NUMBER_OF_ATTEMPTS; i++){
            if (isResponseCheck(correctAnswer, scanner)) {
                System.out.println("Поздравляю! Вам удалось угадать число!");
                return true;
            } else
                System.out.println("Не в этот раз, приятель!");

        }
        return false;
    }

    private static boolean isResponseCheck(int correctAnswer, Scanner scanner){
        System.out.println("Введите число от 0 до 9.");
        int userAnswer = 0;
        while (true)
            if (((userAnswer = scanner.nextInt()) <= MAXIMUM_GUESSED_NUMBER) && (userAnswer >= 0)) {

                if (correctAnswer == userAnswer)
                    return true;
                return false;
            } else
                System.out.println("Введите число от 0 до " + MAXIMUM_GUESSED_NUMBER + "!");
    }

    private static boolean setFlag(Scanner scanner){
        System.out.println("Повторить игру еще раз?   1 – да / 0 – нет");
        int answer = 0;

        while (true) {
            if ((answer = scanner.nextInt()) < 2 && answer >= 0) {
                if (answer == 1)
                    return true;
                return false;
            } else
                System.out.println("Введите 0 или 1!");
        }

    }
}
