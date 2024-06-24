/* Q4..WAP to create 1 static variable 1 non static variable ,1 static method with local variable 
and print it ,1 non static method with local variable  and print it,call all the methods 
and access to print all the global variable  in main method.....*/ 
class  Four
{
	public static String  hero  = "Dad";
	public String  god = "Amma";
	
	public static void bro()
		{
		String brotherName = ("Kassi");
		System.out.println("My brother name is "+ brotherName);
		}
	public void sis()
		{
		String sisterName = "RENUKA";
		System.out.println("My sister name is "+ sisterName +" Thnaks you!!!");
		}
	public static void main(String[] args)
	{
		Four k = new Four();

		System.out.println("My Rollmodel  is "+ hero);
		System.out.println("My love is "+ k.god);
		bro();
		k.sis();

	}
}
