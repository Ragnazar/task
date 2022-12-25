import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("John", "Michael", "Andrea", "Steve", "Nick","Yazid","Aaron"));
        System.out.println(names);

        names.replaceAll(s -> s.substring(1));
        System.out.println(names.stream().sorted().collect(Collectors.toList()));

    }
}
