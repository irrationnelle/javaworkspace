package test07;

public class Test {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		try {
			for(int i=0; i<=array.length; i++) {
				System.out.println(array[i]+" ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("인덱스 i는 사용할 수 없습니다!");
		}
	}
}
