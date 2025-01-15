import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("Exception4.java");
        }catch(FileNotFoundException fnfe){
            System.out.println("file을 찾을 수 가 없어요.");
        }
    }
}
