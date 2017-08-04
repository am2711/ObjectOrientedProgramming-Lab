//Calculating Average
class Average
{
	public static void main(String args[])
	{
		int sum=0;
		for(int i=0;i<5;i++)
				sum+=Integer.parseInt(args[i]);
		double avg=sum/5;
		System.out.println("Average is: "+ avg);
	}
}