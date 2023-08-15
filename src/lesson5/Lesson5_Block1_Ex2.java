package lesson5;
import java.util.Scanner;
/*Задача 2:
2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
2.2 вывести в консоль второй и четвертый.
2.3 вывести в консоль длину массива.
2.4 третий фрукт заменить на иной.
2.5 проверить результат в консоли*/
public class Lesson5_Block1_Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter four fruits");
        String [] fruits = new String[4];
        //заполнение массива
        for (int i=0; i< fruits.length;i++){
            fruits[i]= sc.nextLine();
        }
        //2.2 вывести в консоль второй и четвертый.
        System.out.println("second and fourth fruits are");
            System.out.print(fruits[1]+" "+fruits[3]);
        System.out.println();
        //2.3 вывести в консоль длину массива.
        System.out.println("array's length is "+ fruits.length);
        //2.4 третий фрукт заменить на иной.
        System.out.println("change name of third fruit");
        fruits[2]= sc.nextLine();
        //2.5 проверить результат в консоли
        System.out.println("your new fruits array");
        for (int i=0; i< fruits.length;i++){
            System.out.print(fruits[i]+" ");
        }
    }
}
