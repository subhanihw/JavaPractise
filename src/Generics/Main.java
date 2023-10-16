package Generics;

public class Main
{
    // To exclude something
    // Now this function only accepts data type of Numbers. Ex: Integer, short, byte, double, etc.
    public static<T extends Number> T exampleFunction(T value) {
        return value;
    }
    public static void main(String[] args) {
        CustomList<String> strings = new CustomList<>();
        strings.add("Naruto");
        strings.add("Sasuke");
        strings.add("Itachi");
        System.out.println(strings.remove("Sasuke"));
        System.out.println(strings);
        System.out.println(strings.get(0));

        System.out.println();
        System.out.println(exampleFunction(4));
        System.out.println(exampleFunction(4.05));
        System.out.println(exampleFunction(23.04f));
//        System.out.println(exampleFunction("Naruto")); // Raises Error


    }
}
