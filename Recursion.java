// Selma Sentissi El Idrissi 
import java.util.Scanner;
public class Recursion 
{
public static void main (String [] args)
{
	System.out.println("Enter an expression to test");
	Scanner console = new Scanner (System.in);
	String expr = console.nextLine();
	
	if (isAPalindrome(expr))
	{
		System.out.println( expr + " is a palindrome"); 
	}
	else 
	{
		System.out.println( expr + " is not a palindrome");
	}	
}// end main 

public static  boolean isAPalindrome(String expr)
{
	int x = 0;
	int y = expr.length()-1;
	if (expr.length() < 2 ) return true;
	else if (expr.charAt(x) == expr.charAt(y))  
	{
	return isAPalindrome (expr.substring(1, y));
	}
	else
	{return  false;}
	
	
}// end isAPalindrome 
}// end recursion 
