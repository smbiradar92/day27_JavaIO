package EmployeePayRoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {

	enum IOStream {
		CONSOLE_IO, FILE_IO, DATABASE_IO, REST_IO
	}

	List<Employee> employeeList;
	IOStream iostream;

	public EmployeePayRollService() {
		employeeList = new ArrayList<>();
		iostream = IOStream.CONSOLE_IO;

	}

	public static void main(String[] args) {

		System.out.println(
				"Welcome to Employee payroll service");

		EmployeePayRollService service = new EmployeePayRollService();
		Scanner sc = new Scanner(System.in);

		if (service.iostream.equals(IOStream.CONSOLE_IO)) {
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Plz select from below options to proceed \n1. Add Employee \t2. print emp list \t3.exit");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					service.readEmployeeData(sc);

					break;
				case 2:
					service.writeEmployeeDataFromConsole();
					break;
				case 3:
					option = 3;
					System.out.println(
							"you are successfully exited");
					break;
				default:
					System.out.println("Invalid input");
				}
			}
		}
		sc.close();
	}

	public void readEmployeeData(Scanner consoleScanner) {

		Employee emp = new Employee();
		int id = (int) (Math.random() * 900 + 100);
		emp.setId(id);
		System.out
				.println(" Please enter the employee name");
		emp.setName(consoleScanner.next());
		System.out.println(
				"Please enter the employee salary");
		emp.setSalary(consoleScanner.nextDouble());

		employeeList.add(emp);
	}

	public void writeEmployeeDataFromConsole() {
		System.out.println(employeeList);

	}
}
