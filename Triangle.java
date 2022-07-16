public class Triangle implements IShape{
	int base;
	int height;
	String color;
	public Triangle(String color,int base,int height){
		this.color=color;
		this.base=base;
		this.height=height;
	}

	@Override
	public double calculateArea(){
		return (this.base*this.height)/2;
	}
	@Override
	public double calculatePerimeter(){
		return ((base+height)+Math.sqrt(this.height^2+this.base^2));
	}
	@Override
	public void draw(){
		System.out.println("This is a Triangle");
	}
	@Override
	public void draw(String message){
		System.out.println(message);
	}
}