package encapsulation;

public class EncapsTest {

	public static void main(String[] args) {
		
		EncapsDemo obj = new EncapsDemo();
		obj.setEmpAge(40);
		obj.setEmpID(123);
		obj.setEmpName("chaitanya");
		
		System.out.println("Employee Name : " + obj.getEmpName());
		System.out.println("Employee Age : " + obj.getEmpAge());
		System.out.println("Employee ID :" + obj.getEmpID());
	}

}
