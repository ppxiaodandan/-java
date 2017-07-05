public static String SplitDemo(String s){//Don't write main() function
  String [] str=s.split(" ");
  StringBuffer sb=new StringBuffer();
  for(int i=0;i<str.length;i++)
  {
     sb.append(str[i]);
  }
  return sb.toString();
}