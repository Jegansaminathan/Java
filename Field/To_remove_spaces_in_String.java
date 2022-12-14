/*Write a program to remove all the spaces in the given sentence.
Sample testcases 
Input 1 kite in the cloud 
Output 1 kiteinthecloud 
Input 2 networking 
Output 2 networking*/


import java.util.Scanner;

class Main
{
    public static void main(String []args)
    {
        Scanner s= new Scanner(System.in);
        String st=s.nextLine();
        st=st.replaceAll("\\s","");
        System.out.println(st);
    }
}
