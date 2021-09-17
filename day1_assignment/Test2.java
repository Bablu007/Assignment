package day1_assignment;

import java.util.ArrayList;
//Employee use Stream's map() method to get only employee ids and print using forEach

public class Test2 {

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
		    empData.stream().map(e->e.getId()).forEach(e->System.out.println(e));;
	}

}
