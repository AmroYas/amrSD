/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

/**
 *
 * @author Dennis I, Yasir Y, Rabia A, Jurjis L, Mohammed R, Richmond Adjei
 */
public class Score {

    private int difficulty;
    private int score = 0;

    public Score(int i) {
        difficulty = i;
    }

    public int getScore() {
        return score;
    }

    public void addPoints() {
        switch (difficulty) {
            case 0:
                score += 10;
                break;
            case 1:
                score += 25;
                break;
            case 2:
                score += 50;
                break;
            case 3:
                score += 100;
                break;
        }
    }
}
