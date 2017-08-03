import java.util.Scanner;

public class Calculation
{
   public static void main(String args[])

   {
      //what does "int" mean?
      int number1, number2, number3, product, average;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter your first number");
      number1 = keyboard.nextInt();
      System.out.println("Please enter your second number");
      number2 = keyboard.nextInt();
      System.out.println("Please enter your third number");
      number3 = keyboard.nextInt();
      product = number1 * number2 * number3;
      average = (number1 + number2 + number3) / 3;
   
      System.out.println("The product is " + product + " and your average is " + average);
   
   }

}