package io.anirtek.java8;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

class Employee {
	private int id;
	private String name;
	private String city;
	private int salary;

	public Employee(int id, String name, String city, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

}

public class OptionalTester {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "apt", "New York", 500000));
		employees.add(new Employee(1, "nnt", "New York", 15000));
		employees.add(new Employee(1, "dct", "New York", 37117));
		employees.add(new Employee(1, "pct", "New York", 000));
		employees.add(new Employee(1, "vct", "New York", 000000));
		employees.add(new Employee(1, "pmtf", "New York", 000000));

		Optional<Employee> empOptional = Optional.empty();
		Optional<User> userOptional = Optional.of(new User(2, "abc", 90000));

		if (userOptional.isPresent()) {
			System.out.println(userOptional.get());
		}

		userOptional.ifPresent(user -> System.out.println(user));

		userOptional.ifPresent(System.out::println);
	}

}
