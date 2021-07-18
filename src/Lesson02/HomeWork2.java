package Lesson02;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("_______Task1________");
        System.out.println(method1(11, 1));
        System.out.println(method1(11, 12));

        System.out.println("_______Task2________");
        method2(12);
        method2(-9);

        System.out.println("_______Task3________");
        System.out.println(method3(92));
        System.out.println(method3(-8));
        
        System.out.println("_______Task4________");
        method4("Test",4);
    }

/*    1. Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/

    public static boolean method1(int a, int b) {
        return a + b >=10 && a + b <=20;
    }

/*
    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/

    public static void method2(int a) {
        if (a >=0){
            System.out.println("Положительное число = " + a);
        }
        else {
            System.out.println("Отрицательное число = " + a);
        }
    }

    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/

    public static boolean method3(int a) {
        return a  <=0;
    }

/*    4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;*/

    public static void method4(String a, int b) {
       int c = 0;
        while (c < b){
            c++;
           System.out.println(a + c);
        }
    }
}
