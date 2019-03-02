package com.prvn.jva8.features;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExamples {

	static Function<String, Integer> findLengthOfString = value -> value.length();
	static Function<Integer, Integer> calSquare = i -> i * i;
	static Function<String, String> replaceEmpty = str -> str.replaceAll(" ", "");
	static Function<String, Integer> findSpaces = str -> str.length() - str.replaceAll(" ", "").length();
	static Function<Integer, String> studentGrade = marks -> {
		return marks >= 80 ? "A Grade"
				: (marks >= 60 ? "B Grade" : (marks >= 50 ? "C Grade" : (marks >= 35 ? "D Grade" : "Failed")));
	};

	static Predicate<Integer> AGrade = marks -> marks >= 80;
	static Predicate<Integer> BGrade = marks -> marks >= 60;
	static Predicate<Integer> CGrade = marks -> marks >= 50;
	static Predicate<Integer> DGrade = marks -> marks >= 35;

	static Function<Integer, String> simplifyStudentGrade = marks -> {
		return AGrade.test(marks) ? "A Grade"
				: (BGrade.test(marks) ? "B Grade"
						: (CGrade.test(marks) ? "C Grade" : (DGrade.test(marks) ? "D Grade" : "Faile")));
	};

	static Function<String, String> toUpperCase = value -> {
		System.out.println("Upper case");
		return value.toUpperCase();
	};
	static Function<String, String> findFirst9Vlues = value -> {
		System.out.println("findFirst9");
		return value.substring(0, 9);
	};

	static Predicate<Function<String, String>> check = fun -> fun.apply("Sample").length() > 5;

	public static void main(String[] args) {

		System.out.println("Length of given String : " + findLengthOfString.apply("Hello World:"));
		System.out.println("Square of given Integer :" + calSquare.apply(23));
		System.out.println("Remove Spaces : " + replaceEmpty.apply("Hello LOL "));
		System.out.println("Spcaes Count : " + findSpaces.apply("Hello LOL "));
		System.out.println("Find Grade of Studenr : " + studentGrade.apply(85));
		System.out.println("Find Grade of Student : " + simplifyStudentGrade.apply(56));
		System.out.println("Function Chainig : " + toUpperCase.andThen(findFirst9Vlues).apply("HelloEveryOne"));
		System.out.println("Function Chainig : " + toUpperCase.compose(findFirst9Vlues).apply("HelloEveryOne"));
		System.out.println(replaceEmpty.andThen(toUpperCase).compose(findFirst9Vlues).apply("Check12343"));
		System.out.println("Test : " + check.test(toUpperCase));

	}

}
