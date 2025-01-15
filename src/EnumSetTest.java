import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetTest {
    public static void main(String[] args){
        EnumSet eset = EnumSet.allOf(Day.class);

        Iterator<Day> dayIter = eset.iterator();

        while(dayIter.hasNext()) {
            Day day = dayIter.next();
            System.out.println(day);
        }
        System.out.println("---------------------------------");

        EnumSet eset2 = EnumSet.range(Day.MONDAY, Day.WEDNESDAY);
        Iterator<Day> dayIter2 = eset2.iterator();
        while(dayIter2.hasNext()){
            Day day = dayIter2.next();
            System.out.println(day);
        }

    }
}
