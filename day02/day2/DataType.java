public class DataType{



  public static void main(String[] args){

        //��������ĸ�ʽ:  �������� �������� = ����ֵ; 

      //1.����һ�����ͱ��� a Ϊ10���������a��    int a =10;
                 int a ;  //��ʼ��
                  a =10;  //��ֵ              
                System.out.println(a);
      //2.����һ���ֽڱ��� b Ϊ128���������b;  
      // byte b =128;����ģ����ܻ���ʧ����  ������ʧ�� Ҫ��byte�������͵ķ�Χ��
                 //System.out.println(b);
      //3.����һ�������͵ı��� c Ϊ 128���������c;
                 short c = 128;
               System.out.println(c);
      //4.����һ�������εı��� d Ϊ 120000000000�� �������d�� ע�⣺���ﶨ��һ��long�ͣ�ֵ��ĩβ����L or l;

                long d = 12000000000l;
                System.out.println(d);
             
  /*��ֵ�͵�С��ϰ:
    1.����һ�����α��� a Ϊ100���������a��
    2.��ʼ��һ��byte���� b��
    3.��ʼ��һ��short����c�����Ҹ�ֵΪ 100�����c
    4 ��ʼ��һ�������ͱ��� d ���Ҹ�ֵΪ200�� ���d
*/
   


   //�����ͣ�
       //������Ĭ��ֵ��һ��double�ͣ�
     float f =3.141592658f;
     double d1 =3.141592658;
     System.out.println(d1);
     System.out.println(f);

  //�ַ��ͣ�
      //�ַ����Ǵ������ŵ�
    char a1 ='a';
    char a2 ='A';
    char  c1 = '\u0061';
    System.out.print(c1);
    System.out.print(a1+"\n");
         System.out.println(a2);

  //�������� ��
     //
   boolean b1 =true;
   boolean b2 = false;
   System.out.println(b1);
   System.out.println(b2);




         



}



}