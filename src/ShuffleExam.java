import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        Collections.shuffle(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
