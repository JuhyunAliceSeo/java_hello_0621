class Rectangle4{
	int width;
	private int height;
	
	public int getArea() {
		return width * height;
	}

	int getArea2() {
		return width * height;
	}
}
public class Java_07_hidden {

	public static void main(String[] args) {
		Rectangle4 rec= new Rectangle4();
		
		rec.width = -5;
		rec.getArea();
		rec.getArea2();

	}

}
