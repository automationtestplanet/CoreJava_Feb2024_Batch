package absraction;

public class InternationalShipment extends Shipment {

	InternationalShipment(String analysisName, String country) {
		super(analysisName, country);
	}

	@Override
	void selectShipment() {
		System.out.println("Click International Module Button");
	}

	public static void main(String[] args) {
		Shipment shipment1 = new InternationalShipment("International alysis", "Canada");
	}
}
