 /*Q2 : WAP to overload main metho with static method.*/


class StaticOverload 
{
	public static void main(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main start...!");
		main(25);
	}
}