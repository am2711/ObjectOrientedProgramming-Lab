//Printing factorial of a number
class Factorial
{
	public static void main(String args[])
	{
	int num= Integer.parseInt(args[0]);
	for(int i=num-1;i>0;i--)
		num*=i;
	System.out.println("Factorial is "+num);
	}
}