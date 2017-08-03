import java.util.*; //* includes all classes 
//import javax.swing.JOptionPane;

public class DieNumber
{

   public static void main(String[] args)
   {
   
      int dieroll = 0, i;
      
      Random random = new Random();
      Scanner input = new Scanner(System.in);
      
      for (i = 0; i < 20; i++)
      {
         dieroll = random.nextInt(6) + 1;
      
      //JOptionPane.showMessageDialog(null, "You rolled a " + dieroll);
      System.out.println("You rolled a " + dieroll);
      }
         
   System.exit(0);
   }
}