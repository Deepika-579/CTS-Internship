class SwapWithThird
{
	public static void main(String[] args)
	{
		int x=10,y=5;
		System.out.println("values before swapping :"+x+" "+y);
		int t;
		t=x;x=y;
		y=t;
		System.out.println("values after swapping :"+x+" "+y);
	}
}