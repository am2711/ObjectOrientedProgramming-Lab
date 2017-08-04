//Checking whether a number is Palindrome or not
class Palindrome
{
	public static void main(String args[])
	{
	int check= Integer.parseInt(args[0]);
	int num;
	num=check;
	int rev=0;
	while(num!=0)
	{
		rev=rev*10+num%10;
		num/=10;
	}

	if(check==rev)
	System.out.println("Number is a Palindrome");
	else
	System.out.println("Number is not Palindrome");
	}
}