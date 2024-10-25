package numplay;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        RandomNum randomNum = new RandomNum();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("< 게임을 시작합니다 >");
            System.out.println("첫번째 숫자를 입력하세요");
            int number1 = sc.nextInt();
            System.out.println("두번째 숫자를 입력하세요");
            int number2 = sc.nextInt();
            System.out.println("세번째 숫자를 입력하세요");
            int number3 = sc.nextInt();
            System.out.println(number1 + "" + number2 + "" +number3);
            
            randomNum.gameStart(number1, number2, number3);

            
        }
    }
}
