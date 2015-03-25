/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

/**
 *
 * @author Dennis
 */
public class LeaderboardPerson {
    
    private String userName;
    private int userScore;
    
    public LeaderboardPerson(String name, int score){
        userName = name;
        userScore = score;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public int getUserScore(){
        return userScore;
    }
}
