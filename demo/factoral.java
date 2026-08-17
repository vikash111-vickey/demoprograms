package demo;


public class factoral {
	void fact() 
	{
		    int n = 5;
	        int factorial = 1;

	        for (int i = 1; i <= n; i++) 
	        {
	            factorial = factorial * i;
	        }

	        System.out.println("Factorial = " + factorial);
	    }
	
    public static void main(String[] args) 
    {
    	factoral bb=new factoral();
    	bb.fact();
    }
}