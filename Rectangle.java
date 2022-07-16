public class Rectangle implements IShape
{
	int width;
	int height;
	String color;
	public Rectangle(String color,int width,int height){
		this.color=color;
		this.width=width;
		this.height=height;
	}
	@Override
	public double calculateArea(){
		return this.height*this.width;
	}
	@Override
	public double calculatePerimeter(){
		return 2*(this.height+this.width);
	}
	@Override
	public void draw(){
		System.out.println("This is a Rectangle");
	}
	@Override
	public void draw(String message){
		System.out.println(message);
	}
	
}