class Multiplication  
{
	public static void mul(int i,int j)
	{
		System.out.println(i*j);
	}
	public void mul(double i,double j)
	{
		System.out.println(i*j);
	}
	private static double mul(int i,double j)
	{
		return i*j;
	}
	public int mul(int i,int j,int k)
	{
		return i*j*k;
	}
	public static void main(String[] args)
	{
		mul(5,6);
		Multiplication d1 = new Multiplication
		d1.mul(2.5,2.5);
		double a = mul(2,2.5);
		System.out.println(a);
		int b = d1.mul(5,2,5);
		System.out.println(b);
	}

}
