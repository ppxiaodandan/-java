
import java.util.*;  
 public class Main{
  public static void main(String [] args)
   {
      Scanner scn=new Scanner(System.in);
      while(scn.hasNext())
      {
      int a=scn.nextInt();
      
      System.out.println(tenToSixteen(a));
       }
       
   }


public static String tenToSixteen(int i){//完成该函数功能，不需要写main()调用函数，系统会自动调用
  return Integer.toHexString(i);
}
}