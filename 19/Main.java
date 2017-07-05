

import java.util.*;  
 public class Main{
  public static void main(String [] args)
   {
      Scanner scn=new Scanner(System.in);
      while(scn.hasNext())
      {
      String str=scn.nextLine(); 
      System.out.println(reverseSentence(str));
       }
       
   }



public static String reverseSentence(String str){
   //完成该函数功能，不需要写main()调用函数，系统会自动调用 
  StringBuffer sb=new StringBuffer();
  String []s=str.split(" ");
  for(int i=s.length-1;i>0;i--)
  {
    sb.append(s[i]+" ");
  }
  sb.append(s[0]);
  return sb.toString();
}
}