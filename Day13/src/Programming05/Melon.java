package Programming05;

public class Melon extends Food{
	private String farmInfo;

	public Melon() {
		this(200, 5000, 100, "����");
	}
	
	public Melon(int calorie, int price, int weight, String farmInfo) {
		super(calorie, price, weight);
		this.farmInfo = farmInfo;
	}
	
	public String getFarmInfo() {
		return farmInfo;
	}

	public void setFarmInfo(String farmInfo) {
		this.farmInfo = farmInfo;
	}
	
	@Override
	public String toString() {
		return "Į�θ�: "+this.getCalorie()+", ����: "+this.getPrice()+", �߷�: "+this.getWeight()+", ���: "+this.getFarmInfo();
	}
}
