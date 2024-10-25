package numplay;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class RandomNum {

    Random random = new Random();
    HashSet<Integer> randomNumberList = new HashSet<>();
    ArrayList<Integer> shuffleNumbersList = new ArrayList<>();

    private int strikeCount;

    private int ballCount;

    private int outCount;

    private int gameCount;


    public RandomNum() {

        while (randomNumberList.size() < 3) {
            randomNumberList.add(random.nextInt(9) + 1);
        }
        shuffleNumbersList = new ArrayList<>(randomNumberList);
        Collections.shuffle(shuffleNumbersList);
        System.out.println(shuffleNumbersList);
    }

    public int gameStart(ArrayList<Integer> playerAnswer) {
        gameCount++;
        while (true) {

            ArrayList<Integer> playersAnswer = new ArrayList<>(playerAnswer);

            for (int i = 0; i <= 2; i++) {

                if (playersAnswer.get(i) == shuffleNumbersList.get(i)) {
                    strikeCount++;
                } else if (randomNumberList.contains(playersAnswer.get(i))) {
                    boolean isBall = randomNumberList.contains(playersAnswer.get(i));
                    if (isBall) {
                        ballCount++;
                    }
                }
            }

            if (strikeCount == 3) {
                System.out.println("정답!");
            } else if (ballCount > 0 || strikeCount > 0) {
                System.out.println(ballCount + "ball " + strikeCount + "strike");
            }else {
                System.out.println("out!");
            }
            playerAnswer.clear();
            return gameCount;
        }
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getOutCount() {
        return outCount;
    }

    public int getGameCount() {
        return gameCount;
    }

    public void resetCount () {
        strikeCount = 0;
        ballCount = 0;
    }
}



