import java.util.Scanner;

public class HowManyItems {
   public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       double fabricLength = console.nextDouble(); // Длина ткани в метрах
       double coverWidth = console.nextDouble();     // Ширина пододеяльника в метрах
       double coverLength = console.nextDouble();    // Длина пододеяльника в метрах

       int numberOfCovers = calculateDuvetCovers(fabricLength, coverWidth, coverLength);
       System.out.println("Количество пододеяльников, которые можно сшить: " + numberOfCovers);
   }

   public static int calculateDuvetCovers(double fabricLength, double coverWidth, double coverLength) {
       // Площадь ткани в квадратных метрах
       double fabricArea = fabricLength * 1; // Допустим, ширина ткани 1 метр

       // Площадь одного пододеяльника
       double coverArea = coverWidth * coverLength;

       // Подсчет количества пододеяльников
       int numberOfCovers = (int) (fabricArea / coverArea);

       return numberOfCovers;
   }
}