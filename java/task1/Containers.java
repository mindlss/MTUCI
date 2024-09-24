import java.util.Scanner;

public class Containers {
   public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       System.out.println("Введите количество коробок:");
       int x = console.nextInt();
       System.out.println("Введите количество мешков:");
       int y = console.nextInt();
       System.out.println("Введите количество бочек:");
       int z = console.nextInt();
       System.out.println("Товаров на складе: " + ((x*20)+(y*50)+(z*100)));

   }
}