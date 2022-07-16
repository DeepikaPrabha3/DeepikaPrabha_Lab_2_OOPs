public class Square extends Rectangle{
	public Square(String color,int side){
		super(color,side,side);
	}

	@Override
	public void draw(){
		System.out.println("This is a "+super.color+" Square");
	}
	
}