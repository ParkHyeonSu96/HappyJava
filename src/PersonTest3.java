public class PersonTest3 {
    public static void main(String[] args){
        System.out.println(Person.count);
        Person.printCount();

        Person p1 = new Person();
        p1.name = "홍길동";

        System.out.println(p1.name);
        p1.printName();
    }
}
