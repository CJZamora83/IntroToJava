import javax.swing.JOptionPane;

public class projectOne
{
   public static void main(String args[])
   {
   
   int paycode = 0;
   double wage = 0, gross = 0, net = 0;
   double hours = 0, othours = 0, otrate = 1.5, commrate = .057, fedrate = .30, social = .05, mdrate = 20;
   double commholdings = 0, fedholdings = 0, socialholdings = 0, mdholdings = 0;
   String input;
   String name;
   String title;
   
   //Employee should enter their name
   input = JOptionPane.showInputDialog("Please enter your name: ");
   name = String.parseString(input);
   
   //Employee should specify pay code
   input = JOptionPane.showInputDialog("Please enter your pay code: ");
   paycode = Integer.parseInt(input);
      if (paycode == 1)
         wage = 1750.00;
   
   input = JOptionPane.showInputDialog("Please enter your wage: (pay code 1 not applicable)");
   wage = Double.parseDouble(input);
   
   input = JOptionPane.showInputDialog("Please enter hours worked: ");
   hours = Double.parseDouble(input);
      if (hours > 40)
         othours = hours - 40;
      
net = (wage * hours) - (gross * otrate) - (gross * commrate) + (gross * fed) - (gross * social) - mdrate;

JOptionPane.showMessageDialog(null, "Name: " + name +
                              "\n\tTitle: " + title +
                              "\n\tPay Code: " + paycode +
                              "\n\tHours: " + hours +
                              "\n\tWage: " + wage +
                              "\n\tGross: " + gross +
                              "\n\tFederal: " + fedholdings +
                              "\n\tSocial Security: " + socialholdings +
                              "\n\tSocial Security: " + socialholdings +
                              "\n\tMedical: " + mdholdings +
                              "\n\tNet Pay: " + net);
   
   System.exit(0);
   }
}