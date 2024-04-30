import java.util.Arrays;
import java.util.stream.Collectors;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Integer[] array = {10, 5, 148, 21, 9};
        Arrays.sort(array, (a, b) -> b- a);
        for (Integer i : array) {
            System.out.println(i);
        }
        int sumReduce = Arrays.stream(array).reduce(0, (a, b) -> a + b);
        System.out.println(sumReduce);
        int sumSummingInt = Arrays.stream(array).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sumSummingInt);
        double average = Arrays.stream(array).collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(average);
        int min = Arrays.stream(array).min(Integer::compare).get();
        System.out.println(min);
        int max = Arrays.stream(array).max(Integer::compare).get();
        System.out.println(max);
        Integer[] filtered = Arrays.stream(array).filter(x -> x > 11).toArray(Integer[]::new);
        for (Integer i : filtered) {
            System.out.println(i);
        }

    }
}