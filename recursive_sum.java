import java.util.*;

public class recursive_sum {

public static void main (String [] args) {

System.out.println(sum(4));

}

static int sum (int n) {

	if(n==1)
		return 1;
	else return n+sum(n-1);

}

}