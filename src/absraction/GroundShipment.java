package absraction;

public class GroundShipment extends Shipment{

	GroundShipment(String analysisName, String country) {
		super(analysisName, country);
	}

	@Override
	void selectShipment() {
		System.out.println("Click Ground Module Button");
	}
	
	public static void main(String[] args) {
		Shipment shipment1 = new GroundShipment("Ground Shipment", "Japan");
	}

}
