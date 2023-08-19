package lesson5;
import java.util.Scanner;
/* пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную
Задача 2:
Найти минимальный-максимальный элементы и вывести в консоль.*/
public class Lesson5_block2_Ex2 {
    public static void main(String[] args) {
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        number= sc.nextInt();
        //copleting array
        int arr[]=new int[number];
        System.out.println("complete array");
        for (int i=0; i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("your array is ");
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        //find min and max element of array
        int min=arr[0];
        int max=arr[0];
        for (int i=0; i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
             if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("minimal element of array is "+min);
        System.out.println("maximal element of array is "+max);
    }
}
