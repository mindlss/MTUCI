import java.util.Scanner;

public class TriangleTp {
   public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       System.out.println("длины сторон треугольника:");
       int x = console.nextInt();
       int y = console.nextInt();
       int z = console.nextInt();
       if (x + y <= z || x + z <= y || y + z <= x)
           System.out.println("не является треугольником");
       else if(x == y && y == z)
           System.out.println("равносторонний");
       else if (x == y || x == z || y == z)
           System.out.println("равнобедренный");
       else
           System.out.println("разносторонний");
   }
}