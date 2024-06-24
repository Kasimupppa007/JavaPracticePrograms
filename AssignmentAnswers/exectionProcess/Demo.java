mn/*Q1. WAP to create static variable ,non static variable ,local variable 
		and print the all the variables in the main method.*/


class Demo 
{
	public static void mul(int i,int j)
	{
		System.out.println(i*j);
	}
	public void mul(int i,double j)
	{
		System.out.println(i*j);
	}
	public static void main(String[] args) 
	{
		System.out.println("main start ....");
		mul(5,2);
		Demo s1 = new Demo();
		s1.mul(5,2.5);

	}
}
