public class Factorial
{
	public static void main(String[] args) 
	{
	    int n = 5;
	    int res = fact(n);
	    System.out.println("Factorial of "+n+" is "+res);
	}
	
	static int fact(int n)
	{
	    if(n == 0)
	    {
	        return 1;
	    }
	    else
	    {
	        return fact(n-1)*n;
	    }
	}
}