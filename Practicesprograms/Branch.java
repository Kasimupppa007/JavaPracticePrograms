class Branch 
{
	public static void ece(int i,int j)
	{
		int k;
		k = i+j;
		System.out.println(k);
	}
	public void eee(int i,int j)
	{
		int a = i+j;
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("hello B.tech are some branches...");
		ece(60,40);
		Branch d = new Branch();
		d.eee(60,40);

	}
}
