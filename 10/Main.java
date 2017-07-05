
import java.util.*;  
 public class Main{
  public static void main(String [] args)
   {
      Scanner scn=new Scanner(System.in);
      while(scn.hasNext())
      {
      int a=scn.nextInt();
      int b=scn.nextInt();
      int c=scn.nextInt(); 
      System.out.println(Demo(a,b,c));
       }
       
   }


public static String Demo(int a,int b,int c){//Don't write main() function
  int s=a*70+b*21+c*15;
  s%=105;
  if(s>100||s<10)
  {return "No answer";
  }else
  {return String.valueOf(s);
  }
  
  
}
}