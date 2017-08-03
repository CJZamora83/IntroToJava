import javax.swing.JOptionPane;

public class avgscores

{
	public class main void(String[] args)

	{
		double score1;
		double score2;
		double score3;
		double average;
		String input;

		input = JOptionPane.showInputDialog("Enter Score #1");
		score1 = Double.parseDouble(input);

		input = JOptionPane.showInputDialog("Enter Score #2");
		score2 = Double.parseDouble(input);

		input = JOptionPane.showInputDialog("Enter Score #3");
		score3 = Double.parseDouble(input);

		average = (score1 + score2 + score3) / 3.0;


		if (90 <= average >= 100)
		   JOptionPane.showMessageDialog(null, "Your Average Score grade is: A");
		
		if (80 <= average >= 89)
		   JOptionPane.showMessageDialog(null, "Your Average Score grade is: B");

		if (70 <= average >= 79)
		   JOptionPane.showMessageDialog(null, "Your Average Score grade is: C");

		if (60 <= average >= 69)
		   JOptionPane.showMessageDialog(null, "Your Average Score grade is: D");

		if (average < 59)
		   JOptionPane.showMessageDialog(null, "Your Average Score grade is: F");


		System.exit(0);
 

	}

}