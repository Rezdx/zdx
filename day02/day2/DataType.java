public class DataType{



  public static void main(String[] args){

        //定义变量的格式:  数据类型 变量名字 = 变量值; 

      //1.定义一个整型变量 a 为10；并且输出a；    int a =10;
                 int a ;  //初始化
                  a =10;  //赋值              
                System.out.println(a);
      //2.定义一个字节变量 b 为128；并且输出b;  
      // byte b =128;错误的；可能会损失精度  （有损失） 要在byte数据类型的范围内
                 //System.out.println(b);
      //3.定义一个短整型的变量 c 为 128，并且输出c;
                 short c = 128;
               System.out.println(c);
      //4.定义一个长整形的变量 d 为 120000000000； 并且输出d； 注意：这里定义一个long型，值的末尾加上L or l;

                long d = 12000000000l;
                System.out.println(d);
             
  /*数值型的小练习:
    1.定义一个整形变量 a 为100；并且输出a；
    2.初始化一个byte变量 b；
    3.初始化一个short变量c；并且赋值为 100；输出c
    4 初始化一个长整型变量 d 并且赋值为200； 输出d
*/
   


   //浮点型：
       //浮点型默认值是一个double型；
     float f =3.141592658f;
     double d1 =3.141592658;
     System.out.println(d1);
     System.out.println(f);

  //字符型：
      //字符型是带单引号的
    char a1 ='a';
    char a2 ='A';
    char  c1 = '\u0061';
    System.out.print(c1);
    System.out.print(a1+"\n");
         System.out.println(a2);

  //布尔类型 ：
     //
   boolean b1 =true;
   boolean b2 = false;
   System.out.println(b1);
   System.out.println(b2);




         



}



}