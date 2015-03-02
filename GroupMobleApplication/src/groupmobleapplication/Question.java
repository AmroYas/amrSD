/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Dennis I, Yasir Y, Rabia A, Jurjis L, Mohammed R, Richmond Adjei
 */
public class Question implements Questions {

    private String question = "";
    private String answer = "";
    private int numberIntegers = 0;
    ArrayList<Integer> usedNumbers = new ArrayList<Integer>();
    ArrayList<String> usedOperators = new ArrayList<String>();

    Random rand = new Random(); // rand.nextInt((max - min) + 1) + min;

    public Question(int difficulty) {
        switch (difficulty) {
            case 0:
                // Generate 2 Numbers
                numberIntegers = 2;
                break;
            case 1:
                // Generate 2 or 3 Numbers
                numberIntegers = rand.nextInt((3 - 2) + 1) + 2;
                break;
            case 2:
                // Generate 2 to 4 Numbers
                numberIntegers = rand.nextInt((4 - 2) + 1) + 2;
                break;
            case 3:
                // Generate 4 to 6 Numbers
                numberIntegers = rand.nextInt((6 - 4) + 1) + 4;
                break;
        }
        generateNumbers();
        generateOperators();
        generateQuestion();
        answer = generateAnswer();
    }

    public void generateNumbers() {
        for (int i = 0; i < numberIntegers; i++) {
            int randomNumber = rand.nextInt((10 - 1) + 1) + 1; // Number between
            // 1 and 10
            usedNumbers.add(randomNumber);
        }
    }

    public void generateOperators() {
        for (int i = 0; i < (numberIntegers - 1); i++) {
            int randomNumber = rand.nextInt((3 - 0) + 1) + 0; // Number between
            // 0 and 3
            switch (randomNumber) {
                case 0:
                    usedOperators.add("+");
                    break;
                case 1:
                    usedOperators.add("-");
                    break;
                case 2:
                    usedOperators.add("*");
                    break;
                case 3:
                    usedOperators.add("/");
                    break;
            }
        }
    }

    public void generateQuestion() {
        for (int i = 0; i < usedNumbers.size(); i++) {
            question = question.concat(Integer.toString(usedNumbers.get(i))); // Concat Number
            if (i < usedOperators.size()) { // Operators always 1 less than total numbers. Stops OutOfBounds
                question = question.concat(usedOperators.get(i)); // Concat Operator
            }
        }
    }

    public String generateAnswer() {
        int operatorInt = 0;
        int j = 0;
        double answer = 0.0;
        for (int i = 1; i < usedNumbers.size(); i++) {
            if (i == 1) {
                operatorInt = getOperatorId(j);
                switch (operatorInt) {
                    case 0:
                        answer = usedNumbers.get(i - 1) + usedNumbers.get(i);
                        break;
                    case 1:
                        answer = usedNumbers.get(i - 1) - usedNumbers.get(i);
                        break;
                    case 2:
                        answer = usedNumbers.get(i - 1) * usedNumbers.get(i);
                        break;
                    case 3:
                        answer = (double) usedNumbers.get(i - 1)
                                / (double) usedNumbers.get(i);
                        break;
                }
            } else {
                operatorInt = getOperatorId(j);
                switch (operatorInt) {
                    case 0:
                        answer = answer + usedNumbers.get(i);
                        break;
                    case 1:
                        answer = answer - usedNumbers.get(i);
                        break;
                    case 2:
                        answer = answer * usedNumbers.get(i);
                        break;
                    case 3:
                        answer = (double) answer / (double) usedNumbers.get(i);
                        break;
                }
            }
            answer = Math.round(answer);
            if (j < (usedNumbers.size() - 2)) {
                j++;
            }
        }
        int answerInt = (int) answer;
        String answerString = Integer.toString(answerInt);
        return answerString;
    }

    public int getOperatorId(int i) {
        // In this java version, you can not use a switch with a string
        // Need to get values as int
        int operatorInt = 0;
        String operator = usedOperators.get(i);

        if (operator.equals("+")) {
            operatorInt = 0;
        } else if (operator.equals("-")) {
            operatorInt = 1;
        } else if (operator.equals("*")) {
            operatorInt = 2;
        } else if (operator.equals("/")) {
            operatorInt = 3;
        }

        return operatorInt;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
