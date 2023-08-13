package lessons.lesson2.lesson2;

import java.util.Scanner;

/*//Блок 2. Домашнее задание
//Задача 1:
//Напишите программу, которая будет принимать на вход число из консоли и на выход
//будет выводить сообщение четное число или нет. Для определения четности числа
//используйте операцию получения остатка от деления (операция выглядит так: '% 2').*/
public class Lesson_1_Block2_Ex1 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("введи число");
        double number = sc.nextDouble();
        if (number%2==0){
            System.out.println("чётное");
        }
        else
            System.out.println("нечётное");
    }
}
