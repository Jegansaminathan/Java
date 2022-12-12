/*Input format The first line of the input consists of the size of an array The next input is the elements of the array.
The Final line of the input consists of the index number to be searched.
Output format The output prints the value at the specified index. 
Or else, print the exception. Refer to the sample output for specifications.

Sample testcases
Input 1 5 12 13 34 21 16 3
Output 1 Value at 3 = 21
Input 2 3 12 15 21 5 
Output 2 Array index out of bound.*/

import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),count = 0;
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        int b=s.nextInt();
        try
        {
            if(b<=a-1){
           
                    System.out.print("Value at "+b+" = "+arr[b]);
                    
                }
              else{
                  throw new ArrayIndexOutOfBoundsException("Array index out of bound.");
            
        }}
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            
        }
    }
}
