package lesson5;

import java.util.Scanner;

//Задача 5:
//Пройти по массиву и поменять местами элементы первый и последний, второй и
//предпоследний и т.д.
public class Lesson5_Block2_Ex5 {
    public static void main(String[] args) {
        System.out.println("changing elements of array with their inverse");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        int number = sc.nextInt();

        String[] notes = new String[number];
        System.out.println("enter elements in your array");
        for (int i = 0; i < notes.length; i++) {
            notes[i] = sc.nextLine();
        }
        System.out.println("your array is");
        for (int i = 0; i < notes.length; i++) {
            System.out.print(notes[i] + " ");
        }
        System.out.println();
        //changing elements
        String temp;
        int n = notes.length;
        for (int i = 0; i < n / 2; i++) {
            temp = notes[n - i - 1];//противоположный
            notes[n - i - 1] = notes[i];
            notes[i] = temp;

        }
        System.out.println("modified array is ");
        for (int i = 0; i < notes.length; i++) {
            System.out.print(notes[i] + " ");
        }

    }
}
