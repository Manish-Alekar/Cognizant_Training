package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		addNames(names);
		List<String> namesList = names.stream().filter(s ->s.length()>5).collect(Collectors.toList());
		namesList.forEach(System.out::println);
		
		List<String> namesUpper=names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		namesUpper.forEach(System.out::println);
		
		long count=names.parallelStream().count();
		System.out.println("List count is:"+count);
		Stream<Integer> data= Stream.of(1,11,111,1111,11111);
		System.out.println("Data count:"+data.count());
		
		List<String> defaultSorted = names.stream().sorted().collect(Collectors.toList());
		defaultSorted.forEach(System.out::println);
		
		List<String> customSorted = names.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		customSorted.forEach(System.out::println);
		
		
		Stream<String> languages=Stream.of("C","C++","Java","Python","Angular");
		List<String> lang= languages.filter(ss ->ss.length()>4).collect(Collectors.toList() );
		lang.forEach(System.out::println);
		
		
		Stream<String> language=Stream.of("C","C++","Java","Python","Angular");
		List<String> program=language.map(s -> s.concat(" programming")).collect(Collectors.toList());
		program.forEach(System.out::println);
	}
	
	
	private static void addNames(ArrayList<String> names)
	{
		names.add("Manish");
		names.add("Sanket");
		names.add("Nimish");
		names.add("Sanjay");
		names.add("Vijay");
		names.add("Sagar");
	}
}
