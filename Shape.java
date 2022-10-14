import java.util.Scanner ;
abstract class Shapes
{
	public int x, y ;
	public abstract void printArea() ;
	float area ;
}
class Rectangle extends Shapes
{
	public void printArea()
	{
		area = x * y ;
		System.out.println("Area of Rectangle is : " + area) ; 
	}
}
class Triangle extends Shapes
{
	public void printArea()
	{
		area = (x * y) / 2 ;
		System.out.println("Area of Triangle is : " + area) ;
	}
}
class Circle extends Shapes
{
	public void printArea()
	{
		area = (22 * x * x) / 7 ;
		System.out.println("Area of Circle is : " +  area) ;
	}
}
public class Shape
{
	public static void main(String [] array)
	{
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter Values : ") ;
		int x1 = s.nextInt() ;
		int y1 = s.nextInt() ; 	
		Rectangle r = new Rectangle() ;
		r.x = x1 ;
		r.y = y1 ;
		r.printArea() ;
		Triangle t =  new Triangle() ;
		t.x = x1 ;
		t.y = y1 ;
		t.printArea() ;
		Circle c = new Circle() ;
		c.x = x1 ;
		c.printArea() ;
	}
}