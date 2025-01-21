import java.io.FileWriter;
import java.io.Writer;

public class HelloIo03 {
    public static void main(String[] args) throws Exception{
        Writer out = new FileWriter("C:\\Users\\user\\Desktop\\ParkHyeonSu\\practice\\hello.txt");
        out.write((int)'가');
        out.write((int)'나');
        out.write((int)'다');
        out.close();
    }
}
