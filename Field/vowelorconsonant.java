/*print the given character is consonant or vowel 
input:
j
output
j :consonant
*/

import java.util.*;
class main
{
    public static void main(String args[])
    {
    char a;
    Scanner s=new Scanner(System.in);
    a=s.next().charAt(0);
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
    {
        System.out.println(a+" :vowel");
    }
    else
    {
        System.out.println(a+" :consonant");
    }
        
    }
}
