// B라는 사용자가 A라는 사용자가만든 ExceptionObj1을 이용한다.
public class Exception1 {
    public static void main(String[] args){
        ExceptionObj1 exobj = new ExceptionObj1();
        try {
            int value = exobj.divide(10, 0);
            System.out.println(value);
        }catch(ArithmeticException ex){
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}

