/* Q1 . WAP to create static variable and print in static method, call static method from main method.*/

class  Exp1
{
	public static int a = 33;

	public static void hcl()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("main start...");
		hcl();
	}
}
    