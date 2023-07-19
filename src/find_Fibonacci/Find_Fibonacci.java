package find_Fibonacci;

import java.util.Scanner;

/*
	The Fibonacci numbers are the numbers in the following integer sequence.
	
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
	
	In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:
	
	Fn = Fn-1 + Fn-2
	
	Given a number A, find and return the Ath Fibonacci Number using recursion.
	
	Given that F0 = 0 and F1 = 1.
	
	
	Input 1:
	A = 2
	
	Input 2:
	A = 9

	
	Output 1:
	1
	
	Output 2:
	34
 */
public class Find_Fibonacci {

	private static int fibonacci_number(int n) {		// 0-based indexing
		
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return fibonacci_number(n-1)+fibonacci_number(n-2);
		}		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(fibonacci_number(n));
		
	}
}
