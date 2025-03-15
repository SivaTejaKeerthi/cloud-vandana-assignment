package Cloud_vandana2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	int id;
	String name;
	double salary;


	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public void displayDetails() {
		System.out.println("Employee ID: " + id);
		System.out.println("Name       : " + name);
		System.out.println("Salary     : " + salary);
		System.out.println("----------------------");
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee(1,"keerthi",23000.00);
		Employee emp2 = new Employee(2,"siva", 30000.98);
		Employee emp3 = new Employee(3,"teja", 17000);

		List<Employee> array_list = new ArrayList<Employee>();

		array_list.add(emp1);
		array_list.add(emp2);
		array_list.add(emp3);

		for(Employee emp: array_list) {
			emp.displayDetails();
		}
	}


}
