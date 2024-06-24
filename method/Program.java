/* WAP to create 2 non static methods and call from main method */

class Program
{
	public static void main(String[] args) 
	{
		System.out.println("main start....");
		Program leg = new Program();
		leg.walkRoad();
		leg.swimPound();
	}
	public void walkRoad()
	{
		System.out.println("walk on few dist...");
	}
	public void swimPound()
	{
		System.out.println("swim in river...");
	}

}
