import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IoExam12 {
    public static void main(String[] args) throws Exception{
        // 문제. 이름, 국어, 영어, 수학, 총점, 평균 점수를 score.txt파일에 저장하시오.
        DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\hyuns\\Desktop\\ParkHyunSu\\Study\\score.txt"));

        printStudent(in);
        printStudent(in);

        in.close();
    }

    private static void printStudent(DataInputStream in) throws IOException {
        String name = in.readUTF();
        int kor = in.readInt();
        int eng = in.readInt();
        int math = in.readInt();
        double total = in.readDouble();
        double avg = in.readDouble();

        System.out.println(name);
        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        System.out.println(total);
        System.out.println(avg);
    }
}
