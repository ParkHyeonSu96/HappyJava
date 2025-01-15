public class Car2Exam02 {
    public static void main(String[] args) {
        // Car2 c = new Car2("urstory");

        Bus2 b = new Bus2();
        b.run();

        SportsCar s1 = new SportsCar("sportsCar!!");
        s1.run();

        Car2 c = new SportsCar("sportsCar!!");
        c.run(); // 어떤 결과가 나올까요?

        Car2[] array = new Car2[2];
        array[0] = new Bus2();
        array[1] = new SportsCar("sportsCar!!");
        for(Car2 c2 : array){
            c2.run();
        }
    }
}

