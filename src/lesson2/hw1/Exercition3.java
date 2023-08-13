package lessons.lesson2.lesson2;
/*//Блок1 Задача 3:
//Используя for вывести каждое четное число от 2 до 20 включительно и больше 10.*/
public class Exercition3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0 && i > 10) {
                System.out.print(i + " ");
            }
        }
    }
}