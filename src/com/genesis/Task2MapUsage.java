package com.genesis;

import java.util.HashMap;

public class Task2MapUsage {

	public static void main(String[] args) {
		Project p1=new Project(1,"App1","comp1");
		Project p2=new Project(2,"App2","comp2");
		Project p3=new Project(3,"App3","comp3");
		Project p4=new Project(4,"App4","comp4");
		Project p5=new Project(5,"App5","comp5");
		
		Employee e1=new Employee(1, "n1", 8971, "des1", "dep1");
		Employee e2=new Employee(2, "n2", 8972, "des2", "dep2");
		Employee e3=new Employee(3, "n3", 8973, "des3", "dep3");
		Employee e4=new Employee(4, "n4", 8974, "des4", "dep4");
		Employee e5=new Employee(4, "n4", 8974, "des4", "dep4");
		
		HashMap<Employee, Project> hm=new HashMap<>();
		hm.put(e1, p1);
		hm.put(e2, p2);
		hm.put(e3, p5);
		hm.put(e4, p4);
		hm.put(e5, p5);
		
		for(Employee e:hm.keySet()) {
			System.out.println(e+" "+e.hashCode());
			System.out.println(hm.get(e));
			System.out.println();
		}
	}

}
