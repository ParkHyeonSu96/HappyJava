import java.io.StringReader;

public class IoExam16 {
    public static void main(String[] args) throws Exception {
        StringReader in = new StringReader("helloworld!!!");
        int ch = -1;

        while((ch = in.read()) != -1){
            System.out.print((char)ch);
        }

        in.close();
    }
}
