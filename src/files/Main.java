package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get(".")).forEach(System.out::println);
        Files.walk(Paths.get("."), 3).forEach(System.out::println);
        Files.walk(Paths.get("."), 3)
                .filter(path -> String.valueOf(path).contains(".java"))
                .forEach(System.out::println);
        BiPredicate<Path, BasicFileAttributes> directoryMatcher = ((path, attributes) -> attributes.isDirectory());
        BiPredicate<Path, BasicFileAttributes> javaMatcher = ((path, attributes) -> String.valueOf(path).contains(".java"));
        Files.find(Paths.get(".//src"), 4, javaMatcher).forEach(System.out::println);
    }
}
