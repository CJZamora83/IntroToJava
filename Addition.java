//This program will accept two numbers from the user
//and will calculate the sum
import java.util.Scanner;  //Needed for input

public class Addition
{
   public static void main(String args[])
   {
      //Declare three integer variables
      int number1, number2, sum;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please Enter your first number");
      number1 = keyboard.nextInt();
      System.out.println("Please enter your second number");
      number2 = keyboard.nextInt();
      
      sum = number1 + number2;
      
      //Display result on the screen
      System.out.println("The sum is " + sum);
   }


}