import java.io.FileReader;
import java.io.Reader;

public class HelloIo04 {
    public static void main(String[] args) throws Exception{
        Reader in = new FileReader("C:\\Users\\hyuns\\Desktop\\ParkHyunSu\\Study\\hello.txt");
//        int ch1 = in.read();
//        System.out.println((char)ch1);
//        int ch2 = in.read();
//        System.out.println((char)ch2);
//        int ch3 = in.read();
//        System.out.println((char)ch3);
//        int ch4 = in.read();
//        System.out.println(ch4);
        int ch = -1;
        while((ch = in.read()) != -1){
            System.out.println((char)ch);
        }
        in.close();
    }
}
