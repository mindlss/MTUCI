import java.util.Scanner;

public class TernaryEvaluation {
   public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       System.out.println("Введите число a:");
       int a = console.nextInt();
       System.out.println("Введите число b:");
       int b = console.nextInt();

       int x = a > b ? a : b;

       System.out.println(x);
   }
}