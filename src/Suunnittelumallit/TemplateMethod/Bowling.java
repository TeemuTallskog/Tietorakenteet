package Suunnittelumallit.TemplateMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bowling extends Game{

    private int round;
    private List<Integer> scoreList;
    private boolean endOfGame;

    @Override
    public void initializeGame() {
        scoreList = new ArrayList<>();
        round = 0;
        endOfGame = false;
    }

    @Override
    public void makePlay(int player) {
        if(player == 0){
            round++;
        }
        if(round == 11){
            endOfGame = true;
        }else{
            int score = (int) (Math.random() * 11);
            if(score == 10) System.out.println("Player " + player + " got a Strike!");
            System.out.println("Player " + player + " scored " + score);
            if(round == 1) scoreList.add(score);
            else scoreList.set(player, scoreList.get(player) + score);
        }
    }

    @Override
    public boolean endOfGame() {
        return endOfGame;
    }

    @Override
    public void printWinner() {
        System.out.println("Winner is player " + scoreList.indexOf(Collections.max(scoreList)) + " with the score of " + Collections.max(scoreList));
    }
}
