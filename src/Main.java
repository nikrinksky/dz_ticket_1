import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Masha", "Petya", "Nikolay", "Ivan", "Vasily");

        List<String> changedNames = names.stream()
                .map(name -> name.substring(1))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(changedNames);
    }
}