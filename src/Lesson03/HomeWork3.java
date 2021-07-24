package Lesson03;

public class HomeWork3 {

    public static void main(String[] args) {
        System.out.println("_______Task1________");
        array1();

        System.out.println("_______Task2________");
        array2();

        System.out.println("_______Task3________");
        array3();

        System.out.println("_______Task4________");
        array4(10);

        System.out.println("_______Task5________");
        array5(5,4);
    }



   /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    public static void array1() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
                System.out.print(array[i] + "|");

            }
        System.out.println();
        }

//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void array2() {
        int[] newArray = new int[100];
        for (int i = 0; i < 100; i++) {
            newArray[i] = i;
            System.out.print(newArray[i] + "|");
        }
        System.out.println();
    }


//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

            public static void array3() {
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= 6) {
                    array[i] = array[i] * 2;
                }
                System.out.print(array[i] + "|");
            }
                System.out.println();

        }

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
// если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
// [1][1], [2][2], …, [n][n];

    public static void array4(int args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }



//5. Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] array5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.print(arr[i] + "|");
        }
        return arr;
    }
}
