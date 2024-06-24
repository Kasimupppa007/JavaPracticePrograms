class Demo 
{
	public static void main(String[] args) 
	{
		int k = 24;/*k variable is local to main method*/
		System.out.println(k);
		test();
	}
	public static void test()
	{
		int i = 15;/*i variable is local to test method*/
		String name = "kasi lucky number";
		System.out.println(i);
		System.out.println(name);
	}
}
