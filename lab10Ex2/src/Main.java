import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    int[] ar2 = {4,1,3,2,16,9,10,14,8,7};
    Arrays.sort(ar2);
    System.out.println("Array-ul sortat crescator: " + Arrays.toString(ar2));
    int[] sortedDesc = Arrays.stream(ar2).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
    System.out.println("Array-ul sortat descrescator: " + Arrays.toString(sortedDesc));
    int[] squared = Arrays.stream(ar2).map(x -> x * x).toArray();
    System.out.println("Array-ul cu elementele ridicate la patrat: " + Arrays.toString(squared));
    }
}