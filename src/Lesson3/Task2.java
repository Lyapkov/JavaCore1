package Lesson3;

import java.util.Scanner;

public class Task2 {

    /*  Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
        Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы
    */

    private static String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args){
        String correctAnswer = WORDS[randomIndex(WORDS.length)];
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);

        while (!flag) {
            System.out.println("Введите слово: ");
            String userAnswer = (scanner.next().toLowerCase());
            flag = compare(userAnswer, correctAnswer);
        }
    }

    private static int randomIndex(int length){
        return (int)(Math.random() * length);
    }

    private static boolean compare(String userAnswer, String correctAnswer){
        boolean flag = true;
        String craftString = "";
        for (int i = 0; i < userAnswer.length() && i < correctAnswer.length(); i++){
            if (correctAnswer.charAt(i) == userAnswer.charAt(i)){
                craftString += userAnswer.charAt(i);
            } else {
                craftString += "#";
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Братулек ты угадал! Ты супер крутой!");
            return flag;
        }
        else {
            while (craftString.length() < 15)
                craftString += "#";
            System.out.println(craftString);
            return flag;
        }
    }

}
