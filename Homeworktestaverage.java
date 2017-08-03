import java.util.Scanner;

public class Homeworktestaverage
   {
      public static void main(String args[])
      {
      int number1, number2, number3, testaverage;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter the first test score");
      number1 = keyboard.nextInt();
      System.out.println("Please enter the second test score");
      number2 = keyboard.nextInt();
      System.out.println("Please enter the third test score");
      number3 = keyboard.nextInt();
      testaverage = (number1 + number2 + number3) / 3;
      System.out.println("Your test scores are: " + number1 + "," + number2 + ", and " + number3 + " and your average score is " + testaverage);
      }
}
