


import java.util.*;  
 public class Main{
  public static void main(String [] args)
   {
      Scanner scn=new Scanner(System.in);
      while(scn.hasNext())
      {
      String str=scn.nextLine(); 
      System.out.println(Demo(str));
       }
       
   }

public static String Demo(String str){//Don't write main() function
  
  StringBuffer sb=new StringBuffer();
  for(int i=str.length()-1;i>=0;i--)
  {
    if((str.charAt(i)<'0'||str.charAt(i)>'9')&&str.charAt(i)!=' ')
    {
      char c=str.charAt(i);
      sb.append(String.valueOf(c));
    }
  
  }
  return sb.toString();
}

}