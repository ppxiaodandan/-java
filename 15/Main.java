
import java.util.*;  
 public class Main{
  public static void main(String [] args)
   {
      Scanner scn=new Scanner(System.in);
      while(scn.hasNext())
      {
      String a=scn.nextLine();
      
      System.out.println(twoToSixteen(a));
       }
       
   }


public static String twoToSixteen(String s){//Don't write main() function
  int a=Integer.parseInt(s,2);
  return Integer.toHexString(a);
}
}