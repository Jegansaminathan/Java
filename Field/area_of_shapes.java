/*Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle, and Square.



Use Quadrilateral as the superclass of the hierarchy. The instance variables of the Quadrilateral should be 
the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that instantiates objects
of your classes and outputs each object's area (except Quadrilateral)as shown in the sample output.

Input format
x-y coordinate pairs of the four endpoints of the Square

x-y coordinate pairs of the four endpoints of the Rectangle

x-y coordinate pairs of the four endpoints of the Parallelogram followed by height

x-y coordinate pairs of the four endpoints of the Trapezoid followed by height

Output format
Area of the Square

Area of the Rectangle

Area of the Parallelogram

Area of the Trapezoid

Sample testcases
Input 1
10 10 20 10 20 20 10 20
10 10 30 10 30 20 10 20
10 10 30 10 20 20 0 20 8
10 10 30 10 40 20 0 20 8
Output 1
Area of the Square is 100
Area of the Rectangle is 200
Area of the Parallelogram is 160
Area of the Trapezoid is 240
Input 2
10  10 12 12 25 25 30 30 10
12 12 20 20 30 30 12 12 20
20 20 30 40 40 20 20 20 10
10  10 12 12 25 25 30 30 10
Output 2
Area of the Square is 4
Area of the Rectangle is 160
Area of the Parallelogram is 160
Area of the Trapezoid is 420
*/

import java.util.Scanner;

class Quadrilateral{
	protected int x1,x2,x3,x4,y1,y2,y3,y4;
	protected void setCoordinate(int a,int b,int c,int d,int e,int f,int g,int h){
		x1=a;
		y1=b;
		x2=c;
		y2=d;
		x3=e;
		y3=f;
		x4=g;
		y4=h;
	}
}
class Square extends Quadrilateral
{
    Square(int a, int b, int c ,int d,int e, int f, int g, int h)
    {
        setCoordinate(a,b,c,d,e,f,g,h);
    }
    
        int area()
        {
            int d = (int)Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
            return d*d;
        }
      
    
}
class Rectangle extends Quadrilateral
{
    Rectangle(int a, int b, int c, int d, int e, int f, int g ,int h)
    {
        setCoordinate(a,b,c,d,e,f,g,h);
    }
        int area()
        {
            int d1 = (int)Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
            int d2 = (int)Math.sqrt((x1-x4)*(x1-x4) + (y1-y4)*(y1-y4));
            return d1*d2;
        }
    
}
class Trapezoid extends Quadrilateral
{
    int hei;
    Trapezoid(int a, int b, int c, int d, int e, int f, int g, int h,int he)
    {
       hei=he; 
    
        setCoordinate(a,b,c,d,e,f,g,h);
    }
        int area()
        {
            int d1 = (int)Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
            int d2 = (int)Math.sqrt((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4));
        
        return (int)((d1+d2)*hei)/2;
        }
    
}
class Parallelogram extends Quadrilateral
{
    int hei;
    Parallelogram(int a,int b,int c,int d,int e,int f,int g,int h,int he)
    {
        setCoordinate(a,b,c,d,e,f,g,h);
        hei=he;
    }
        int area()
        {
            int d = (int)Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
            return d * hei;
            
        }
    
}
class TestQuadrilateral{
	public static void main(String []args){
		Scanner sc =new Scanner (System.in);
		
		int sx1=sc.nextInt();
		int sy1=sc.nextInt();
		int sx2=sc.nextInt();
		int sy2=sc.nextInt();
		int sx3=sc.nextInt();
		int sy3=sc.nextInt();
		int sx4=sc.nextInt();
		int sy4=sc.nextInt();
		Square sq=new Square(sx1,sy1,sx2,sy2,sx3,sy3,sx4,sy4);
		
		System.out.println("Area of the Square is " + sq.area());
			int rx1=sc.nextInt();
		int ry1=sc.nextInt();
		int rx2=sc.nextInt();
		int ry2=sc.nextInt();
		int rx3=sc.nextInt();
		int ry3=sc.nextInt();
		int rx4=sc.nextInt();
		int ry4=sc.nextInt();
		Rectangle rec=new Rectangle(rx1,ry1,rx2,ry2,rx3,ry3,rx4,ry4);
		
		System.out.println("Area of the Rectangle is " + rec.area());
		int px1=sc.nextInt();
		int py1=sc.nextInt();
		int px2=sc.nextInt();
		int py2=sc.nextInt();
		int px3=sc.nextInt();
		int py3=sc.nextInt();
		int px4=sc.nextInt();
		int py4=sc.nextInt();
		int ph=sc.nextInt();
		Parallelogram p=new Parallelogram(px1,py1,px2,py2,px3,py3,px4,py4,ph);
		System.out.println("Area of the Parallelogram is " + p.area());
		
			int tx1=sc.nextInt();
		int ty1=sc.nextInt();
		int tx2=sc.nextInt();
		int ty2=sc.nextInt();
		int tx3=sc.nextInt();
		int ty3=sc.nextInt();
		int tx4=sc.nextInt();
		int ty4=sc.nextInt();
		int th=sc.nextInt();
		Trapezoid t=new Trapezoid(tx1,ty1,tx2,ty2,tx3,ty3,tx4,ty4,th);
		System.out.println("Area of the Trapezoid is " + t.area());
	}
}
