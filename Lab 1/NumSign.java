//Calculating Sign of a number
class NumSign
{
	public static void main(String args[])
	{
		int pos=0,neg=0,zero=0;
		for(int i=0;i<10;i++)
			{
				if(Integer.parseInt(args[i])==0)
				zero++;
				else if(Integer.parseInt(args[i])>0)
				pos++;
				else if(Integer.parseInt(args[i])<0)
				neg++;
			}
		System.out.println("Number of Positives: "+ pos);
		System.out.println("Number of Negatives: "+ neg);
		System.out.println("Number of Zeroes: "+ zero);
	}
}