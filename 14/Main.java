
import java.util.*;  
 public class Main{
  public static void main(String [] args)
   {
      Scanner scn=new Scanner(System.in);
      while(scn.hasNext())
      {
      String a=scn.nextLine();
      
      System.out.println(eightToTen(a));
       }
       
   }

public static String eightToTen(String s){//Don't write main() function
  
  return String.valueOf(Integer.parseInt(s,8));
}
}