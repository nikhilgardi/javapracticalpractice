package javapracticalpractice.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Print numbers 1–10 using stream
 */
public class InstreamPrintNumbers {

	public static void main(String[] args) {
		//System.out.println("Using Traditional Loop");

		IntStream.range(1, 10).forEach(System.out::println);
	}

}
