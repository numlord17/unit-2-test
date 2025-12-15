public class KillCilantro
{
   
   public static void main(String[] args)
   {
      System.out.print(killCilantro("cilanro123"));
   }
   
   
   public static String killCilantro(String input)
   {
      String replacement = "parsley";
      String search = "cilantro";
      String newInput;
      int searchIndex = input.indexOf(search);
      //System.out.print(searchIndex);
      if (searchIndex > 0)
      {
         newInput = input.substring(0,searchIndex) + replacement + input.substring(searchIndex + search.length());
         return newInput;
      }
      else if (searchIndex == 0)
      {
         newInput = replacement + input.substring(searchIndex + search.length());
         return newInput;
      }
      else
      {
         return input;
      }
   }
}