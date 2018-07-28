package io.anirtek.java8;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Collections;

public class OptionalTester {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "apt", "New York", 500000));
		employees.add(new Employee(2, "nnt", "New York", 15000));
		employees.add(new Employee(3, "dct", "New York", 37117));
		employees.add(new Employee(4, "pct", "New York", 000));
		employees.add(new Employee(5, "vct", "New York", 000000));
		employees.add(new Employee(6, "pmtf", "New York", 000000));

		Collections.sort(employees, (e1, e2) -> e1.getSalary() - e2.getSalary());

		Optional<Employee> empOptional = Optional.empty();
		Optional<Employee> empOptional_2 = Optional.ofNullable(null);

		if (empOptional_2.isPresent()) {
			System.out.println(empOptional_2.get());
		}

		empOptional_2.ifPresent(emp -> System.out.println(emp));

		empOptional_2.ifPresent(System.out::println);

		Employee emp = empOptional_2.orElse(new Employee());
		Employee emp2 = empOptional_2.orElseThrow(() -> new RuntimeException("No default employee"));
	}

}
