/*Q2. WAP to create static method and non method and call the main method ..*/

class Exp2
{
	public static void test1()
	{
		String name = "kasi";
		System.out.println(name);
	}
	public void test2()
	{
		char k = '$';
		System.out.println(k);
	}
	public static void main(String[] args) 
	{
		System.out.println("main start...");
		test1();
		Exp2 q = new Exp2();
		q.test2();
	}
}
