package lessons.lesson2.lesson2;

import java.util.Scanner;

/*Задача 2:
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».*/
public class Lesson2_Block2_Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("температура на улице");
        System.out.println("введи число");
        double t = sc.nextDouble();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        } else if (t <= -20) {
            System.out.println("Cold");
        }
    }
}
