package programming02;

public class Pair <T> {
	private T item1;
	private T item2;
	
	public Pair(T t1, T t2) {
		setItem1(t1);
		setItem2(t2);
	}
	
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	
	public T getItem1() {
		return item1;
	}

	public T getItem2() {
		return item2;
	}

	public void setItem2(T item2) {
		this.item2 = item2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return item1+" "+item2;
	}
}
