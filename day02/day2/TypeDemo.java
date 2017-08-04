public class TypeDemo{

   public static void main(String[] args){

        //数据类型小的可以自动转换成数据类型大的
         

             double d1 = 3.14f;
              double d2 =1;
        System.out.println(d2);

    //byte和char与short和char之间不会互相转换，它们三者在计算时会转换成int类型
       byte b1 =12;
       byte b2 =11;
      
       

  //强制转换：  数据类型 变量名字 = (数据类型)(运算);
       
         byte b3 = (byte)(b1+b2);
         System.out.println(b3);

   /*强制转换的练习：
          1.初始化byte b1 变量，并赋值12； 初始化byte b2 变量，并赋值15； 运算，输出 byte b3
          2.short 
          3 long 
            


  
*/



  }


}