package shapeCalc;

public class ShapeCalcController {
	
	private ShapeCalc shapeCalc;
	public ShapeCalcController() {
		this.shapeCalc = new ShapeCalc("Shape Calculator");
		this.shapeCalc.validate();
		this.shapeCalc.setVisible(true);
	}
	public static void main(String[] args) {
		new ShapeCalcController();
	}
	
	
	
}

