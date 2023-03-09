//박정근
import java.util.Scanner;

public class JavaStudy03 {
    public static void main(String[] args){
        System.out.println("[입장권 계산]");
        Scanner s = new Scanner(System.in);

        int fee = 10000;
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = s.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = s.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        char person = s.next().charAt(0);
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        char card = s.next().charAt(0);

        if (age < 3){
            fee= 0;
        }else if (age > 3 && age < 13){
            fee = 4000;
        }else if (time > 17){
            fee = 4000;
        }else if (person == 'y' || card == 'y'){
            fee = 8000;
        }
        System.out.println("입장료:" + fee);
    }
}
