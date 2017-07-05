public static String Demo(int h){//完成该函数功能，不需要写main()调用函数，系统会自动调用
  int num=0;
  while(h>0)
  {
    num++;
    h-=10;
    if(h<=0)
    {break;
    }
    h+=5;
  
  }
  return String.valueOf(num);
}