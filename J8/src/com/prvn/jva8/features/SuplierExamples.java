package com.prvn.jva8.features;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

public class SuplierExamples {
  // Supplier returns Date Object;
  static Supplier<Date> getDate = () -> new Date();
  // Supplier returns Random Names from List;
  static Supplier<String> getRandomName = () -> {
    List<String> asList = Arrays.asList("Praveen", "Ram", "Ramesh", "Karan");
    return asList.get((int) (Math.random() * 4));
  };

  // Supplier can be used to work with some logic which takes nothing and returns something based on
  // logic
  public static void main(String[] args) {
    System.out.println(getDate.get());
    System.out.println(getRandomName.get());
  }
}
