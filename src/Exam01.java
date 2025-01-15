public class Exam01 {
    public void main (String[] args){
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("---------------------------");
        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("---------------------------");
        Parent p2 = new Child(); // Child는 Parent의 후손이다. 혹은 자식이다.
        System.out.println(p2.i);

    }
}
