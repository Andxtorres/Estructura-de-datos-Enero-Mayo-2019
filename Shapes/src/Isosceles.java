
public class Isosceles extends Triangle {

	public Isosceles(String color, double longSide, double shortSide) {
		super(color, longSide,longSide,shortSide);

	}
	public double calculateArea() {
		double halfSide=getSide3()/2;
		double height=Math.sqrt(-(Math.pow(halfSide, 2))+(Math.pow(getSide1(), 2)));
		double area=(getSide3()*height)/2;
		return(area);
	}
	

}
