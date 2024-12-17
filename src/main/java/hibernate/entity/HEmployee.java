package hibernate.entity;

public class HEmployee {
private int id ;
private String name ;
private String gender ;
private int salary ;
public HEmployee() {
	super();
	// TODO Auto-generated constructor stub
}
public HEmployee(int id, String name, String gender, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "HEmployee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
}

}
