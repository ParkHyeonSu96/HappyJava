import java.util.Arrays;
import java.util.Comparator;

public class Array172 {;
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("자바스크립트", 6000);
        items[4] = new Item("Dart", 2000);

        // sort(Object[]) - Object는 모든 객체의 조상이니깐, 어떤 객체의 배열이든 올 수 있다.
        // Arrays.sort(items. new ItemSorter());
        Arrays.sort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));

        for(Item item : items){
            System.out.println(item);
        }
    }
}

class ItemSorter implements Comparator {
    // o1 - o2
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item)o1;
        Item item2 = (Item)o2;
        return item1.getName().compareTo(item2.getName());
    }
}

// Comparable는 어떤 Item이 큰지, 작은지 기준을 정하는 interface
class Item implements Comparable{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    // compareTo에는 Object를 받아들이도록 했지만 실제로는 Item이 들어온다.
    // 홍길동, 고길동
//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item)o;
//        return this.name.compareTo(d.name);
//    }

    @Override
    public int compareTo(Object o) {
        Item d = (Item)o;
        return this.price - d.price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                 "name='" + name + '\'' +
                 ", price=" + price +
                 '}';
    }
}
