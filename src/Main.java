import Model.Match;
import Model.Team;
//p
import java.time.LocalDateTime;
import java.util.ArrayList;

//Turnering
public class Main {
    //matches
    //teams
    private static ArrayList<Team> teams =new ArrayList<Team>();
    private static ArrayList<Match> matches = new ArrayList<>();
    public static void main(String[] args) {
        Team team1 = registerTeam("Golden Eagles", new String[] {"jens", "gustav"});
        Team team2 = registerTeam("MC Duerne", new String[]{"peter", "emil"});
        Team team3 = registerTeam("Cirkeline og Frederik", new String[]{"tess","thorbjørn"});
        Team team4 = registerTeam("powepuff!", new String[]{"Oscar", "Murat"});
        Team team5 = registerTeam("Gandalfs smølfer", new String[]{"Mathias", "Mathias"});
        Team team6 = registerTeam("PepsiCola", new String[]{"Robert","Ali"});
        Team team7 = registerTeam("Elefant med små ører", new String[]{"Mogens", "Mathias"});
        Team team8 = registerTeam("Høje smølf og skøre smølf", new String[]{"Ditte", "Tobias"});
        displayTeams();

        int match1= scheduleMatch(LocalDateTime.of(2020, 03, 06, 12, 00));
        updateMatch(match1, team1, team2);

        int match2 = scheduleMatch(LocalDateTime.of(2020, 03, 06, 12, 30));
        updateMatch(match2, team3, team4);

        int match3 = scheduleMatch(LocalDateTime.of(2020, 03, 06, 13, 00));
        updateMatch(match3, team5, team6);

        int match4 = scheduleMatch(LocalDateTime.of(2020, 03, 06, 13, 30));
        updateMatch(match4, team7, team8);

        displayMatches();

    }

    private static Match getMatchById(int matchId) {
        Match foundMatch = null;
        for (Match m1:matches) {

            if(m1.getId()==matchId) {
                foundMatch = m1;
                break;
            }
            }
        return foundMatch;
    }

    private static Team registerTeam(String teamName, String[] teamMembers) {
        Team tempTeam = new Team(teamName, new String[]{teamMembers[0], teamMembers[1]});
        teams.add(tempTeam);
        return tempTeam;
    }
    private static void displayTeams(){
        for(Team s: teams){
            System.out.println(s);
        }
    }
    private static void displayMatches(){
        for(Match m: matches){
            System.out.println(m);
        }
    }
    public static int scheduleMatch(LocalDateTime time) {
        Match m = new Match();
        m.setTime(time);
        matches.add(m);
        return m.getId();
    }
    public static void updateMatch(int m, Team t1, Team t2){
        Match match = getMatchById(m);
        match.setTeams(t1,t2);
    }

}
