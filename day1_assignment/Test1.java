package day1_assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//In Employee HashSet, make necessary code changes(in Employee class), so that duplicates are not stored.

public class Test1 {

	public static void main(String[] args) {
    ArrayList<Employee>empData=new ArrayList<Employee>();
    empData.add(new Employee(1,"Anshumaan",120));
    empData.add(new Employee(1,"Anshumaan",120));
    empData.add(new Employee(1,"Anshumaan",140));
    empData.add(new Employee(2,"Sachin",120));
    empData.add(new Employee(3,"Ravi",120));
    empData.add(new Employee(4,"Ashish",120));
    empData.add(new Employee(5,"Kamini",120));
    empData.add(new Employee(6,"Manish",120));
   /* for(int i=0;i<empData.size();i++) {
    	System.out.println(empData.get(i));
    }*/
    Iterator< Employee>itr=empData.iterator();
    while(itr.hasNext()) {
    	Employee emp=itr.next();
    	System.out.println(emp);
    }
    System.out.println("____________________");
    //Convert into HashSet
	HashSet<Employee> hs = new HashSet<>(empData);
	for(Employee emp:hs) {
		System.out.println(emp);
	}
	}

}
