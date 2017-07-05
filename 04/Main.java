import java.util.*;  
 public class Main{
  public static void main(String [] args)
   {
      Scanner scn=new Scanner(System.in);
      while(scn.hasNext())
      {
      String str=scn.nextLine(); 
      System.out.println(isNumber(str));
       }
       
   }

public static String isNumber(String str){//Don't write main() function
  if(str==null)
  {
    return " is not number";
  }
  for(int i=0;i<str.length();i++)
  {
    if(str.charAt(i)<'0'||str.charAt(i)>'9')
    {
      return str+" is not number";
    }
  
  }
  return str+" is number";
}

}