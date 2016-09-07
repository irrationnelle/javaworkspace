package Programming02;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		Customer customer = new Customer();
		
		System.out.println(person.getName());
		System.out.println(person.getAddress());
		System.out.println(person.getPhoneNum());
		
		System.out.println(customer.getName());
		System.out.println(customer.getAddress());
		System.out.println(customer.getPhoneNum());
		System.out.println(customer.getCustomerNum());
		System.out.println(customer.getMileagePoint());
	}
}
