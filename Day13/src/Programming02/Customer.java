package Programming02;

public class Customer extends Person {
	private int customerNum;
	private int mileagePoint;
	
	public Customer() {
		this("청하", "부산", "01098765432", 000, 10);
	}
	
	public Customer(String name, String address, String phoneNum, int customerNum, int mileagePoint) {
		super(name, address, phoneNum);
		this.customerNum = customerNum;
		this.mileagePoint = mileagePoint;
	}

	public int getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}

	public int getMileagePoint() {
		return mileagePoint;
	}

	public void setMileagePoint(int mileagePoint) {
		this.mileagePoint = mileagePoint;
	}
}
