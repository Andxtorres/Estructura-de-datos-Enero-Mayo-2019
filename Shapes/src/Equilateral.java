
public class Equilateral extends Triangle{
	
	public Equilateral(String color, double side) {
		super(color, side,side,side);
	}
	
	public double calculateArea() {
		double halfSide=getSide1()/2;
		double height=Math.sqrt(-(Math.pow(halfSide, 2))+(Math.pow(getSide1(), 2)));
		double area=(getSide1()*height)/2;
		return(area);
	}
}
