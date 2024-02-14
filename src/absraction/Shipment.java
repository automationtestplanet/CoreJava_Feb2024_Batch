package absraction;

abstract public class Shipment {

	String analysisName;
	String country;

	Shipment(String analysisName, String country) {
		this.analysisName = analysisName;
		this.country = country;
	}

	abstract void selectShipment();

}
