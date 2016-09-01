package Programming05;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setName("¼³Çö");
		e.setMobileNum("010-1234-5678");
		e.setSalary(500);
		
		System.out.println(e.getName());
		System.out.println(e.getMobileNum());
		System.out.println(e.getSalary());
	}
}
