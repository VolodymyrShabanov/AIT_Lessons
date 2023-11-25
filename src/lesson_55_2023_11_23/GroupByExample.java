package lesson_55_2023_11_23;

import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Volodymyr Sh on 23.11.2023
 * project name: AIT_Lessons
 */
public class GroupByExample {
    public static void main(String[] args) {
        // Collectors.groupingBy

        // groupingBy(Function classifier) -> result == Map<K, List<T>>
        // groupingBy(Function classifier, Collector downstream)
//        group1();
//
//        group2();

        group3();


    }

    private static void group3() {
        List<Employee> employees = new ArrayList<>( List.of(
                new Employee("Petr", 2500, 23,"developer", "IT"),
                new Employee("Silvia", 1500, 22,"trainee", "IT"),
                new Employee("Stefan", 2500, 30,"PM", "IT"),
                new Employee("Olivia", 2700, 25,"manager", "Management"),
                new Employee("Sebastian", 3500, 25,"chef", "Management"),
                new Employee("Hanna", 1300, 25,"Cleaner", "Cleaning"),
                new Employee("John", 3200, 19,"chef", "IT")
        ));
        Map<String, List<Employee>> map1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(map1);

        Map<String, Set<Employee>> map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));
        System.out.println(map2);

        Map<String, Long> map3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(map3);

        Map<String, Double> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(map);

        Map<String, List<Integer>> map4 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getSalary, Collectors.toList())));
        System.out.println(map4);

        // statistics !!!
        IntSummaryStatistics statistics = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary));

        System.out.println("max: " + statistics.getMax());
        System.out.println("min: " + statistics.getMin());
        System.out.println("sum: " + statistics.getSum());
        System.out.println("count: " + statistics.getCount());
        System.out.println("toString: " + statistics.toString());



    }

    private static void group2() {
        File path = new File("src/lesson_55_2023_11_23/filesDir");
        Function<File, String> classifier = f -> f.getName().substring(f.getName().lastIndexOf(".") + 1);

        Map<String, List<File>> groupByExt = Arrays.stream(path.listFiles())
                .collect(Collectors.groupingBy(classifier));

        System.out.println(groupByExt);
    }

    private static void group1() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        Map<String, List<Integer>> map = integers.stream()
                .collect(Collectors.groupingBy(i -> (i % 2 == 0)? "even" : "odd"));

        System.out.println(map);
    }
}
