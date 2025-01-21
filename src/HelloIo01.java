import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloIo01 {
    public static void main(String[] args) throws Exception{
        OutputStream out = new FileOutputStream("C:\\Users\\hyuns\\Desktop\\ParkHyunSu\\Study\\helloio01.txt");
        out.write(1); // 0000 0000  0000 0000   0000 0000   0000 0001
        out.write(255);
        out.write(0);
        out.close();
    }
}
