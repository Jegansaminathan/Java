/*
Boolean checkPrime(int a) - To check whether the given number is prime or not
Create a class Calculator and implement the AdvanceCalculator. Get one input from the user and check whether the given number is a prime number.

Input format
The input consists of an Integer

Output format
The Output should display whether the number is a Prime number or Not

Sample testcases
Input 1
6
Output 1
Not prime number
Input 2
277
Output 2
Prime number
*/

import java.util.Scanner;

interface AdvCalculator {
	
	public boolean checkPrime(int a);

}  
class Calculator implements AdvCalculator {
public int a;

public boolean checkPrime(int a) {
	
	boolean flag = false;
    for(int i = 2; i <= a/2; ++i) {
       if(a % i == 0)        {
            flag = true;
            break;
        }
    }
    if (!flag)
        return true;
    else
        return false;
	
}
}
class Main {

	   public static void main(String[] args) {
		   Scanner myObj = new Scanner(System.in);
		   int n = myObj.nextInt();
	     Calculator cal = new Calculator();
	
	     System.out.println(cal.checkPrime(n)?"Prime number":"Not prime number");
	    

	   }
	}
