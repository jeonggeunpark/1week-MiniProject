//박정근
import java.util.Random;
import java.util.Scanner;

public class JavaStudy07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        System.out.println("[로또 당첨 프로그램");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int number = s.nextInt();

        char count = 'A';
        int[][] result = new int[7][7];
        int number1 = 0;
        int j = 0;

        for (int i = 0; i < number; i++) {
            System.out.print(count + "\t");
            while (j < 6) {
                number1 = random.nextInt(45) + 1;
                result[i][j] = number1;
                if (j == 5) {
                    System.out.print(result[i][j]);
                    break;
                }
                System.out.print(result[i][j] + ",");
                j++;
            }
            System.out.println();
            count++;
            j = 0;
        }

        System.out.println("[로또 발표]");
        System.out.print("\t");
        int[] result1 = new int[7];

        for (int k = 0; k < 6; k++) {
            number1 = random.nextInt(45) + 1;
            result1[k] = number1;
            if (k == 5) {
                System.out.print(result1[k]);
                break;
            }
            System.out.print(result1[k] + ",");
        }
        System.out.println();

        System.out.println("[내 로또 결과]");
        count = 'A';
        int win = 0;

        for (int i = 0; i < number; i++) {
            System.out.print(count + "\t");
            win =0;
            for (int k = 0; k < 6; k++) {
                for (int l = 0; l < 6; l++) {
                    if (result[i][k] == result1[l])
                        win++;
                }
                System.out.printf("%d,", result[i][k]);

            }
            System.out.printf("==>" + "%d개 일치", win);
            System.out.println();
            count++;
        }
        
        }
}
