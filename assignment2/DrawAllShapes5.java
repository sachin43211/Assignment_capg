package capg.com.assignment2;

//Abstract class
abstract class Shape {
	//Abstract method
	public abstract void draw();
}

class Line extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Line Shape");
	}

}

class Rectangle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangles Shape");

	}

}

class Cubes extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Cube shape");
	}

}

public class DrawAllShapes5 {
  
	
	public static void main(String[] args) {
		
		Shape shapeline = new Line();
	
		shapeline.draw();

		Shape shapeRect = new Rectangle();
		shapeRect.draw();

		Shape shapeCube = new Cubes();
		shapeCube.draw();

	}

}
