package Lesson1;

public class Lesson1 {

    public static void main(String[] args){
        initialization();

        double a = 0.54;
        double b = 0.4;
        double c = 0.214;
        double d = 0.89;
        System.out.println(calculations(a, b, c, d));

        System.out.println(isRange(14, 10));

        isPositive(0);

        System.out.println(isNegative(-1));

        greeting("Дмитрий");

        isLeapYear(200);
    }

    public static void initialization(){
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 2147483647;
        float f = 0.165f;
        double d = 0.123456;
        char c = 456;
        boolean bool = true;
        String str = "Строка в двойных кавычках";

        System.out.println(++b);
        System.out.println(++s);
        System.out.println(++i);
        System.out.println(++l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(str);
    }

    public static double calculations(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    public static boolean isRange(int a, int b){
        if ((a+b) <= 20 && (a+b) >= 10)
        {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositive(int number){
        if (number < 0)
            System.out.println("Переданое число отрицательное");
        else
            System.out.println("Переданое число положительное");
    }

    public static boolean isNegative(int number){
        return (number < 0);
    }

    public static void greeting(String str){
        System.out.println("Привет, " + str + "!");
    }

    public static void isLeapYear(int year){
        if ((year % 400) == 0){
            System.out.println("Год является високосным!");
        } else {
            if (((year % 4) == 0) && !((year % 100) == 0)){
                System.out.println("Год является високосным!");
            } else {
                System.out.println("Год не является високосным!");
            }
        }
    }
}
