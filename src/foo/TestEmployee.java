package foo;

class CEO {
	
}
class Manager extends CEO {
	
}
class Employee extends Manager {
	
}

public class TestEmployee {
	public void calculateSalary(CEO obj) {
		if(obj instanceof Employee)
			System.out.println("Employee Salary is $5000");
		else if(obj instanceof Manager)
			System.out.println("Manager Salary is $9000");
		else if(obj instanceof CEO)
			System.out.println("Employee Salary is $12000");
	}
	public static void main(String[] args) {
		TestEmployee obj=new TestEmployee();
		obj.calculateSalary(new Manager());
	}

}
