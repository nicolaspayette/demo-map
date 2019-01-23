import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class DemoMap {
  public static void main(String[] args) {

    List<Integer> xs = Arrays.asList(0, 5, 8, 3, 2, 1);
    List<Integer> ys = Arrays.asList(9, 4, 1, 6, 7, 8);

    // Using a for loop:
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < xs.size(); i++) {
      result.add(xs.get(i) + ys.get(i));
    }
    System.out.println(result);

    // Using map:
    System.out.println(IntStream.range(0, xs.size())
      .mapToObj(i -> xs.get(i) + ys.get(i))
      .collect(Collectors.toList()));
  }
}
