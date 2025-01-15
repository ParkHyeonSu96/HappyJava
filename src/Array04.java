public class Array04 {
    public static void main(String[] args) {
        ItemForArray[] array1;
        ItemForArray array2[];

        array1 = new ItemForArray[5];
        array2 = new ItemForArray[5];

        array1[0] = new ItemForArray(500, "item01");
        array1[1] = new ItemForArray(1000, "item02");

        ItemForArray i1 = new ItemForArray(500, "itemAAA");

        System.out.println(array1[0].getName());
        System.out.println(i1.getName());

        System.out.println(array1[2].getName());
    }
}
