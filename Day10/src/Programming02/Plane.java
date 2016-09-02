package Programming02;

public class Plane {
	private String company;
	private String model;
	private int passengerMax;
	
	public static int planes = 0;

	public Plane(String company) {
		this.company = company;
		planes++;
	}

	public Plane(String company, String model) {
		this.company = company;
		this.model = model;
		planes++;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPassengerMax() {
		return passengerMax;
	}

	public void setPassengerMax(int passengerMax) {
		this.passengerMax = passengerMax;
	}
	
	public static int getPlanes() {
		return planes;
	}
}
