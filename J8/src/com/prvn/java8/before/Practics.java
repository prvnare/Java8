package com.prvn.java8.before;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Practics {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(10, 20, 20, 30, 11, 17); // immutable List object

    // before JAVA 8 : Iterating List Using For loop
    System.out.println("Using for loop:");
    for (int i = 0; i < intList.size(); i++) {
      System.out.println(intList.get(i));
    }

    // Iterating List Using :Iterator
    System.out.println("Using Iterator:");
    Iterator<Integer> iterator = intList.iterator();
    while (iterator.hasNext()) {
      Integer integer = iterator.next();
      System.out.println(integer);
    }

    // Or

    for (Iterator<Integer> i = intList.iterator(); i.hasNext();) {
      System.out.println(i.next());
    }

    // Iterating List Using : For Each : Compiler will convert the for-each code into iterator
    // Code(19 -23 or 27-29)
    for (Integer integer : intList) {
      System.out.println(integer);
    }

    // In JAVA 8 : Iterating through list
    System.out.println("Using internal ForEach: ");
    intList.forEach(System.out::println);
  }
}
