class FirstLast
{
	public static void main(String[] args)
	{
		int a=12345,s=0;
		int k=a%10;
		int i=1;
	  while(i<5){
	  
	  a=a/10;
	  i++;
	  }
		System.out.println("Sum value: "+(k+a));
		
	}
}