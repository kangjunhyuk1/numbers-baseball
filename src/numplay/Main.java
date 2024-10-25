package numplay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RandomNum randomNum = new RandomNum();

        Scanner sc = new Scanner(System.in);
        System.out.println("< 게임을 시작합니다 >");
        ArrayList<Integer> playerAnswer = new ArrayList<>();
        while (true) {
            System.out.println(randomNum.gameCount + " 번째 시도입니다");

            System.out.println("첫번째 숫자를 입력하세요");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력하실수 있습니다");
            }
            int number1 = sc.nextInt();
            playerAnswer.add(number1);

            System.out.println("두번째 숫자를 입력하세요");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력하실수 있습니다");
            }
            int number2 = sc.nextInt();
            playerAnswer.add(number2);

            System.out.println("세번째 숫자를 입력하세요");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력하실수 있습니다");
            }
            int number3 = sc.nextInt();
            playerAnswer.add(number3);

            System.out.println(number1 + "" + number2 + "" + number3);

            if (number1 == 0 || number2 == 0 || number3 == 0) {
                System.out.println("0은 입력하실 수 없습니다");
                continue;
            } else if (number1 >= 10 || number2 >= 10 || number3 >= 10) {
                System.out.println("올바르지 않은 입력값입니다");
            }

            randomNum.gameStart(playerAnswer);
            if (randomNum.strikeCount != 3) {
                continue;
            } else if (randomNum.strikeCount == 3) {
                break;
            }

        }
    }
}
