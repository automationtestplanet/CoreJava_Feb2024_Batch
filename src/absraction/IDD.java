package absraction;

public class IDD extends Shipment{

	IDD(String analysisName, String country) {
		super(analysisName, country);
	}

	@Override
	void selectShipment() {
		System.out.println("Click IDD Module Button");
	}
	
	public static void main(String[] args) {
		Shipment shipment1 = new IDD("IDD ANalysis","Germany");
	}

}
