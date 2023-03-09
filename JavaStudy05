//박정근
import java.util.Calendar;
import java.util.Scanner;

public class JavaStudy05 {
    public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    System.out.println("달력 출력 프로그램");

        System.out.print("달력의 년도를 입력해 주세요.(yyyy)");
        int year = s.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm)");
        int month = s.nextInt();

        Calendar cal = Calendar.getInstance();

        System.out.printf("[%d년 %02d월]\n", year, month);
        System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

        cal.set(year, month - 1, 1);

        int start = cal.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i < start; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
            System.out.printf("%02d\t", i);
            if(start % 7 == 0) {
                System.out.println();
            }
            start++;
        }

    }
}
