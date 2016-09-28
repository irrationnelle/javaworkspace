package programming01;

import java.util.ArrayList;

public class RandomList<T> {
	private T item;
	ArrayList<T> array = new  ArrayList<T>();
	
	public void add(T item) {
		array.add(item);
	}
	
	public T select() {
		return array.get((int)(Math.random()*10));
	}
}
