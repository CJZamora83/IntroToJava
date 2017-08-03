import java.util.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class projectDos
{
   public static void main(String args[])
   {
      String input;
      int menuselect;
      int answer;     
      //Scanner input = new Scanner(System.in);
      
      input = JOptionPane.showInputDialog("Welcome!  Please make a selection:" +
                                          "\n\t1. Addition Problem" +
                                          "\n\t2. Subtraction Problem" +
                                          "\n\t3. Multiplication Problem" +
                                          "\n\t4. Division Problem" +
                                         "\n\t5. Exit program");
      menuselect = Integer.parseInt(input);
      switch (menuselect)
      {
         case 1:
            Addition();
            break;
         case 2:
            Subtraction();
            break;
         case 3:
            Multiplication();
            break;
         case 4:
            Division(int number1, int number2);
            break;
         case 5:
            JOptionPane.showMessageDialog(null, "Have a Nice Day!");
         System.exit(0);
      }
   }//end main()
     
   public static void Addition()
   {
      Random random = new Random();
      String input;
      int answer;
      int number1 = random.nextInt(100);
      int number2 = random.nextInt(100); 
      
      input = JOptionPane.showInputDialog("What is " + number1 + " plus " + number2);
      answer = Integer.parseInt(input);
      
      while (answer != number1 + number2)
      {
         JOptionPane.showMessageDialog("No! Please try again.");
         input = JOptionPane.showInputDialog("What is " + number1 + " plus " + number2);
         answer = Integer.parseInt(input);
      }
      if(answer == number1 + number2)
      {
         JOptionPane.showMessageDialog("Very good!");
      }
      
   System.exit(0);
   }
   
  public static void Subtraction()
  {
   Random random = new Random();
   String input;
   int number1 = random.nextInt(100);
   int number2 = random.nextInt(100);
   int answer;
   int temp;
  
   input = JOptionPane.showInputDialog("What is " + number1 + " minus " + number2);
   answer = Integer.parseInt(input);
   
   if(number1 < number2)
   {
      temp = number1;
      number1 = number2;
      number2 = temp;
   }
   while (answer != number1 - number2)
   {
      JOptionPane.showMessageDialog("No! Please try again.");
      input = JOptionPane.showInputDialog("What is " + number1 + " minus " + number2);
   }
   if(answer == number1 - number2)
   {
      JOptionPane.showMessageDialog("Very good!");
   }
   System.exit(0);
   }

  public static void Multiplication()
  {
   Random random = new Random();
   String input;
   int number1 = random.nextInt(100);
   int number2 = random.nextInt(100);
  
   input = JOptionPane.showInputDialog("What is " + number1 + " times " + number2);
   answer = Integer.parseInt(input);
   
   while (answer != number1 * number2)
   {
      JOptionPane.showMessageDialog("No! Please try again.");
      input = JOptionPane.showInputDialog("What is " + number1 + " times " + number2);
   }
   if(answer == number1 * number2)
   {
      JOptionPane.showMessageDialog("Very good!");
   }
   System.exit(0);
   }
   
  public static int Division(int number1, int number2)
  {
   Random random = new Random();
   String input;
   int number1 = random.nextInt(100);
   int number2 = random.nextInt(100);
   int answer, remainder, temp;
   
   if(number1 < number2)
   {
      temp = number1;
      number1 = number2;
      number2 = temp;
   }
  
   input = JOptionPane.showInputDialog("What is " + number1 + " divided by " + number2);
   answer = Integer.parseInt(input);
   
   while (answer != number1 * number2)
   {
      JOptionPane.showMessageDialog("No! Please try again.");
      input = JOptionPane.showInputDialog("What is " + number1 + " divided by " + number2);
   }
   if(answer == number1 / number2)
   {
      JOptionPane.showMessageDialog("Very good!");
   }
   System.exit(0);
   }
 
}//end class

//Division method shit----------------------------------------------------------
//int answer;
//int remainder;
//int temp;
//if(number1 < number2)
//{
//temp = number1;
//number1 = number2;
//number2 = temp;
//}
//remainder = number1 % number2
//answer = number1 / number2---------------------------------------------------