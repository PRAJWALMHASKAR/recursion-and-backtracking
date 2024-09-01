class Factorial 
{
	int fact(int num)
	{
		if(num == 0)				// ====TERMINATION CONDITION IS IMPORTANT IN RECURSION====
			return 1;
		else
		return num*fact(num-1);	
	}
	public static void main(String[] args) 
	{
		System.out.println( (new Factorial()).fact(5) );
		for(String val : args)
		System.out.println(val); //   == COMMAND LINE ARGUMENTS ==
	}
}


/*



*/
