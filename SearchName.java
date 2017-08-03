//Searching for a name from a string
public class SearchName
{

   public static void main(String args[])
   {
      String names[] = {"Katie", "Christian", "Ariana",
                        "Danica", "Marco"};
                        
      //Search for the name "Danica"
      for(int i = 0; i <= 4; i++)
      {
         if(names[i] == "Danica")
            continue;
         else
            System.out.println(names[i]);
      }//end for loop
   }
}  