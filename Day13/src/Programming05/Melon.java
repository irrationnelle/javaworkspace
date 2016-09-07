package Programming05;

public class Melon extends Food{
	private String farmInfo;

	public Melon() {
		this(200, 5000, 100, "서울");
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
		return "칼로리: "+this.getCalorie()+", 가격: "+this.getPrice()+", 중량: "+this.getWeight()+", 농원: "+this.getFarmInfo();
	}
}
