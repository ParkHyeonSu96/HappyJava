import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class HelloIo06 {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\hyuns\\Desktop\\ParkHyunSu\\Study\\my.txt")));

//        String line1 = in.readLine();
//        String line2 = in.readLine();
//        String line3 = in.readLine();
//        String line4 = in.readLine();
//
//        System.out.println(line1);
//        System.out.println(line2);
//        System.out.println(line3);
//        System.out.println(line4);

        String line = "";
        while((line = in.readLine()) != null){
            System.out.println(line);
        }

        in.close();
    }
}
