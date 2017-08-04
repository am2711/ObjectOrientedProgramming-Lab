//Calculating the area of a rectangle
class AreaRectangle
{
	public static void main(String args[])
	{
		int len, breadth;
		len=Integer.parseInt(args[0]);			//Input Length
		breadth=Integer.parseInt(args[1]);		//Input Breadth
		int area=len*breadth;			//Calculating area
		int peri=2*(len+breadth);			//Calculating perimeter
		System.out.println("Area is "+area);		//Printing Result
		System.out.println("Perimeter is "+peri);		//Printing Result
	}
}