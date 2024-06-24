class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main start!....");
		A.good();
		A s1 = new A();
		s1.bad();
		System.out.println("main end!....");
	}
}
