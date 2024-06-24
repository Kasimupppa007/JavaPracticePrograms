class  Demo
{
	public static int i = 99;
	public  int j = 20;

	public static void main(String[] args) 
	{
		System.out.println("main start...");
		System.out.println(i);
		Demo s1 = new Demo();
		Demo s2 = new Demo();
		Demo s3 = new Demo();
		Demo s4 = new Demo();
		System.out.println(s3.j);
		System.out.println(s1.j);
		System.out.println(s2.j);
		System.out.println(s4.j);
	}
}
