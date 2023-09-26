package definingOfClasses;

public class Battery {

	private String model;
	private int idelTime;
	private int hoursOfTalks;

	public Battery() {

	}

	public Battery(String model, int idelTime, int hoursOfTalks) {
		this.model = model;
		this.idelTime = idelTime;
		this.hoursOfTalks = hoursOfTalks;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getIdelTime() {
		return idelTime;
	}

	public void setIdelTime(int idelTime) {
		this.idelTime = idelTime;
	}

	public int getHoursOfTalks() {
		return hoursOfTalks;
	}

	public void setHoursOfTalks(int hoursOfTalks) {
		this.hoursOfTalks = hoursOfTalks;
	}

	@Override
	public String toString() {
		return  "model (" + model + ")" + ". Hours idel time (" + idelTime + "h)" 
	+ ". Hours of talks (" + hoursOfTalks + "h) " ;
	}

}
