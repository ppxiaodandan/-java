
import java.util.*;  
 public class Main{
  public static void main(String [] args)
   {
      Scanner scn=new Scanner(System.in);
      while(scn.hasNext())
      {
      String str=scn.nextLine(); 
      System.out.println(convertToUpperCase(str));
       }
       
   }


public static String convertToUpperCase(String s){//��ɸú������ܣ�����Ҫдmain()���ú�����ϵͳ���Զ�����
  StringBuffer sb=new StringBuffer();
  for(int i=0;i<s.length();i++)
  {
       if(s.charAt(i)>='a'&&s.charAt(i)<='z')
       {
         sb.append(Character.toUpperCase(s.charAt(i)));
       }else
       {
         sb.append(s.charAt(i));
       }
  }
  return sb.toString();
}

}