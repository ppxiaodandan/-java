public static String Demo(int h){//��ɸú������ܣ�����Ҫдmain()���ú�����ϵͳ���Զ�����
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