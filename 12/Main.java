import java.util.*;  
 public class Main{
  public static void main(String [] args)
   {
      Scanner scn=new Scanner(System.in);
      while(scn.hasNext())
      {
      int a=scn.nextInt();
      
      System.out.println(tenToeight(a));
       }
       
   }

public static String tenToeight(int i){//��ɸú������ܣ�����Ҫдmain()���ú�����ϵͳ���Զ�����
  return Integer.toOctalString(i);
}
}