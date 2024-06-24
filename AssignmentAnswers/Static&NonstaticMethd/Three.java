/*  Q3..WAP to create 2 static variable and 2 non static variable of different data type ,
access to print in main method...*/
class Three 
{
	public static char k = '@';
	public String name = "Kasi";
	public static double bad = 99.4;
	public int  l = 007;

	public static void main(String[] args) 
	{
		Three good = new Three();
		Three lucky = new Three();
		System.out.println(k);
		System.out.println(good.name);
		System.out.println(bad);
		System.out.println(lucky.l);
	}
}
