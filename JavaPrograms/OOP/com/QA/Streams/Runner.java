package com.QA.Streams;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class Runner {
	public static void main (String[] args) {
		//First exercise - return a list of strings with the world hello in front of all items except one:
		
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		List<String> newNames = names.stream()
				.map(i -> i == "James" ? i : "hello" + i)
				.collect(Collectors.toList());
		System.out.println(newNames.toString());
		
		
		//Second Exercise - reduce and print all numbers multiplied to each other
		List<Integer> num = Arrays.asList(3, 4, 7, 8, 12);
		int product = num.stream()
				.reduce ((a,b) -> a*b)
				.get();
		System.out.println(product);
		
		//Third Exercise:
		// Finds largest value is list
		List<Integer> numbers = Arrays.asList(2,5,2,4,7,8,10,13,12,4,6);
		int max = numbers.stream()
				.reduce(Integer::max)
				.get();
		System.out.println(max);
		//Finds smallest value in list
		int min = numbers.stream()
				.sorted()
				.findFirst()
				.get();
		System.out.println(min);
		// creates new list with only odd numbers
		List<Integer> oddNum = numbers.stream()
				.filter(x -> x % 2 == 1)
				.collect(Collectors.toList());
		System.out.println(oddNum.toString());
		//creates new list with only even numbers
		List<Integer> evenNum = numbers.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNum.toString());
		//finds the sum of all values
		int sum = numbers.stream()
				.reduce ((a,b) -> a+b)
				.get();
		System.out.println(sum);
	}
}
