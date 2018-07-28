package io.anirtek.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User {
	private int id;
	private String name;
	private int salary;

	public User(int id, String name, int salary) {
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class UserTester {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();

		users.add(new User(1, "ABC", 120000));
		users.add(new User(2, "BCA", 20000));
		users.add(new User(3, "CAB", 3000));
		users.add(new User(4, "CBA", 7000));
		users.add(new User(5, "BAC", 2100));
		users.add(new User(6, "ACB", 50000));

		/**
		 * Sort the collection traditionally - using Comparator interface
		 */
		Collections.sort(users, new Comparator<User>() {

			@Override
			public int compare(User u1, User u2) {
				return u1.getSalary() - u2.getSalary();
			}
		});
		
		for (User each : users) {
			System.out.println(each.toString());
		}
	}

}