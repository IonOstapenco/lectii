package lesson5;

import java.util.Random;

//Задача 1:
//1.1 Создайте двумерный массив и заполните его псевдослучайными числами с помощью
//класса Random. 1.2 Найдите максимальное значение в созданном 2-мерном массиве.

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
            System.out.println();//space between rows
        }
        int min=array[0][0];
        int max=array[0][0];
        //finding min and max
        for (int i=0; i<array.length;i++){
            for (int j=0; j< array.length;j++){
                if (array[i][j]<min){
                    min=array[i][j];
                }
                if (array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.println("minimum of array is "+min);
        System.out.println("maximum of array is "+max);
    }
}
