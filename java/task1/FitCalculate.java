import java.util.Scanner;

public class FitCalculate {
   public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       System.out.println("Введите время тренировки:");
       int min = console.nextInt();
       System.out.println("Введите интенсивность тренировки от 1 до 3:");
       int x = console.nextInt();

       int calories = (x*min);
       System.out.println(calories);
   }
}