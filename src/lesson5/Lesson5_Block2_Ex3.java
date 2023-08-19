package lesson5;
import java.util.Scanner;
/*      Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.*/
public class Lesson5_Block2_Ex3 {
    public static void main(String[] args) {

        int indexMin=-1;
        int index=-1;
        Scanner sc= new Scanner(System.in);
        System.out.println("indexes of minimal and maximal elements in array");
        System.out.println("enter array's size");
        int number=sc.nextInt();
        int arr[]= new int[number];

        System.out.println("enter elements of array");
        for (int i=0; i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("");
        //
        System.out.println("your array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //find min and max element of array
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("minimal element of array is " + min);
        System.out.println("maximal element of array is " + max);

        //finding indexes of min and max elements
        for (int i=0; i<arr.length;i++){
            if (arr[i]==min){
                index=i;
                break;
            }
        }
        System.out.println("index of min is "+index);

        for (int i=0; i<arr.length;i++){
            if (arr[i]==max){
                index=i;
                break;
            }
        }
        System.out.println("index of max is "+index);

    }
}
