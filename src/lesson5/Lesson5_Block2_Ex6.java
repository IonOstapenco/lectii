package lesson5;
import java.util.Scanner;
/*Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое следующее
число больше предыдущего)*/
public class Lesson5_Block2_Ex6 {
    public static void main(String[] args) {
        boolean isAscendent=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size= sc.nextInt();
        int array[]=new int[size];
        System.out.println("enter numbers");
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("your array is");
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        for (int i=0; i< array.length;i++){
            if(array[i]<array[i+1]){
                isAscendent=true;
                System.out.println("array is ascendent");
            }
            else{
                System.out.println("array is not ascendent");
            }
        }
    }
}
