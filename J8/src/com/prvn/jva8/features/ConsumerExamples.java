package com.prvn.jva8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerExamples {
  // consumer
  static Consumer<String> gradePrint = value -> System.out.println(value);


  // Predicate
  static Predicate<Integer> AGrade = i -> i >= 80;
  static Predicate<Integer> BGrade = i -> i >= 60;
  static Predicate<Integer> CGrade = i -> i >= 50;
  static Predicate<Integer> DGrade = i -> i >= 35;

  // Function
  static Function<Integer, String> calGrade = value -> {
    return AGrade.test(value) ? "A Grade"
        : (BGrade.test(value) ? "B Grade"
            : (CGrade.test(value) ? "C Grade" : (DGrade.test(value) ? "D Grade" : "Fail")));
  };


  public static void main(String[] args) {
    List<Integer> asList = Arrays.asList(39, 49, 33, 55, 78, 93, 88);
    for (Integer integer : asList) {
      gradePrint.accept(calGrade.apply(integer));
    }
  }
}
