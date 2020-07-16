package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static char map[][];

    private static int SIZE = 6;
    private static int DOTS_TO_WIN = 3;

    private static char DOT_EMPTY = '*';
    private static char DOT_X = 'X';
    private static char DOT_O = 'O';

    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        do {
            initMap();
            printMap();
            turnGame();
        } while (isReplayGame());
    }

    private static boolean isReplayGame(){
        int result;
        do {
            System.out.println("Начать новую игру? Ответ в формате: 1 - Да, 0 - Нет.");
            result = sc.nextInt();
        } while (!(result == 1 || result == 0));
        return result == 1;
    }

    private static void turnGame(){
        while (true) {
            if (humanTurn()) {
                printMap();
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                printMap();
                System.out.println("Ничья");
                break;
            } else printMap();

            if (aiTurn()) {
                printMap();
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                printMap();
                System.out.println("Ничья");
                break;
            } else printMap();
        }
        System.out.println("Игра закончена");
    }

    private static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j< SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap(){
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
        return checkWIn(DOT_X, x, y);
    }

    private static boolean aiTurn(){
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
        return checkWIn(DOT_O, x, y);
    }

    private static boolean isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static boolean checkWIn(char symb, int x, int y){
        return (isVerticalWin(symb, x) || isHorizontalWin(symb, y) || isDiagonalWin(symb, x, y) || isReverseDiagonalWin(symb, x, y));
    }

    private static boolean isVerticalWin(char symb, int x){
        int counter = 0;
        for (int i = 0; i < SIZE; i++){
            if (map[i][x] == symb){
                counter++;
                if (counter == DOTS_TO_WIN)
                    return true;
            } else {
                counter = 0;
            }
        }
        return false;
    }

    private static boolean isHorizontalWin(char symb, int y){
        int counter = 0;
        for (int i = 0; i < SIZE; i++){
            if (map[y][i] == symb){
                counter++;
                if (counter == DOTS_TO_WIN)
                    return true;
            } else {
                counter = 0;
            }
        }
        return false;
    }

    private static boolean isDiagonalWin(char symb, int x, int y){
        int counter = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++){
            if (((x - i) >= 0) && ((y - i) >= 0)){
                if (map[y - i][x - i] == symb){
                    counter++;
                } else
                    break;
            } else break;
        }
        for (int i = 1; i < (DOTS_TO_WIN); i++){
            if ((x + i < SIZE) && (y + i < SIZE)){
                if (map[y + i][x + i] == symb){
                    counter++;
                } else
                    break;
            } else break;
        }
        return counter >= DOTS_TO_WIN;
    }

    private static boolean isReverseDiagonalWin(char symb, int x, int y){
        int counter = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++){
            if (((x - i) >= 0) && ((y + i) < SIZE)){
                if (map[y + i][x - i] == symb){
                    counter++;
                } else
                    break;
            } else break;
        }
        for (int i = 1; i < (DOTS_TO_WIN); i++){
            if ((x + i < SIZE) && (y - i >= 0)){
                if (map[y - i][x + i] == symb){
                    counter++;
                } else {
                    break;
                }
            } else break;
        }
        return counter >= DOTS_TO_WIN;
    }

    //Нахожу начало конец наибольшего в ряд совпадения
    //Проверяю нет ли через 1 совпадения
    //Делаю ход

    /*private static boolean cellSelection(){
        int x, y;
        int counter = 0;
        int maxValueCounter = 0;
        int[] position = new int[2];
        int[] horizontal = maxValueHorizontalLine();
        int[] vertical = maxValueVerticalLine();
        int[] diagonal = maxValueDiagonalLine();
        counter = 0;
        *//*for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == DOT_X){
                    counter++;
                    if (counter > maxValueCounter) {
                        maxValueCounter = counter;
                        position[0] = i;
                        position[1] = j;
                    }
                }
            }
            counter = 0;
        }*//*
        x = horizontal[0];
        y = horizontal[1];
        System.out.println( diagonal[0] + " " + diagonal[1] + " " + diagonal[2] + " " + diagonal[3] + " " + diagonal[4] );
        return checkWIn(DOT_O, x, y);
    }
    private static int[] maxValueHorizontalLine(){
        int counter = 0;
        int[] position = new int[5]; // [0] - x, [1] - y начальной точки, [2] - x, [3] - y конечной точки, [4] - длина
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == DOT_X){
                    counter++;
                    if (counter > position[4]) {
                        position[4] = counter;
                        position[2] = j;
                        position[3] = i;
                    }
                } else {
                    counter = 0;
                    position[0] = position[2] - (position[4] - 1);
                    position[1] = position[3];
                }
            }
            counter = 0;
        }
        return position;
    }
    private static int[] maxValueVerticalLine(){
        int counter = 0;
        int[] position = new int[5]; // [0] - x, [1] - y начальной точки, [2] - x, [3] - y конечной точки, [4] - длина
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (map[j][i] == DOT_X){
                    counter++;
                    if (counter > position[4]) {
                        position[4] = counter;
                        position[2] = i;
                        position[3] = j;
                    }
                } else {
                    counter = 0;
                    position[0] = position[2];
                    position[1] = position[3] - (position[4] - 1);
                }
            }
            counter = 0;
        }
        return position;
    }
    private static int[] maxValueDiagonalLine(){
        int counter = 0;
        int[] position = new int[5]; // [0] - x, [1] - y начальной точки, [2] - x, [3] - y конечной точки, [4] - длина
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
            }
            counter = 0;
        }
        return position;
    }*/
}
