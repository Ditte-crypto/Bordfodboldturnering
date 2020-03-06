package Model;
//p
import java.util.ArrayList;

public class Team{
    private String name;
    private int id;
    private static int nextId=1;
    private int[] points; //2 for win, 1 for tie, 0 for lose
    private int score; //målscore differens på vindere og taberens mål vinderen har positiv værdi og taberen hat negativ.
    private String position;
    private ArrayList<Player> players = new ArrayList<Player>();
    private String angriber;
    private String forsvar;

    public Team(String teamName,String[] memberNames){
        angriber = memberNames[0];
        forsvar = memberNames[1];
        this.name=teamName;
        this.id=nextId;
        nextId++;
        for (String s:memberNames){
            this.addPlayer(s);
        }
    }
    void addPlayer(String name){
        players.add(new Player(name));
    }

    public String toString(){
        String str = "Hold: "+this.name+"\nSpillere: "+this.players+"\n";
        return str;
    }



    //gettere

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public int[] getPoints() {
        return points;
    }

    public int getScore() {
        return score;
    }

    public String getPosition() {
        return position;
    }

    //settere


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setNextId(int nextId) {
        Team.nextId = nextId;
    }

    public void setPoints(int[] points) {
        this.points = points;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}