import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HelloIo05 {
    public static void main(String[] args) throws Exception{
        // FileOutputStream은 "C:\\Users\\hyuns\\Desktop\\ParkHyunSu\\Study\\my.txt"에 저장한다.
        // FileOutputStream은 write(int); int의 마지막 byte만 저장
        // OutputStreamWriter생성자에 들어온 FileOutputStream의 write(int)를 이용하여 쓴다.
        // OutputStreamWriter는 write(int); int의 끝부분 char 저장
        // PrintWriter는 생성자에 들어온 OutputStreamWriter의 write(int)를 이용하여 쓴다.
        // PrintWriter는 println(문자열); 문자열을 출력한다.
        PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\hyuns\\Desktop\\ParkHyunSu\\Study\\my.txt")));
        out.println("hello");
        out.println("world");
        out.println("!!!!!");
        out.close();
    }
}
