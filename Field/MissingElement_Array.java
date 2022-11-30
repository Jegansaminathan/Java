/*Given an unsorted array of unique integer in the range from 1 to n+1.
Find the missing element in the array.
sample output:
Input 1
5
6 4 3 2 1
Output 1
5
Input 2
15
4 6 5 7 3 1 2 9 8 10 12 15 14 13 16
Output 2
11
*/

import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int a =s.nextInt();
        int arr[]=new int [a];
        int temp=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    
                }
            }
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i] != i+1)
            {
                System.out.println(arr[i]-1);
                break;
            }
        }
    }
}
