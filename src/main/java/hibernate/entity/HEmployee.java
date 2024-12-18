package hibernate.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity(name = "emp2")
public class HEmployee {
	@Id
	// auto incremet for id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	private String name;
	private String gender;
	@Column(name = "emp_sal")
	private int salary;
	@Transient
//transient annotation ka kaam hai ki kisi object ki value ko database me show nhi karana to use kr skte hai 
	private String company;

	public HEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HEmployee(int id,String name, String gender, int salary, String company) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.company = company;
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
