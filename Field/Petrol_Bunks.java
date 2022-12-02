/*Mr. Rahul is driving his car from his home to office with "X" liters of petrol. There are "N" number of petrol bunks between his home and office, with only limited capacity of petrol and each petrol bunk is located in different places. For every one km, one liter of petrol will be consumed. So he fills up petrol tank in each petrol bunks. Help him to calculate whether the remaining liters of petrol is enough to reach the upcoming destination. If the tank is empty before reaching destination, print the message "You are not able to travel". Otherwise If he reaches the office, print the remaining liters of petrol in the tank.

Input format
First line should contain petrol in car.

Second line contains number of petrol bunks between home and office.

Third line contains limited capacity of petrol in each petrol bunk separated by space.

Fourth line contains distance between each petrol bunk separated by space.

Output format
If the tank is empty before reaching destination, print the message "You are not able to travel". Otherwise, If he reaches the office, print the remaining litres of petrol in the tank.

Sample testcases
Input 1
2
3
6 4 2
1 5 3
Output 1
Remaining petrol in car: 5
Input 2
2
4
5 7 2 4
8 4 5 7
Output 2
You are not able to travel
*/
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n,flag=0,petrol_in_car;
        petrol_in_car=in.nextInt();
        if(petrol_in_car==0){
            System.out.println("You are not able to travel");
            flag=1;
        }
        if(flag==0){
        n=in.nextInt();
        int petrol[]=new int[n];
        int distance[]=new int[n];
        for(int i=0;i<n;i++){
            petrol[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            distance[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            petrol_in_car=petrol_in_car - distance[i];
            if(petrol_in_car<0){
                System.out.println("You are not able to travel");
                break; 
            }else{
               petrol_in_car=petrol_in_car+petrol[i];
            }
        }
        if(petrol_in_car>=0){
            System.out.println("Remaining petrol in car: "+petrol_in_car);
        }
        }
    }
}
