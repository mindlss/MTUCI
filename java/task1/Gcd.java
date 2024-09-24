import java.util.Scanner;

public class Gcd {
   public static int gcd(int a, int b) {
       // Используем алгоритм Евклида для нахождения НОД
       while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
       }
       return a;
   }
   public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       System.out.println("Введите первое число: ");
       int num1 = console.nextInt();
       System.out.println("Введите второе число: ");
       int num2 = console.nextInt();

       int greatestCommonDivisor = gcd(num1, num2);

       System.out.println("Наибольший общий делитель " + num1 + " и " + num2 + " равен " + greatestCommonDivisor);
   }
}