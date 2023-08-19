package lesson5;

import java.util.Scanner;

/*Задача 3:
3.1 Создать пустой массив типа double с названием masDouble такого размера, который
пользователь вводит с клавиатуры.
3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
консоль.
3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
обратном порядке.*/
public class Lesson5_Block1_Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //double max=10;
        int size;
        System.out.println("enter array's size");
        size = sc.nextInt();
        //declaration of array
        //3.1 Создать пустой массив типа double с названием masDouble такого размера, который
        //пользователь вводит с клавиатуры. +++
        double masDouble[] = new double[size];
        //3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
        //консоль.
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = Math.random();
        }
        System.out.println("array with random");
        for (int i = 0; i < masDouble.length; i++) {
            System.out.print((masDouble[i]) + " ");
        }
        System.out.println();
        //3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
//обратном порядке.
        //even numbers
        System.out.println("even numbers of array are");
        for (int i = 0; i < masDouble.length; i++) {
            if (masDouble[i] % 2 == 0) {
                System.out.print(masDouble[i] + " ");
            }
        }

        //math pow even numbers
        System.out.println("math pow even numbers");
        for (int i = 0; i < masDouble.length; i++) {
            if (masDouble[i] % 2 == 0) {
                masDouble[i] =  Math.pow(masDouble[i], 2);
                System.out.print(Math.pow(masDouble[i], 2) + " ");
            }
        }

        //ascending order array
        double temp = 0;
        for (int i = 0; i < masDouble.length; i++) {
            for (int j = i + 1; j < masDouble.length; j++) {
                if (masDouble[i] > masDouble[j]) {
                    temp = masDouble[i];
                    masDouble[i] = masDouble[j];
                    masDouble[j] = temp;
                }
            }
        }
        System.out.println();
        //sorted array
        System.out.println("sorted array");
        for (int i = 0; i < masDouble.length; i++) {
            System.out.print(masDouble[i] + " ");
        }
        System.out.println();
        System.out.println("descending array");
        //descending order
        for (int i = 0; i < masDouble.length; i++) {
            for (int j = i + 1; j < masDouble.length; j++) {
                if (masDouble[i] < masDouble[j]) {
                    temp = masDouble[i];
                    masDouble[i] = masDouble[j];
                    masDouble[j] = temp;
                }
            }
        }
        for (int i = 0; i < masDouble.length; i++) {
            System.out.print(masDouble[i] + " ");
        }

    }
}

