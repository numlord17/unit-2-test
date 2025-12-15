public class KillCilantro
{
   
   public static void main(String[] args)
   {
         System.out.print(killCilantro("cilantro this is a cilantro example"));
   }
   
   
   public static String killCilantro(String input)
   {
      String replacement = "parsley";
      String search = "cilantro";
      String returnString = "";
      if (input.indexOf(search) < 0)
      {
         returnString += input.substring(0,input.indexOf(search)) + replacement + input.substring(input.indexOf(search) + search.length());
      }
      else if (input.indexOf(search) == 0)
      {
         returnString += replacement + input.substring(input.indexOf(search) + search.length());
      }
      else
      {
         returnString = input;
      }
      return returnString;
   }
}