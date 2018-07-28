package io.anirtek.java8;

import java.util.ArrayList;
import java.util.Collections;
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
		users.add(new User(3, "CAB", 312000));
		users.add(new User(4, "CBA", 7000));
		users.add(new User(5, "BAC", 2100));
		users.add(new User(6, "ACB", 50000));

		/**
		 * Sort the collection using lambda expression. N.B.: We do not have to provide
		 * the User type for u1 or u2 as compilers are smart enough to know that the
		 * sort() method has the Collection called `users`, therefore the expected
		 * comparator type is also `User`.
		 */
		Collections.sort(users, (u1, u2) -> u1.getSalary() - u2.getSalary());

		/**
		 * For each loop for Collections : single line logic
		 */
		users.forEach(each -> System.out.println(each.toString()));

		/**
		 * Creating a new thread using traditional way of implementing run() method
		 */
		Runnable thread_1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread_1 is running");
			}
		};

		new Thread(thread_1).start();

		/**
		 * Creating a new thread using anonymous function
		 */
		Runnable thread_2 = () -> {
			System.out.println("Thread_2 is also running");
			System.out.println("My owner is not James Gosling!");
		};
		new Thread(thread_2).start();
	}

}
