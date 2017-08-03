//Reads the data from the file "grades.txt" and then
//Prints the data to the screen
import java.io.*;
import java.util.Scanner;

public class ReadGrades
{
   public static void main(String args[]) throws IOException
   {
      int scores;
      String line;
      File infile = new File("Grades.txt");
      //Test existence of the file Grades.txt
      if(!infile.exists())
      {
         System.out.println("File does not exist");
         System.exit(0);
      }
      Scanner input = new Scanner(infile);
      
      //Read each line of the file Grades.txt
      System.out.println("The grades are: ");
      while(input.hasNext())
      {
         line = input.nextLine();
         System.out.println(line);
      }
      input.close();   
   
   }
}