public interface IShape {
	Renderer renderer = new Renderer();//since we are creating renderer object, output inside renderer will be displayed
	public void draw();
	public void draw(String message);
	
	public double calculateArea();
	public double calculatePerimeter();
	
}