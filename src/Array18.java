import java.util.Arrays;

public class Array18 {
    public static void main (String[] args) {
        int[] array = {5,4,3,2,1};

        Arrays.sort(array);

        int i = Arrays.binarySearch(array,4);
        System.out.println(i);

    }
}
