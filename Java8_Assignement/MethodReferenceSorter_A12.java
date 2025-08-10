package Java8_Assignement;


import java.util.*;

public class MethodReferenceSorter_A12 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zebra");
        names.add("Apple");
        names.add("Monkey");
        names.add("Elephant");
        names.add("Dog");

        names.sort(String::compareTo);
        names.forEach(System.out::println);
    }
}
