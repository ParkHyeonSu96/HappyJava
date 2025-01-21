import java.io.*;

public class IoPractice3 {
    public static void main(String[] args){
        try{
            // 파일 객체 생성
            File file = new File("C:\\Users\\user\\Desktop\\ParkHyeonSu\\practice\\practice1.txt");
            // 입력 스트림 생성
            FileReader fileReader = new FileReader(file);
            // 입력 버퍼 생성
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\user\\Desktop\\ParkHyeonSu\\practice\\practice2.txt")));

            String line = "";
            while((line = bufferedReader.readLine()) != null){
                bw.write(line);
                bw.newLine();
            }

            bw.close();
        } catch(IOException ex){
            System.out.println(ex);
        }
    }
}
