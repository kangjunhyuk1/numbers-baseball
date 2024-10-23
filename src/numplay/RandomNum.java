package numplay;

import java.util.*;

public class RandomNum {

    Random random = new Random();
    HashSet<Integer> playNum = new HashSet<>();
    int strike;

    int ball;

    int outCount;

    int gameCount;

    int firstNum;

    int secondNum;

    int thirdNum;


    public int gameStart (int num1, int num2, int num3){

        Scanner sc = new Scanner(System.in);

        while (playNum.size() < 3) {
            playNum.add(random.nextInt(9) + 1);
        }
        ArrayList<Integer> playList = new ArrayList<>(playNum);
        Collections.shuffle(playList);
        System.out.println(playList);
        int firstNum = playList.get(0);
        int secondNum = playList.get(1);
        int thirdNum = playList.get(2);
        System.out.println(firstNum + "" + secondNum + "" + thirdNum);

        while (true) {
            int answer = Integer.parseInt(sc.nextLine());

            if (0 > answer || answer < 1000){
                System.out.println("잘못된 값입니다");
            }
            System.out.println(answer);
            break;

        }
        return 0;
    }

    public int hundredNum (int number1) {
        if (number1 == firstNum) {
            return strike ++;
        }else if (number1 == secondNum || number1 == thirdNum) {
            return ball ++;
        }else {
            return outCount ++;
        }
    }

    public int strikeZone (int strike) {
        this.strike = strike++;
        return strike;
    }
}

