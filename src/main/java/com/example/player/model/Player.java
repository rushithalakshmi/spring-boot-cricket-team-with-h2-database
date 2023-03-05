// Write your code here
package com.example.player.model;
public class Player{
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId,String playerName,int jerseyNumber,String role){
        this.playerId=playerId;
        this.playerName=playerName;
        this.jerseyNumber=jerseyNumber;
        this.role=role;
    }
    
    public int getPlayerId(){
        return playerId;
    }
    public void setPlayerId(int id){
        this.playerId=id;
    }

    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String name){
        this.playerName=name;
    }

    public int getJerseyNumber(){
        return jerseyNumber;
    }
    public void setJerseyNumber(int jerseyNum){
        this.jerseyNumber=jerseyNum;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role=role;
    }
}
