class TestChar 
{
	public static void main(String[] args) 
	{
		char c = '��';
		int a = 11;
		byte b = (byte)a;//java�����е�����Ĭ�϶���int���͵ġ�
		System.out.println("b = "+b);

		float f = 1.1f;//java�����е�С��Ĭ�϶���double���͵ġ�
		double d = 1.2;

		f = (float)d;
		System.out.println("f = "+f);

		//�Զ���������
		int i = 11;
		byte b1 = 1;
		int result = i+b1;
		System.out.println("result = "+result);

		boolean bool = (boolean)1;
		System.out.println("bool = "+bool);
	}
}
