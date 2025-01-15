public class GenericBoxMain {
    public static void main(String[] args){
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.set(new Integer(5));
        Integer intValue = intBox.get();
        System.out.println(intValue);

        GenericBox<Object> objBox = new GenericBox<>();
        objBox.set("hello");
        String str2 = (String)objBox.get();
        System.out.println(str2);
    }
}
