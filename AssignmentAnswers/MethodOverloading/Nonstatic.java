/*Q3 : WAP to overload main method with non static method.*/

class Nonstatic 
{
	public void main(int a)
	{
		System.out.println("inside main method ossnly integer args...."+a);
	}
	public static void main(String[] args) 
	{
		System.out.println("inside main method String array args...");
		Nonstatic s1 = new Nonstatic();
		s1.main(225);
	}
}
