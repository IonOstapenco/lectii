package lesson5;

import java.util.Scanner;

// пользователь с клавиатуры вводит размер
//массива (просто целое число). После того, как размер массива задан, заполнить его
//одним из двух способов: используя Math.random(), или каждый элемент массива вводится
//пользователем вручную
//Задача 1:
//Пройти по массиву, вывести все элементы в прямом и в обратном порядке
public class Lesson5_Block2_Ex1 {
    public static void main(String[] args) {
        //declaration of array
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dimension of array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter array's elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("your array is ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();


        //ascending order array
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        //sorted array
        System.out.println("sorted array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("descending array");
        //descending order
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
