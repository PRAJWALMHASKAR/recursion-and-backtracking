import  java.util.*;

public class recursion {

static int fact=1;

static int factorial(int i) {
	if(i>0)
	{
		fact = i*factorial(i-1);
		return fact;
	}
	else
		return 1;
}

public static void main (String[] args) {


System.out.println(factorial(0));

}

}