class Bike 
{
	public static void test1(int a)
	{
		System.out.println(a);
	}
	public static void test2(double b)
	{
		System.out.println(b);
	}
	public static void test3(boolean c)
	{
		System.out.println(c);
	}
	public static void test4(char m,String n)
	{
		System.out.println(m);
		System.out.println(n);
	}

	public static void main(String[] args) 
	{
		System.out.println("main start!");
		test1(23);
		test2(25.2);
		test3(true);
		test4('#',"kasi");
		System.out.println("main ending!!!....");
	}
}

