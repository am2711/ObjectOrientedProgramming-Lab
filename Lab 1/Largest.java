//Calculating Largest
class Largest
{
	public static void main(String args[])
	{
		int max=0;
		for(int i=0;i<5;i++)
		{
			int num=Integer.parseInt(args[i]);
			if (num>max)
			max=num;
		}
	System.out.println("Largest Number is: "+max);
	}
}