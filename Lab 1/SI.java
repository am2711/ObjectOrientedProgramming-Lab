//Calculating Simple Interest
class SI
{
	public static void main(String args[])
	{
	int p= Integer.parseInt(args[0]);
	double r=Double.parseDouble(args[1]);
	int t=Integer.parseInt(args[2]); 
	double SI=p*r*t/100;
	System.out.println("Simple Interest is: "+SI);
	}
}