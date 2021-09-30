package day3;
public class Test {

	public static void main(String[] args) {
		Customer c1 = new Customer(), c2 = new Customer();
		
		c1.acceptData("Hrishikesh","hrishikesh@gmail.com",23);
		c1.displayData();
		
		c2.acceptData();
		c2.displayData();

	}

}

