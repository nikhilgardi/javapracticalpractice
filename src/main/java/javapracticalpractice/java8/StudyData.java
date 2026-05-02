package javapracticalpractice.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudyData {

	public static void main(String[] args) {
		// System.out.println("Using Traditional Loop");

		for (int i = 1; i <= 10; i++) {
			// System.out.print(i + "\t");
		}

		/*
		 * INTSTREAM A Java 8 stream specialized for primitive int values Part of
		 * java.util.stream package Used to process sequences of integers in a
		 * functional way (Used to handle a list of numbers using functions like filter,
		 * map, and sum instead of loops.) Avoids boxing/unboxing of Integer objects for
		 * better performance Supports operations like filter, map, reduce, sum, count,
		 * etc.
		 */

		/*
		 * Types of functions in IntStream (Java 8) Creation → range(), rangeClosed(),
		 * of() Intermediate operations → filter(), map(), sorted(), distinct() Terminal
		 * operations → forEach(), sum(), count(), max(), min(), average() Special
		 * operations → boxed() (convert to Stream<Integer>) Short-circuit operations →
		 * findFirst(), findAny(), anyMatch(), allMatch()
		 */

		// System.out.println("\nUsing Java 8 Stream");
		// System.out::println is a method reference that means “call
		// System.out.println(x) for each value.”
		/*
		 * System.out → standard output stream (console) println → method that prints a
		 * * value with newline :: → method reference operator (shortcut for lambda)
		 */

		/*
		 * ::println advantage (method reference) Shorter and cleaner code More readable
		 * for simple operations Avoids writing unnecessary lambda (x ->
		 * System.out.println(x)) Directly reuses existing method without extra syntax
		 */

		IntStream.rangeClosed(1, 10).forEach(System.out::println);

		// IntStream.rangeClosed(1, 10).forEach(n -> System.out.print(n + "\t"));

		String result = IntStream.rangeClosed(1, 10).mapToObj(String::valueOf).collect(Collectors.joining(" "));
		// System.out.println(result);

		// range & rangeClosed
		IntStream.range(1, 5).forEach(n -> System.out.print(n + " "));
		// System.out.println();

		IntStream.rangeClosed(1, 5).forEach(n -> System.out.print(n + " "));
		// System.out.println();

		// filter (even numbers)
		IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
		// System.out.println();

		// map (square)
		IntStream.rangeClosed(1, 5).map(n -> n * n).forEach(n -> System.out.print(n + " "));
		// System.out.println();

		// sum
		int sum = IntStream.rangeClosed(1, 5).sum();
		// System.out.println("Sum: " + sum);

		// average
		// System.out.println("Average: " + IntStream.rangeClosed(1,
		// 5).average().getAsDouble());

		// max & min
		// System.out.println("Max: " + IntStream.rangeClosed(1, 5).max().getAsInt());
		// System.out.println("Min: " + IntStream.rangeClosed(1, 5).min().getAsInt());

		// count
		// System.out.println("Count: " + IntStream.rangeClosed(1, 5).count());

		// Here’s a small example for each type of IntStream function (Java 8):

		// 1. Creation → range(), rangeClosed(), of()
		IntStream.range(1, 5).forEach(System.out::print);
		
		IntStream.rangeClosed(1, 5).forEach(System.out::print);
		
		IntStream.of(1, 2, 3).forEach(System.out::print);
		
		// 2. Intermediate → filter(), map(), sorted(), distinct()
		IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).forEach(System.out::print);
		
		IntStream.rangeClosed(1, 5).map(n -> n * 2).forEach(System.out::print);
		
		IntStream.of(5, 2, 8, 2).sorted().forEach(System.out::print);
		
		IntStream.of(1, 2, 2, 3).distinct().forEach(System.out::print);
		
		// 3. Terminal → forEach(), sum(), count(), max(), min(), average()
		IntStream.rangeClosed(1, 5).forEach(System.out::print);
		
		System.out.println(IntStream.rangeClosed(1, 5).sum());
		
		System.out.println(IntStream.rangeClosed(1, 5).count());
		
		System.out.println(IntStream.rangeClosed(1, 5).max().getAsInt());
		
		System.out.println(IntStream.rangeClosed(1, 5).min().getAsInt());
		
		System.out.println(IntStream.rangeClosed(1, 5).average().getAsDouble());
		
		// 4. Special → boxed()
		IntStream.rangeClosed(1, 5).boxed().forEach(System.out::println);
		
		// 5. Short-circuit → findFirst(), findAny(), anyMatch(), allMatch()		
		System.out.println(IntStream.rangeClosed(1, 5).findFirst().getAsInt());
		
		System.out.println(IntStream.rangeClosed(1, 5).findAny().getAsInt());
		
		System.out.println(IntStream.rangeClosed(1, 5).anyMatch(n -> n > 3));
		
		System.out.println(IntStream.rangeClosed(1, 5).allMatch(n -> n > 0));
		
		/*In simple terms:
			forEach() → order not guaranteed
			forEachOrdered() → order guaranteed (sequential output)*/
		
		IntStream.range(1, 10).forEach(System.out::println);
		
		IntStream.range(1, 20).forEachOrdered(System.out::println);
		
	}

}
