// 박정근
import java.util.Scanner;

public class JavaStudy02 {
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("[캐시백 계산]");

            System.out.print("결제 금액을 입력해 주세요.(금액):");
            int cash = s.nextInt();

            int back =0;

            if(cash < 1000){
            }
            else if(cash > 1000 && cash <2000){
                back = 100;
            }else if (cash > 2000 && cash < 3000) {
                back = 200;
            }else if(cash > 3000){
                back  =300;
            }
            System.out.println("결제금액은 " + cash +"원이고, 캐시백은 " +back + "원 입니다.");

        }
    }
