import java.util.*;

public class Reverse {

static int rev(int n) {

int digits = (int)(Math.log10(n)+1);
return helper(n,digits);

}

private static int helper(int n, int digits) {

if(n%10 == n) {
return n;
}

int rem = n%10;
return rem*(int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);

}

public static void main(String[] args) {
	System.out.println(rev(2346));
}

}


/*
Primary skills : Core Java, Hibernate, Struts2, AngulaJS, Node.js, JMS ,WSDL, Soap.
Secondary skills:  SpringMVC, SpringBoot, PL/SQL, JAX-WS, JAX-RS, JDBC, Maven, AWS sdk.
*/