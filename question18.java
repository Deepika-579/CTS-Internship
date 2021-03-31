class SwapWithoutThird
{
	public static void main(String[] args)
	{
		int x=10,y=5;
		System.out.println("values before swapping :"+x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("values after swapping :"+x+" "+y);
	}
}