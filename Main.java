public class Main{

	public static void main(String args[]){

		Circle circle=new Circle("red",3);
		System.out.println("Area of Circle is "+circle.calculateArea());  
		System.out.println("Perimeter of the Circle is "+circle.calculatePerimeter());
		circle.renderer.draw();
		circle.renderer.draw("You are drawing a Circle...");

		Rectangle rect=new Rectangle("green",3,6);
		System.out.println("Area of Rectangle is "+rect.calculateArea());
		System.out.println("Perimeter of the Rectangle is "+rect.calculatePerimeter());
		rect.renderer.draw();
		rect.renderer.draw("You are drawing a rectangle...");

		Triangle tri=new Triangle("blue",3,5);
		System.out.println("Area of Triangle is "+tri.calculateArea());
		System.out.println("Perimeter of the Triangle is "+tri.calculatePerimeter());
		tri.renderer.draw();
		tri.renderer.draw("You are drawing a triangle...");

		Square square=new Square("yellow",3);
		System.out.println("Area of Square is "+square.calculateArea());
		System.out.println("Perimeter of the Square is "+square.calculatePerimeter());
		square.renderer.draw();
		square.renderer.draw("You are drawing a Square...");
	}
	
}