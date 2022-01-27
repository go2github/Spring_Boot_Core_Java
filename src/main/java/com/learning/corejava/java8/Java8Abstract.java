package com.learning.corejava.java8;//package org.hunting.interview;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//import com.workshop.java8.pojo.Employee;
//import com.workshop.java8.pojo.Item;
//import com.workshop.java8.pojo.User;
//import com.workshop.session.BankDatabase;
//
//public abstract class Java8Abstract {
//
//	public static void groupBy() {
//		// 3 apple, 2 banana, others 1
//		List<String> items = Arrays.asList("apple", "apple", "banana",
//				"apple", "orange", "banana", "papaya");
//		Map<String, Long> result = items.stream().collect(
//				Collectors.groupingBy(
//						Function.identity(), Collectors.counting()));
//
//		System.out.println(result);
//
//		// 3 apple, 2 banana, others 1
//		List<Item> items1 = Arrays.asList(
//				new Item("apple", 10, new BigDecimal("9.99")),
//				new Item("banana", 20, new BigDecimal("19.99")),
//				new Item("orang", 10, new BigDecimal("29.99")),
//				new Item("watermelon", 10, new BigDecimal("29.99")),
//				new Item("papaya", 20, new BigDecimal("9.99")),
//				new Item("apple", 10, new BigDecimal("9.99")),
//				new Item("banana", 10, new BigDecimal("19.99")),
//				new Item("apple", 20, new BigDecimal("9.99")));
//		Map<String, Long> mlist = items1.stream().collect(
//				Collectors.groupingBy(Item::getName, Collectors.counting()));
//
//		Set<Item> sList = items1.stream().collect(
//				Collectors.toSet());
//
//		Map<String, Item> maps = items1.stream().collect(
//				Collectors.toMap(Item::getName, Function.identity(), (o1, o2) -> {
//					return o1;
//				})
//
//		);
//
//		System.out.println(maps);
//
//	}
//
//	public static void dateApiExample() {
//		LocalDate localDate = LocalDate.now();
//		System.out.println(localDate);
//
//		LocalTime localTime = LocalTime.now();
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
//		System.out.println(dtf.format(localTime));
//
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now);
//	}
//
//	public static void sortedList() {
//		// List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a",
//		// "c");
//
//		// List<String>
//		// sortedList=list.stream().sorted(Comparator.reverseOrder()).toList();
//
//		// System.out.println(sortedList);
//
//		// List<User> users = Arrays.asList(
//		// new User("C", 30),
//		// new User("D", 40),
//		// new User("A", 10),
//		// new User("B", 20),
//		// new User("E", 50));
//
//		// List<User>
//		// sortedUserList=users.stream().sorted(Comparator.comparingInt(User::getAge)).toList();
//		// sortedUserList.forEach(System.out::println);
//	}
//
//	public static void mapExamples() {
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "linode.com");
//		map.put(2, "heroku.com");
//
//		String result = "";
//		for (Map.Entry<Integer, String> entry : map.entrySet()) {
//			if ("something".equals(entry.getValue())) {
//				result = entry.getValue();
//			}
//		}
//
//		map.entrySet().stream().forEach(o -> {
//			System.out.println(o.getValue());
//		});
//	}
//
//	public static void comparableExample() {
//
//		List<com.workshop.session.pojo.User> users = BankDatabase.getDataBaseValue();
//
//		for (com.workshop.session.pojo.User u : users) {
//			System.out.println(u.toString());
//		}
////		Collections.sort(users);
//
//		for (com.workshop.session.pojo.User u : users) {
//			System.out.println(u.toString());
//		}
//	}
//
//	public static void comparatorExample() {
////		List<Employee> list = Arrays.asList(new Employee(1, "A", "B", 34),
////				new Employee(4, "C", "D", 30),
////				new Employee(3, "B", "A", 31),
////				new Employee(2, "D", "C", 25));
////
////		Collections.sort(list,
////				new FirstNameSorter().thenComparing(new AgeSorter().thenComparing(new LastNameSorter())));
////		System.out.println(list.toString());
////
////		Collections.sort(list, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
//	}
//	public static void comparatorEx() {
//
//		List<com.workshop.session.pojo.User> user=BankDatabase.getDataBaseValue();
//
//
//		user.stream().sorted(new AgeSorter()).toList();
//	}
//	public static void sortHashMap() {
//		Map<String,Employee> map=new HashMap<>();
//
//		map.put("b", new Employee(4, "C", "D", 30));
//		map.put("a", new Employee(50, "A", "A", 30));
//		map.put("c", new Employee(5, "C", "D", 230));
//
//		List<Employee> list=map.values().stream().toList();
//
//		for(Employee e:list) {
//			System.out.println("testing "+e.getFirstName());
//		}
//
//		List<String> l1=map.keySet().stream().sorted().toList();
//
//		System.out.println(l1.toString());
//
////		Map<String,Employee> modifiedList=map.entrySet()
////				.stream()
////				.sorted(Map.Entry.comparingByValue())
////				.
//				Map<String, Employee> result = map.entrySet()
//				  .stream()
//				  .sorted(Map.Entry.comparingByValue())
//				  .collect(Collectors.toMap(
//				    Map.Entry::getKey,
//				    Map.Entry::getValue,
//				    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
//	}
//
//}
