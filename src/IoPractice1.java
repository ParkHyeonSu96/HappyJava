import java.io.*;

public class IoPractice1 {
    public static void main(String[] args){
        try{
            // 파일 객체 생성
            File file = new File("C:\\Users\\hyuns\\Desktop\\ParkHyunSu\\Study\\practice.txt");
            // 입력 스트림 생성
            FileReader fileReader = new FileReader(file);
            // 입력 버퍼 생성
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException ex){
            System.out.println(ex);
            System.out.println("test");
        }
    }
}
