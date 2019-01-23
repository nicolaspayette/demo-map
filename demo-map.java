import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class DemoMap {
  public static void main(String[] args) {

    List<Integer> xs = Arrays.asList(0, 5, 8, 3, 2, 1);
    Function<Integer, Integer> f = x -> x + 1;

    // Using a for loop:
    List<Integer> result = new ArrayList<>();
    for (Integer x: xs) { result.add(f.apply(x)); }
    System.out.println(result);

    // Using map:
    System.out.println(
        xs.stream().map(f).collect(Collectors.toList()));
  }
}
