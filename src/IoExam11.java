import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class IoExam11 {
    public static void main(String[] args) throws Exception{
        // 문제. 이름, 국어, 영어, 수학, 총점, 평균 점수를 score.txt파일에 저장하시오.
        String name = "park";
        int kor = 90;
        int eng = 50;
        int math = 70;
        double total = kor + eng + math;
        double avg = total / 3.0;

        DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\hyuns\\Desktop\\ParkHyunSu\\Study\\score.txt"));
        out.writeUTF(name);
        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);

        out.writeUTF("kim");
        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);

        out.close();
    }


}
