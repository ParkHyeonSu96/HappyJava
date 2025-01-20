import java.io.File;
import java.io.IOException;

// c:/temp
// /tmp
public class TempFile {
    public static void main(String[] args){
        try {
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println(f.getAbsolutePath());
            System.out.println("20초 동안 멈춰있습니다.");
            try{
                // 1000밀리세컨드 = 1초
                Thread.sleep(20000); // 20초 동안 프로그램이 멈춰있는다.
            } catch (InterruptedException e1) {
                System.out.println(e1);
            }
            f.deleteOnExit(); // JVM이 종료될 때 임시파일을 자동으로 삭제한다.
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
