package factory;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Figure shapeOne = shapeFactory.getShape("Circle");
		shapeOne.draw();
		
		Figure shapeTwo = shapeFactory.getShape("Rectangle");
		shapeTwo.draw();
		
		Figure shapeThree = shapeFactory.getShape("Square");
		shapeThree.draw();
	}
}