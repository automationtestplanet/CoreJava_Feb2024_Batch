package absraction;

public class DomesticShipment extends Shipment{

	DomesticShipment(String analysisName, String country) {
		super(analysisName, country);
	}

	@Override
	void selectShipment() {
		System.out.println("Click Domestic Module Button");
	}
	
	public static void main(String[] args) {
		Shipment shipment1 = new DomesticShipment("DomesticANalysis", "United States");
	}

}
