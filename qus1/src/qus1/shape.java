package qus1;
class Circle extends shape 
{
	public void getArea()
	{
		int r=10;
		double pi=3.14;
		double carea=pi*r*r;
		System.out.println("Area of circle is: "+carea);
	}
}
class Square extends shape
{
	public void getArea()
	{
		int side=16;
		int sarea=side*side;
		System.out.println("Area of Square is: "+sarea);
	}
}
public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle c=new Circle();
	     c.getArea();
	     Square s=new Square();
	     s.getArea();
	}

}
