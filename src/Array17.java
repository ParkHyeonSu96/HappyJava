import java.util.Arrays;


public class Array17 {
    public static void main (String[] args) {
        int[] array = {5,4,3,2,1};

        Arrays.sort(array);

        for(int i : array){
            System.out.println(i);
        }
    }
}
