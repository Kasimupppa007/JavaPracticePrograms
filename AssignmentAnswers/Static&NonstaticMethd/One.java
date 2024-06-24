/* Q1. WAP to create 1 static variable and 1 non static variable of same data type ,
access to print in main method...*/
class One
{
	public static String name = "kasi";
	public String surName = "muppa";

	public static void main(String[] args) 
	{
		One k = new One();
		System.out.println(name);
		System.out.println(k.surName);
	}
}
