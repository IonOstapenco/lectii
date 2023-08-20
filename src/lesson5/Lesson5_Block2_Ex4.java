package lesson5;
/*Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
сообщение, что их нет*/
import java.util.Scanner;

public class Lesson5_Block2_Ex4 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("how much 0 elements in array");
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("enter arrays size");
        number=sc.nextInt();
        int array[]=new int[number];
        System.out.println("complete array");
        for (int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("your array is ");
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //counting 0 in array
        for (int i=0; i< array.length;i++){
            if (array[i]==0){
                count++;
            }
        }
        System.out.println("there are "+count+" of 0 in your array");
    }
}
