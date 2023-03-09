// 박정근
public class JavaStudy01 {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");

        for (int j = 1; j < 10; j++) {
            for(int i=1; i<10; i++){
                System.out.print(String.format("%02d", i)+"x" + String.format("%02d", j) + "=" + String.format("%02d", i*j)+"   ");
            }
            System.out.println();
        }
    }
}
