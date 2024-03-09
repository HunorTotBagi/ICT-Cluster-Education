package factory;

public class ShapeFactory {
	public Figure getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}

		if (shapeType == "Circle") {
			return new Circle();
		} else if (shapeType == "Rectangle") {
			return new Rectangle();
		} else if (shapeType == "Square") {
			return new Square();
		}
		return null;
	}
}