class TestChar 
{
	public static void main(String[] args) 
	{
		char c = '々';
		int a = 11;
		byte b = (byte)a;//java中所有的整数默认都是int类型的。
		System.out.println("b = "+b);

		float f = 1.1f;//java中所有的小数默认都是double类型的。
		double d = 1.2;

		f = (float)d;
		System.out.println("f = "+f);

		//自动类型提升
		int i = 11;
		byte b1 = 1;
		int result = i+b1;
		System.out.println("result = "+result);

		boolean bool = (boolean)1;
		System.out.println("bool = "+bool);
	}
}
