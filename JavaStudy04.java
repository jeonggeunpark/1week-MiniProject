//박정근
import java.util.Random;
import java.util.Scanner;

public class JavaStudy04 {
    public static void main(String[] args) {
        System.out.println("[주민등록번호 계산]");
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        int[] attested = new int[13];
        int gender1 = 0;

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = s.nextInt();
        attested[1] += year % 10;
        attested[0] = year / 10 % 10;

        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = s.nextInt();
        attested[3] += month % 10;
        attested[2] = month / 10 % 10;

        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = s.nextInt();
        attested[5] += day % 10;
        attested[4] = day / 10 % 10;

        System.out.print("성별을 입력해 주세요.(m/f):");
        char gender = s.next().charAt(0);
        switch (gender) {
            case 'm':
                gender1 = 3;
                if(year<2000) {
                    gender1 = 1;
                }
                break;
            case 'f':
                gender1 = 4;
                if(year<2000)
                    gender1 =2;
        }

        attested[6] = gender1;

        for (int i = 0; i < 6; i++) {
            System.out.print(attested[i]);
        }
        System.out.print("-" + attested[6]);
        for (int i = 7; i < 13; i++) {
            System.out.print(attested[i] = random.nextInt(9));
        }
    }
}
