package EmployeePayRoll;

public class Employee {

	int id;
	String name;
	double Salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name
				+ ", Salary=" + Salary + "]";
	}
	
	

}
