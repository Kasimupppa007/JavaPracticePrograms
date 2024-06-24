/*non static with local variable inside the class*/
class  Sample
{
	public static void main(String[] args) 
	{
		System.out.println("main start...");
		Sample obj = new Sample();
		obj.jump();
		System.out.println("main end.....");
	}
	public  void jump()
	{
		System.out.println("jump from tree.....");
	}
}
 