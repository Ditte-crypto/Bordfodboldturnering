package Model;

import java.time.LocalDateTime;

public class Match {
    private LocalDateTime time;
    private Team team1;
    private Team team2;
    private int id = 0; //her skal man også tælle antallet af kampe static nextint
    private static int nextId;
    private String result;
    private String type; //type af kamp
    private int[] score; //team1 mål,team2 mål

    public Match(){
        this.id = nextId;
        nextId++;
    }

    //gettere

    public LocalDateTime getTime() {
        return time;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getResult() {
        return result;
    }

    public String getType() {
        return type;
    }

    public int[] getScore() {
        return score;
    }

    //settere

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setNextId(int nextId) {
        Match.nextId = nextId;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setScore(int[] score) {
        this.score = score;
    }
}
