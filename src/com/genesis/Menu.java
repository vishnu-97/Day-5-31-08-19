package com.genesis;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Menu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("\n\nPlease Enter" + "\n1.Add Employee" + "\n2.View All Employees"
					+ "\n3.Remove Employee" + "\n4.Clear Data" + "\n5.Change Salary" + "\n6.Search Employee"
					+ "\n7.View Depart" + "\n8.Sort and view" + "\n9.Exit");
			int o = 0;
			try {
				o = in.nextInt();

				switch (o) {
				case 1: {
					in.nextLine();
					System.out.print("Name=");
					String n = in.nextLine();
					System.out.print("Salary=");
					int s = in.nextInt();
					in.nextLine();

					System.out.print("Designation=");
					String des = in.nextLine();
					System.out.print("Department=");
					String dep = in.nextLine();
					EmployeeMangement.addEmployee(new Employee(n, s, des, dep));
					break;
				}
				case 2: {
					EmployeeMangement.viewAllEmployees();
					break;
				}
				case 3: {
					System.out.print("EmployeeNo=");
					int id = in.nextInt();
					EmployeeMangement.removeEmployee(id);
					break;
				}
				case 4: {
					EmployeeMangement.clearData();
					break;
				}
				case 5: {
					System.out.print("EmployeeNo=");
					int id = in.nextInt();
					System.out.print("Salary=");
					int sal = in.nextInt();
					EmployeeMangement.changeSalary(id, sal);
					;
					break;
				}
				case 6: {
					System.out.print("EmployeeNo=");
					int id = in.nextInt();
					Employee e = EmployeeMangement.searchEmployee(id);
					if (e != null)
						System.out.println(e);
					break;
				}
				case 7: {

					System.out.println("Choose department=");
					Set<String> set = EmployeeMangement.getDepartments();
					for (String s : set) {
						System.out.println(s);
					}
					System.out.print("Department=");
					in.nextLine();

					String dep = in.nextLine();
					if (set.contains(dep))
						EmployeeMangement.viewDepartmentWise(dep);
					else
						System.out.println("Invalid Department");
					break;
				}
				case 8: {

					System.out.println("Choose sort by=" + "\n1.EmployeeNo ascending" + "\n2.EmployeeNo descending"
							+ "\n3.Salary ascending" + "\n4.Salary descending" + "\n5.Department ascending"
							+ "\n6.Department descending" + "\n7.designation ascending" + "\n8.designation descending");
					int o1 = in.nextInt();

					EmployeeMangement.sortView(o1);
					break;

				}
				case 9: {
					in.close();
					System.exit(0);
				}
				default: {
					System.out.println("Invalid choice ");
				}
				}
			} catch (InputMismatchException e1) {

				System.out.println("Invalid input try again...");
			}
		} while (true);
	}

}
