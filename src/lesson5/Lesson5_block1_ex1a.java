package lesson5;

import java.util.Random;

//Задача 1:
//1.1 Создайте двумерный массив и заполните его псевдослучайными числами с помощью
//класса Random.
public class Lesson5_block1_ex1a {
    public static void main(String[] args) {
        Random random= new Random();
        int array[][]= new int[2][2];
        for (int i=0; i< array.length; i++){
            for (int j=0; j< array.length; j++){
                array[i][j]=random.nextInt();
            }
        }
        System.out.println("your array is ");
        for (int i=0; i<array.length;i++){
            for (int j=0; j< array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
