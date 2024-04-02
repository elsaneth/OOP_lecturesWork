import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Suits7 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("uks");
        words.add("kaks");
        words.add("kolm");

        String shortest = words.stream().min(Comparator.comparing(String::length)).get();

        System.out.println("Shortest: " + shortest);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(32);
        numbers.add(424);
        numbers.add(12);
        numbers.add(1);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(num -> num < 100)
                .map(num -> num % 10)
                .collect(Collectors.toList());

        System.out.println("Last numbers: " + filteredNumbers);

    }
}
