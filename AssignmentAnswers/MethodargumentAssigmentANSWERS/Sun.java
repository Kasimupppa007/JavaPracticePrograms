/*Q1. WAP to create 3 methods.	
		
		method1 : static method with 3 different datatypes arguments,print all the arguments.
		method2 : non static with 2 same datatypes arguments,print all the arguments.
		method3 : static method with 1 argument of any datatype, print the argument.
Call all the methods from main method.*/

class  Sun
{
	public static void test1(int a,double b,boolean c)
	{
		System.out.println("morning time is "+a+" rises sun "+b+" this is "+c);
	}
	public void test2(String d,String e)
	{
		System.out.println("sun rises on "+d+"  sunries on "+e);
	}
	public static void test3(char m)
	{
		System.out.println(m);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main starting!.....");
		test1(10,2.5,true);
		Sun b1 = new Sun();
		b1.test2("east","north");
		test3('@');

		
		System.out.println("main ending!........");

	}
}
