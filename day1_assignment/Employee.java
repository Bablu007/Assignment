package day1_assignment;

public class Employee {
private int id;
private String name;
private float salary;

public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}


@Override
public boolean equals(Object obj)
{
      
// if both the object references are 
// referring to the same object.
if(this == obj)
        return true;
      
    // it checks if the argument is of the 
    // type emp by comparing the classes 
    // of the passed argument and this object.
    // if(!(obj instanceof emp)) return false; ---> avoid.
    if(obj == null || obj.getClass()!= this.getClass())
        return false;
      
    // type casting of the argument. 
   Employee emp = (Employee) obj;
      
    // comparing the state of argument with 
    // the state of 'this' Object.
    return (emp.name.equals(this.name)  && emp.id == this.id &&emp.salary==this.salary);
}
  
@Override
public int hashCode()
{
    return this.id;
}
  

}
