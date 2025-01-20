import java.io.IOException;
import java.io.InputStream;

/*
1byte가 표현할 수 있는 값 : 00000000 ~ 11111111
read()메소드가 읽어들일 수 있는 정보. 00000000 ~ 11111111 중의 한 개
1byte씩 파일을 읽어들인다.
1byte씩 파일을 읽어들이는데 파일의 크기를 모른다. 그럼 언제까지 읽어들이느냐?
더 이상 읽어들일것이 없다 -> EOF
int에 1byte값을 담자. 00000000 00000000 00000000 00000000
                    00000000 00000000 00000000 11111111
EOF : -1
1 -->  00000000 00000000 00000000 00000001
1의보수 11111111 11111111 11111111 11111110
2의보수 11111111 11111111 11111111 11111111 : -1
*/
public class InputStreamExam01 {
    public static void main (String[] args) throws IOException {
        InputStream in = null;
        try {
            int data = in.read();
        }catch (IOException ex) {
            System.out.println("io 오류 :" + ex);
        }finally {
            try{
                in.close();
            } catch (IOException ex2) {
                System.out.println("io 오류2 :" + ex2);
            }

        }
    }

}
