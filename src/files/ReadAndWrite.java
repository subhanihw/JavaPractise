package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./resources/data.txt");

//        List<String> lines = Files.readAllLines(path);
//        System.out.println(lines);

//        Files.lines(path).map(String::toLowerCase).filter(str -> str.contains("uchiha")).forEach(System.out::println);
        Path writePath = Paths.get("./resources/writeFile.txt");
        List<String> list =List.of("Naruto", "Sasuke", "Kakashi", "Itachi");
        Files.write(writePath, list);

    }
}
