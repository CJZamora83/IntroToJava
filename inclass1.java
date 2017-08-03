import javax.swing.JOptionPane;

public class inclass1

{
   public static void main(String[] args)
   
   {
      int number1, number2, number3;
      int average;
      int sum;
      int product;
      int smallest = 0;
      int largest = 0;
      String input;
      
      input = JOptionPane.showInputDialog("Enter the First Number: ");
      number1 = Integer.parseInt(input);
      
      input = JOptionPane.showInputDialog("Enter the Second Number: ");
      number2 = Integer.parseInt(input);
      
      input = JOptionPane.showInputDialog("Enter the Third Number: ");
      number3 = Integer.parseInt(input);
      
      if (number1 < number2 && number1 < number3)
      {
         smallest = number1;
      }
      
      else if (number2 < number1 && number2 < number3)
      {
         smallest = number2;
      }
      
      else 
      {
         smallest = number3;
      }
      
      if (number1 > number2 && number1 > number3)
         {
         largest = number1;
         }
            
      else if (number2 > number1 && number2 > number3)
         {
         largest = number2; 
         }
      
      else
         {
         largest = number3;
         }
               
      average = (number1 + number2 + number3) / 3;
      sum = number1 + number2 + number3;
      product = (number1 * number2 * number3);

      JOptionPane.showMessageDialog(null, "Your First Number is: " + number1 +
                                    "\n\t Your Second Number is: " + number2 +
                                    "\n\t Your Third Number is: " + number3 +
                                    "\n\t The Sum is: " + sum +
                                    "\n\t The Product is: " + product +
                                    "\n\t The Average is: " + average +
                                    "\n\t The Smallest Number is: " + smallest +
                                    "\n\t The Largest Number is: " + largest);
   
      System.exit(0);
      }
}