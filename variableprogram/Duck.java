/* WAP to create non static variables of different data type and access to
print in main method*/

class Duck 
{
	public char k = '&';
	public double j = 63.2;
	public static void main(String[] args) 
	{
		Duck math = new Duck(); 
		System.out.println(math.k);
		System.out.println(math.j);
		
	}
}
