import java.util.*;  
 public class Main{
  public static void main(String [] args)
   {
      Scanner scn=new Scanner(System.in);
      while(scn.hasNext())
      {
      int a=scn.nextInt();
      
      System.out.println(getSeason(a));
       }
       
   }


public static String getSeason(int m){//Don't write main() function
  if(m==12||m==1||m==2)
  {
    return String.valueOf(m)+"月属于Winter";
  }else if(m>=3&&m<=5)
  {
    return String.valueOf(m)+"月属于Spring";
  }else if(m>=6&&m<=8)
  {
    return String.valueOf(m)+"月属于Summer";
  }else if(m>=9&&m<=11)
  {
    return String.valueOf(m)+"月属于Autumn";
  }
  return "";
}
}