package Programming06;

public class Phone {
	private String company;
	private int price;
	private String commuType;
	
	public Phone() {
		this("≥Î≈∞æ∆", 1000, "2G");
	}
	
	public Phone(String company, int price, String commuType) {
		this.setCompany(company);
		this.setPrice(price);
		this.setCommuType(commuType);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCommuType() {
		return commuType;
	}

	public void setCommuType(String commuType) {
		this.commuType = commuType;
	}

}
