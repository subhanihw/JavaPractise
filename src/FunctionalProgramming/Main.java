package FunctionalProgramming;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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
        return integer*integer;
    }
}

public class Main {
    public static void main(String[] args) {
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
        
        Predicate<Integer> evenPredicate = getIntegerPredicate();
        System.out.println(evenPredicate.test(10));
    }

    private static Predicate<Integer> getIntegerPredicate() {
        return n -> n % 2 == 0;
    }

    public static void printNumber(Integer num) {
        System.out.println(num);
    }
}
