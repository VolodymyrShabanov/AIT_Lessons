package lesson_14_2023_09_22_practice;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        /*
        1 - промах
        8 - кораблик
        5 - попадание
        0 -
         */

        startGame();
    }

    public static void startGame() {
        int size = 5;
        int sizeBoat = 2;
        int boatsAmount = 1;


        int countAttempts = 0;
        int goodShots = 0;

        int[][] field = new int[size + 1][size + 1];

        /* проверка правльности задания границ координат
        Random random = new Random();
        int testCounter = 0;
        for (int i = 0; i < 20; i++) {
            int xCoodinate = random.nextInt((field.length - sizeBoat)) + 1;
            if (xCoodinate > 5) {
             testCounter ++;
            }

        }
        System.out.println("\nконец проверки " + testCounter);
        */

        readyToStart(size, sizeBoat, boatsAmount);
        int[] boatCoordinate = setBoats(field, sizeBoat);
        showField(field);

        while (goodShots < sizeBoat) {

            // Scanner scanner = new Scanner(System.in);

            int xCoordinate;
            int yCoordinate;

            // System.out.printf("Введите координату по горизонтали (число от 1 до %d\n", (size));

            // Получаем координаты от пользователя
            xCoordinate = getCoordinateFromPlayer("вертикали", size, field, boatCoordinate);
            //System.out.println("Получено значение: " + xCoordinate);
            yCoordinate = getCoordinateFromPlayer("горизонтали", size, field, boatCoordinate);

            boolean isGoodMove = makeMove(field, xCoordinate, yCoordinate);

            if (isGoodMove) goodShots++;

            showField(field);




            countAttempts++;

//            выход из цикла
//            goodShots = sizeBoat;
        }

        System.out.println("Вы нашли все корабли! Поздравляю!!!");
        System.out.println("Количество ходов: " + countAttempts);

    }

    private static boolean makeMove(int[][] field, int x, int y) {
        if (field[x][y] == 8) {
            field[x][y] = 5;
            return true;
        } else if (field[x][y] == 0) {
            field[x][y] = 1;
        }
        return false;
    }

    private static int getCoordinateFromPlayer(String str, int size, int[][] field, int[] helper) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите координату по %s (число от 1 до %d)\n", str, size);
        int coordinate = 0;

        if (scanner.hasNextInt()) {
            coordinate = scanner.nextInt();
        }

        //System.out.println("Введено: " + coordinate);

        if (coordinate == 911) provaideHellp(field, helper);

        coordinate = (coordinate > 0 && coordinate <= size) ? coordinate : getCoordinateFromPlayer(str, size, field, helper);


        return coordinate;
    }

    private static void provaideHellp(int[][] field, int[] boatCoordinateArray) {
        //  Зачеркнуть несколько пустых клеток
        System.out.printf("В строке %s находится башня корабля!\n", boatCoordinateArray[0]);
        // дать одну горизонталь где есть корабли


    }


    public static void showField(int[][] field) {

        System.out.println();
        for (int i = 0; i < field.length; i++) {

            if (i == 0) {


                //String result = "";
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < field.length; j++) {
                    //result += " " + j + " |";
                    sb.append(" ").append(j).append(" |");

                }
                ///System.out.println(result);

                System.out.println(sb.toString());
            } else {
                //String res = " " + i + " |";
                StringBuilder res = new StringBuilder(" ").append(i).append(" |");
                for (int j = 1; j < field.length; j++) {
                    //res += " " + getSymbolByIntValue(field[i][j]) + " |";
                    res.append(" ").append(getSymbolByIntValue(field[i][j])).append(" |");
                }
                System.out.println(res);

            }

        }

    }

    private static char getSymbolByIntValue(int i) {
        switch (i) {
            case 0:
                return '-';
            case 1:
                return '*';
            case 5:
                return 'X';
            case 8:
                return '0';
            default:
                return '-';

        }
    }

    private static int[] setBoats(int[][] field, int sizeBoat) {
//        int [] boatCoor = new   int [2];

        Random random = new Random();

        boolean isVertical = random.nextBoolean(); // генерирует true || fdlse

        int xCoordinate, yCoordinate;

        if (isVertical) {
            // 6 (0... 5) -> [0...4] -> [1...5]
            xCoordinate = random.nextInt((field.length - sizeBoat)) + 1;
            //System.out.println("Сгенерировать координата: " + xCoordinate);
            yCoordinate = random.nextInt((field.length - 1)) + 1;
            for (int i = xCoordinate; i < xCoordinate + sizeBoat; i++) {
                field[i][yCoordinate] = 8;
            }

            System.out.print("Vertical: " + xCoordinate + " : " + yCoordinate);

        } else {
            xCoordinate = random.nextInt((field.length - 1)) + 1;
            yCoordinate = random.nextInt((field.length - sizeBoat)) + 1;
            for (int i = yCoordinate; i < yCoordinate + sizeBoat; i++) {
                field[xCoordinate][i] = 8;

            }
            System.out.print("Horizontal: " + xCoordinate + " : " + yCoordinate);
        }

        return new int[]{xCoordinate, yCoordinate};

    }

    public static void readyToStart(int size, int sizeBoat, int boatsAmount) {

        System.out.printf("Игра морской бой ведется на квадратном поле %dx%d", size, size);
        System.out.printf("\nКоличество кораблей на поле %d\n", boatsAmount);
        System.out.println("Игрок вводит координаты поля ");
        System.out.println("Программа отображает историю ходов и их результативность на игровом поле");
        System.out.println("Игра заканчивается когда все корабли найдены.");
        System.out.println("Для получения подсказки - введите 911");

        System.out.println("==========================================================================");


    }


}
