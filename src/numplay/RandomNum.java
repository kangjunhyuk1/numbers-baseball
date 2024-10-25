package numplay;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class RandomNum {

    Random random = new Random();
    HashSet<Integer> randomNumberList = new HashSet<>();
    ArrayList<Integer> shuffleNumbersList = new ArrayList<>();

    int strikeCount;

    int ballCount;

    int outCount;

    int gameCount = 1;

    public RandomNum() {

        while (randomNumberList.size() < 3) {
            randomNumberList.add(random.nextInt(9) + 1);
        }
        shuffleNumbersList = new ArrayList<>(randomNumberList);
        Collections.shuffle(shuffleNumbersList);
        System.out.println(shuffleNumbersList);
    }

    public int gameStart(ArrayList<Integer> playerAnswer) {
        gameCount ++;
        while (true) {
            strikeCount = 0;

            ballCount = 0;

            outCount = 0;
            ArrayList<Integer> playersAnswer = new ArrayList<>(playerAnswer);

            for (int i = 0; i <= 2; i++) {
                if (playersAnswer.get(i) == shuffleNumbersList.get(i)) {
                    strikeCount ++;
                } else if (randomNumberList.contains(playersAnswer.get(i))) {
                    boolean isBall = randomNumberList.contains(playersAnswer.get(i));
                    if (isBall) {
                        ballCount ++;
                    }
                    }else {
                    outCount ++;
                }
            }
            if (outCount == 3) {
                System.out.println("out!");
            }else if(strikeCount == 3) {
                System.out.println("정답!");
            }else {
                System.out.println(ballCount + "ball " + strikeCount + "strike");
            }
            return gameCount;
            }
        }
    }



