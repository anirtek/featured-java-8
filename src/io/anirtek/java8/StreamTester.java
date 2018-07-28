package io.anirtek.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTester {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();

		users.add(new User(1, "ABC", 120000));
		users.add(new User(2, "BCA", 20000));
		users.add(new User(3, "CAB", 312000));
		users.add(new User(4, "CBA", 7000));
		users.add(new User(5, "BAC", 2100));
		users.add(new User(6, "ACB", 50000));

		List<Integer> userIds = users.stream()
									 .filter(user -> user.getName().startsWith("A"))
									 .sorted((u1, u2) -> u1.getSalary() - u2.getSalary())
									 .map(user -> user.getId())
									 .collect(Collectors.toList());

		userIds.forEach(System.out::println);
	}

}
