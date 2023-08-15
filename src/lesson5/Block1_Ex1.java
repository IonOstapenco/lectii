package lesson5;

/*Задача 1:
Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в консоль*/
public class Block1_Ex1 {
    public static void main(String[] args) {
        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {

            System.out.print("random "+(array[i]= Math.random())+(" "));

            System.out.print(("with power ")+Math.pow(array[i],2)+" ");
        }
    }
}
