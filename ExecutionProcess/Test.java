class Test
{
	public static int a = 99;
	public static double b = 53.6;


	public  int m = 20;
	public boolean n = true;


	public static void main(String[] args) 
	{
		System.out.println("main start...");
		System.out.println(a);
		System.out.println(b);
		Test s1 = new Test();
		Test s2 = new Test();
		System.out.println(s1.m);
		System.out.println(s2.n);
		System.out.println(s1.m);
		System.out.println(s2.n);
	}
}

