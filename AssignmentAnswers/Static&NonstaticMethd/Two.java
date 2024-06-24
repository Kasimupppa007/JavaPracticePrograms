/* WAP to create 1 static variable and 1 non static variable of different data types,
access to print in main method..*/
class Two 
{
	public static char k = '@';
	public String name ="Kasi";

	public static void main(String[] args) 
	{
		Two h = new Two();
		System.out.println(k);
		System .out.println(h.name);
	}
}
