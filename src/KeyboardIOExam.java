import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception{
        // 키보드로부터 한 줄씩 입력받고, 한 줄씩 출력하시오.
        // 키보드 : System.in (InputStream 주인공)
        // 화면에 출력 : System.out ( PrintStream 주인공 )
        // 키보드로 입력받는다는건 문자를 입력받는 것 : char 단위 입출력
        // char단위 입출력 클래스는 Reader, Writer
        // 한 줄 읽기 : BufferedReader라는 클래스는 readLine이라는 메소드를 가지고 있다.
        //            더 이상 읽어들일것이 없으면(EOF) null을 반환
        //            장식!!(장식은 주인공이 없으면 사용할 수 없다.)
        // 한 줄 쓰기 : PrintStream, PrintWriter

        // BufferedReader x
        // CharReader x - 키보드가 아니라 문자로부터 읽어들인다.
        // FilterReader x - 장식. 또 Reader를 넣어줘야 한다.
        // InputStreamReader(InputStream in) - 장식

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        while( (line = br.readLine()) != null) { // 한 줄 입력받는다.
            System.out.println("읽어들인값 : " + line);
        }
    }
}
