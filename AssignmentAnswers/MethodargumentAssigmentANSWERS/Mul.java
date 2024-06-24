/*Q2. WAPto create 2 methods.

		method1 : static method with 2 integer local variable,perform addition and return the results.
		method2 : non ststic with 2 doublee local variable ,perform subtraction and the result.
Call all the method from main method,recive the output from the method and 
perform multiplication using the output and print the multiplication output.*/


class Mull 
{
	public static int add()
	{
		int a=5,b=5,c;
		c=a+b;
		return c;
	}
	public double sub()
	{
		double a=4.0,b=2.0,m;
		m=a-b;
		return m;
	}
	public static void main(String[] args) 
	{
		int d=add();
		Mull m1 =new Mull();
		double e=m1.sub();
		double f;
		f=d*e;
		System.out.println(f);
	}
}
