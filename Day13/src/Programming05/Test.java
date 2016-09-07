package Programming05;

public class Test {
	public static void main(String[] args) {
		Food food = new Food();
		
		Melon melon = new Melon();
		
		System.out.println(food.getCalorie());
		System.out.println(food.getPrice());
		System.out.println(food.getWeight());
		
		System.out.println();
		
		System.out.println(melon);
	}
}
