class  Fee 
{
	public static int studyFee(int i)
	{
		int j =i;
		System.out.println("Study fee for every year in student = "+j);
		return j;
	}
	public  double examFee(int i,double j)
	{
		double  k;
		k=i+j;
		System.out.println("Exam fee and software training fee = "+k);
		return k;
	}

	public static void main(String[] args) 
	{
		System.out.println("College fee from goverment....");
		int a=studyFee(35000);
		Fee d = new Fee();
		double b = d.examFee(1600,10000.23);
	}
}
