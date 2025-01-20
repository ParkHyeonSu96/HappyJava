import java.io.*;

public class IoPractice2 {
    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("사용법 : java IoPractice2 파일이름");
            System.exit(0); // = return;
        }

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(args[0])));
            String line = "";

            while( (line = br.readLine()) != null) { // 한 줄 입력받는다.
                System.out.println("=" + line);
                bw.write(line);
                bw.newLine();

            }

            bw.close();
        }catch(IOException ex) {
            System.out.println(ex);
        }
    }
}
