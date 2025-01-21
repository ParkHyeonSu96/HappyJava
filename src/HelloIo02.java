import java.io.FileInputStream;
import java.io.InputStream;

public class HelloIo02 {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream("C:\\Users\\user\\Desktop\\ParkHyeonSu\\practice\\helloio01.txt");
//        int i1 = in.read();
//        System.out.println(i1); // 1
//
//        int i2 = in.read();
//        System.out.println(i2); // 255
//
//        int i3 = in.read();
//        System.out.println(i3); // 10
//
//        int i4 = in.read();
//        System.out.println(i4); // -1 (파일의 끝)
        int buf = -1;
        while((buf = in.read()) != -1){
            System.out.println(buf);
        }

        in.close();
    }
}
