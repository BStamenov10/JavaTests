package definingOfClasses;
public class GSM {

	private String model;
	private String vendor;
	private double price;
	private String owner;
	private Battery batteryCharacteristics;
	private Display displayCharacteristics;

	private static String nokiaN95 = "Mобилен телефон модел Nokia 95";

	public GSM() {

	}

	public GSM(String model, String vendor, double price, String owner, Battery batteryCharacteristics,
			Display displayCharacteristics) {
		this.model = model;
		this.vendor = vendor;
		this.price = price;
		this.owner = owner;
		this.batteryCharacteristics = batteryCharacteristics;
		this.displayCharacteristics = displayCharacteristics;
	}

	public GSM(String model, String vendor, double price, String owner) {
		this(model, vendor, price, owner, null, null);
	}

	public GSM(String model, Battery batteryCharacteristics, Display displayCharacteristics) {
		this(model, null, 0.0, null, batteryCharacteristics, displayCharacteristics);
	}

	public static String getInfoNokia() {
		return nokiaN95;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Battery getBatteryCharacteristics() {
		return batteryCharacteristics;
	}

	public void setBatteryCharacteristics(Battery batteryCharacteristics) {
		this.batteryCharacteristics = batteryCharacteristics;
	}

	public Display getDisplayCharacteristics() {
		return displayCharacteristics;
	}

	public void setDisplayCharacteristics(Display displayCharacteristics) {
		this.displayCharacteristics = displayCharacteristics;
	}

	public void deleteCalls(Call call) {

	}

	@Override
	public String toString() {
		return "GSM model is:\n" + model + ", vendor is: " + vendor + ", and the price is (" + price + "$)"
				+ "\n\nThe owner is:\n" + owner + "\n\nThe characteristics of battery are:\n" + batteryCharacteristics
				+ "\n\nThe characteristics of the display are:\n" + displayCharacteristics + "\n";
	}

}
