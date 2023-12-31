package FunctionalProgramming;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class PalindromePredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer num) {
        String number = num.toString();
        int reverseNumber = Integer.parseInt(new StringBuilder(number).reverse().toString());
        return reverseNumber == num;
    }
}

class PrintOutConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

class NumberSquare implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * integer;
    }
}

class Student {
    private String name;
    private String branch;
    private double grade;

    public Student(String name, String branch, double grade) {
        this.name = name;
        this.branch = branch;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", grade=" + grade +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
//        List<String> list = new ArrayList<>(List.of("Naruto", "Kakashi", "Itachi"));
//        // Basic method to print
//        for (String ele: list) {
//            System.out.println(ele);
//        }
//
//        // Using Streams
//        list.stream().forEach(System.out::println);
//        list.stream().filter(ele -> ele.endsWith("hi")).forEach(System.out::println);
//
//        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5, -1,5,3));
//        numbers.stream().filter(ele -> ele % 2 == 0).forEach(System.out::println);
//        int sum = numbers.stream().filter(ele -> ele % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
//        System.out.println(sum);
//
//        numbers.stream().sorted().forEach(System.out::println);
//        System.out.println(numbers);
//        numbers.stream().distinct().sorted().forEach(System.out::println);
//        numbers.stream().distinct().map(e -> e*e).forEach(System.out::println);
//        System.out.println(numbers);
//        IntStream.range(1, 11).map(e->e*e).forEach(System.out::println);
//
//        List<Integer> hundredNumbers = IntStream.range(1, 101).boxed().toList();
//        System.out.println(hundredNumbers);
//        int max = Stream.of(23,45,-100,100,5,4,32).max(Integer::compare).get();
//        int min = Stream.of(23,45,-100,100,5,4,32).min(Integer::compare).get();
//        System.out.println(max);
//        System.out.println(min);
//
//        List<String> chars =
//                Arrays.asList("Naruto", "Kakashi", "Itachi");
//        List<String> uppers = chars.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
//        List<String> lowers = chars.stream().map(String::toLowerCase).collect(Collectors.toList());
//        List<String> namesEndsWithHI = chars.stream().filter(str -> str.endsWith("hi")).collect(Collectors.toList());
//        System.out.println(uppers);
//        System.out.println(lowers);
//        System.out.println(namesEndsWithHI);
//
//        Stream.of(23,49,7,1222,12).filter(n->n%2==0).max(Integer::compare).ifPresent(System.out::println);
//        Optional<Integer> optional = Stream.of(23,49,7,1223,123).filter(n->n%2==0).max(Integer::compare);
//        System.out.println(optional.isPresent());
//
//        Stream.of(121, 109, 101, 343, 876, 678, 1, 10, 1001)
//                .filter(new PalindromePredicate())
//                .forEach(new PrintOutConsumer());
//
//        Stream.of(1,2,3,4,5,6)
//                .map(new NumberSquare())
//                .forEach(Main::printNumber);
//        Predicate<Integer> evenPredicate = getIntegerPredicate();
//        System.out.println(evenPredicate.test(10));
//        Predicate<Integer> evenPredicate2 = n -> n % 2 == 0;
//        Stream.of(1,2,3,4,5,6).filter(evenPredicate2.negate()).forEach(System.out::println);
//        Stream.of(1,2,3,4,5,6).filter(Predicate.not(Main::isEven)).forEach(System.out::println);
//        Supplier<Integer> randomIntSupplier = () -> 1 + (int)(Math.random() * (100));
//        System.out.println(randomIntSupplier.get());
//        UnaryOperator<Integer> unaryOperator = (x) -> 2 * x;
//        System.out.println(unaryOperator.apply(10));
//        BiPredicate<Integer, String> biPredicate = (number, str) -> number < 10 && str.length() > 5;
//        System.out.println(biPredicate.test(8, "naruto"));
//        BiFunction<Integer, String, String> biFunction = (number, str) -> number + " " + str;
//        System.out.println(biFunction.apply(2, "Two"));
//        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + " " + s2);
//        biConsumer.accept("Naruto", "Uzumaki");
//
//        List<Student> students = new ArrayList<>(List.of(
//                                         new Student("Naruto", "CSE", 7.5),
//                                         new Student("Sasuke", "ECE", 9.5),
//                                         new Student("Kakashi", "ECE", 9.8),
//                                         new Student("Itachi", "CSE", 9.8)));
//
//        System.out.println(students.stream().anyMatch(student -> student.getGrade() > 9.0));
//        System.out.println(students.stream().allMatch(student -> student.getGrade() > 9.0));
//        System.out.println(students.stream().noneMatch(student -> student.getGrade() < 7.0));
//
//        Comparator<Student> comparingByGPAIncreasing = Comparator.comparing(Student::getGrade);
//        Comparator<Student> comparingByGPADecreasing = Comparator.comparing(Student::getGrade).reversed();
//        Comparator<Student> comparingByGpaAndName = Comparator.comparing(Student::getGrade).thenComparing(Student::getName);
//
//        Collections.sort(students, comparingByGPAIncreasing);
//        System.out.println(students);
//
//        System.out.println(students.stream().sorted(comparingByGPAIncreasing).collect(Collectors.toList()));
//        System.out.println(students.stream().sorted(comparingByGPADecreasing).collect(Collectors.toList()));
//        System.out.println(students.stream().sorted(comparingByGpaAndName).collect(Collectors.toList()));
//
//        System.out.println(students.stream().limit(2).collect(Collectors.toList()));
//        System.out.println(students.stream().skip(2).collect(Collectors.toList()));
//
//        System.out.println(students);
//        System.out.println(students.stream().takeWhile(student -> student.getGrade() != 9.5).collect(Collectors.toList()));
//        System.out.println(students.stream().dropWhile(student -> student.getGrade() != 9.5).collect(Collectors.toList()));
//
//        System.out.println(students.stream().max(comparingByGpaAndName));
//
//        System.out.println(IntStream.range(1, 10).sum());
//        System.out.println(IntStream.rangeClosed(1, 10).sum());
//        System.out.println(IntStream.iterate(2, n -> n + 2).limit(10).peek(n -> System.out.print(n + " ")).sum());
//        List<Integer> integers = IntStream.iterate(2, n -> n + 2).limit(10).boxed().collect(Collectors.toList());
//        System.out.println(integers);
//        System.out.println(IntStream.rangeClosed(1, 20).reduce(1, (x,y) -> x*y));
//        System.out.println(LongStream.rangeClosed(1, 20).reduce(1L, (x,y) -> x*y));
//        System.out.println(LongStream.rangeClosed(1, 50).reduce(1L, (x,y) -> x*y));
//        System.out.println(LongStream.rangeClosed(1, 50)
//                                      .mapToObj(BigInteger::valueOf)
//                                      .reduce(BigInteger.ONE, BigInteger::multiply));
//        List<String> strings = List.of("Spring", "Spring Boot", "Java", "C++", "Docker", "Github");
//        String res = strings.stream().collect(Collectors.joining(","));
//        System.out.println(res);
//        System.out.println(strings.stream().map(string -> string.split("")).collect(Collectors.toList()));
//        System.out.println(strings.stream().map(string -> string.split(""))
//                                           .flatMap(Arrays::stream)
//                                           .collect(Collectors.toList()));
//        List<String> strings2 = List.of("Spring", "Spring Boot", "Java", "C++", "Docker", "Github");
//        System.out.println(strings.stream()
//                .flatMap(string -> strings2.stream().map(string2 -> List.of(string, string2)))
//                .collect(Collectors.toList()));
//        System.out.println(strings.stream()
//                .flatMap(string -> strings2.stream().map(string2 -> List.of(string, string2)))
//                .filter(list -> !list.get(0).equals(list.get(1)) && list.get(0).length() == list.get(1).length())
//                .collect(Collectors.toList()));
//
//        long startTime = System.currentTimeMillis();
//        System.out.println(LongStream.range(0, 100000000).sum()); // Took avg of 220 milliseconds
//        System.out.println(LongStream.range(0, 100000000).parallel().sum()); // Took avg of 50 milliseconds
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
//        List<String> courses = new ArrayList<>(strings2);
//        courses.replaceAll(String::toUpperCase);
//        courses.removeIf(str -> str.contains("C++"));
//        System.out.println(courses);
        Files.lines(Paths.get("./resources/data.txt"))
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    private static Predicate<Integer> getIntegerPredicate() {
        return n -> n % 2 == 0;
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void printNumber(Integer num) {
        System.out.println(num);
    }
}
