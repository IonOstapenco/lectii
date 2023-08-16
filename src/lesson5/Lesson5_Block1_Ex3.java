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
        double max=10;
        int size;
        System.out.println("enter array's size");
        size=sc.nextInt();
        //declaration of array
        //3.1 Создать пустой массив типа double с названием masDouble такого размера, который
        //пользователь вводит с клавиатуры.
        double masDouble[]=new double[size];
        //3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
        //консоль.
        for (int i=0; i< masDouble.length;i++){
            masDouble[i]=Math.random()*max;
        }
        System.out.println("array with random");
        for (int i=0; i<masDouble.length;i++){
            System.out.print(Math.round(masDouble[i])+" ");
        }
        System.out.println();
        //3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
//обратном порядке.
        System.out.println("modified array");
        for (int i=0; i<masDouble.length;i++){
            Math.round(masDouble[i]);
            if (Math.round(masDouble[i])==0){
                System.out.print((Math.pow(masDouble[i],2)));
            }
            System.out.print(Math.round(masDouble[i])+" ");
        }

        }


    }

