/*Assumption

n > 0

Example

Input

3245

Output

5

Explanation

3245 = 3 + 2 + 4 + 5 = 14

14 = 1 + 4 = 5

Hence 5 is the numerological reduction of 3245

Sample testcases
Input 1
3245
Output 1
5
Input 2
12345
Output 2
6*/

import java.util.*;
import java.lang.*;
class Main 
{
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(FindNumerologicalReduction(n));
    }
     public static int FindNumerologicalReduction(int n)
    {
        if (n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }
    }
    
