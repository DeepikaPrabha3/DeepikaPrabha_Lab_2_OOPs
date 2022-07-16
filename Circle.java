public class Circle implements IShape{
	int radius;
	final double PI=3.14;
	String color;
	public Circle(String color,int radius){
		this.color=color;
		this.color=color;
		this.radius=radius;
	}
	@Override
	public double calculateArea(){
		return PI*this.radius*this.radius;
	}
	@Override
	public double calculatePerimeter(){
		return 2*PI*this.radius;
	}
	@Override
	public void draw(){
		System.out.println("This is a Circle");
	}

	@Override
	public void draw(String message){
		System.out.println(message);
	}

}