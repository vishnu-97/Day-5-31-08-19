package com.genesis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

public class EmployeeMangement {
	private static ArrayList<Employee> ea=new ArrayList<>();
	private static HashMap<String, ArrayList<Employee>> h=new HashMap<>();
	private static int no=0;
	
	
//	Add Employee
	static void addEmployee(Employee e) {
		e.setEno(++no);
		ea.add(e);
		addToDepartment(e);
		System.out.println("Your Employee Id ="+e.getEno());
	}
	
//	View All Employees
	static void viewAllEmployees() {
		ListIterator<Employee> it=ea.listIterator();
		System.out.println("Employeeno   \tName \t\tSalary \tDesignation \tDepartment");
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e.getEno() + " \t\t" + e.getEname()+ " \t\t" + e.getSalary() + " \t" + e.getDesignation()+ " \t\t"+e.getDepartment());
		}
	}
	
//	Remove Employee
	static void removeEmployee(int id) {
		Employee e=searchEmployee(id);
		if(e!=null) {
			System.out.println(e.getEname()+" was removed");
			ea.remove(e);
		}
		else {
			System.out.println("Invalid EmployeeNo");
		}
	}
//Clear Data
	static void clearData() {
		ea.clear();
	}
	
//	Change Salary
	static void changeSalary(int id,int sal) {
		Employee e=searchEmployee(id);
		
		if(e!=null) {
			e.setSalary(sal);
			System.out.println(e.getEname()+" salary was changed");
				
		}
		else {
			System.out.println("Invalid EmployeeNo");
		}
		
	}
	
//	Search Employee
	static Employee searchEmployee(int id) {
		ListIterator<Employee> it=ea.listIterator();
		while(it.hasNext()) {
			Employee e=it.next();
			if(e.getEno()==id) {
				return e;
			}
			
		}
		return null;
	}
	
//	Get Departments
	static Set<String> getDepartments() {
		return h.keySet();
	}
//	add employee to department map
	static void addToDepartment(Employee e) {
		if(!h.containsKey(e.getDepartment().toLowerCase())) {
			h.put(e.getDepartment().toLowerCase(), new ArrayList<>());
		}
		h.get(e.getDepartment().toLowerCase()) .add(e);
	}
	
//	department search
	static void viewDepartmentWise(String dep) {
		System.out.println("Employeeno   \tName \t\tSalary \tDesignation \tDepartment");
		
		ListIterator<Employee> it=ea.listIterator();
		
		while(it.hasNext()) {
			Employee e=it.next();
			if(e.getDepartment().equals(dep.toLowerCase()))
				System.out.println(e.getEno() + " \t\t" + e.getEname()+ " \t\t" + e.getSalary() + " \t" + e.getDesignation()+ " \t\t"+e.getDepartment());
		}
		
	}

	public static void sortView(int o1) {
		switch(o1) {
			case 1:{
				Collections.sort(ea);
				viewAllEmployees();
				break;
			}
			case 2:{
				ea.sort(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						return o2.getEno()-o1.getEno();
					}
					
				});
				viewAllEmployees();
				break;
			}
			case 3:{
				ea.sort(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						return o1.getSalary()-o2.getSalary();
					}
					
				});
				viewAllEmployees();
				break;
			}
			case 4:{
				ea.sort(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						return o2.getSalary()-o1.getSalary();
					}
					
				});
				viewAllEmployees();
				break;
			}
			case 5:{
				ea.sort(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						return o1.getDepartment().compareToIgnoreCase(o2.getDepartment());
					}
					
				});viewAllEmployees();
				break;
			}
			case 6:{
				ea.sort(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						return o2.getDepartment().compareToIgnoreCase(o1.getDepartment());
					}
					
				});viewAllEmployees();
				break;
			}
			case 7:{
				ea.sort(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						return o1.getDesignation().compareToIgnoreCase(o2.getDesignation());
					}
					
				});viewAllEmployees();
				break;
			}
			case 8:{
				ea.sort(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						return o2.getDesignation().compareToIgnoreCase(o1.getDesignation());
					}
					
				});viewAllEmployees();
				break;
			}
			default:{
				System.out.println("Invalid sortby choice ");
			}
	
		}
	}
}
