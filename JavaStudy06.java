//박정근
import java.util.Scanner;
public class JavaStudy06 {
    static final int TOTAL = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] candidate = new int[4];
        String[] name = new String[]{"이재명","윤석열","심상정","안철수"};


        for(int i=1; i<=TOTAL; i++) {
            int vote = (int)(Math.random() * 4);
            candidate[vote]++;
            System.out.println();
            System.out.printf("[투표진행율]: %03.02f%c, %d명 투표 => %s\n",(i*0.01f) ,'%', i, name[vote]);
            System.out.printf("[기호:1] 이재명: %03.02f%c, (투표수: %d)\n",((double) candidate[0] *0.01f) ,'%', candidate[0]);
            System.out.printf("[기호:2] 윤석열: %03.02f%c, (투표수: %d)\n",((double) candidate[1] *0.01f) ,'%', candidate[1]);
            System.out.printf("[기호:3] 심상정: %03.02f%c, (투표수: %d)\n",((double) candidate[2] *0.01f) ,'%', candidate[2]);
            System.out.printf("[기호:4] 안철수: %03.02f%c, (투표수: %d)\n",((double) candidate[3] *0.01f) ,'%', candidate[3]);
            //투표가 중복되었을경우
            if(i == TOTAL) {
                int max = 0;
                for (int j = 0; j < 4; j++) {
                    if(max < candidate[j]) {
                        max = candidate[j];
                    }
                }

                int same = 0;
                for(int j=0; j<4; j++) {
                    if(max == candidate[j]) {
                        same++;
                    }
                }

                if(same > 1) {
                    i--;
                }
            }
        }

        int maxValue = 0;
        String winner = new String();
        for(int i=0; i<4; i++) {
            if(maxValue < candidate[i]) {
                maxValue = candidate[i];
                winner = name[i];
            }
        }

        System.out.printf("[투표결과] 당선인: %s\n", winner);
    }
}
