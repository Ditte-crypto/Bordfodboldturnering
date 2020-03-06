import Model.Team;

//Turnering
public class Main {
    //matches
    //teams
    public static void main(String[] args) {
        Team team1 = new Team("Golden Eagles", new String[] {"jens", "gustav"});
        Team team2 = new Team("MC Duerne", new String[]{"peter", "emil"});
        Team team3 = new Team("Cirkeline og Frederik", new String[]{"tess","thorbjørn"});
        Team team4 = new Team("powepuff!", new String[]{"Oscar", "Murat"});
        Team team5 = new Team("Gandalfs smølfer", new String[]{"Mathias", "Mathias"});
        Team team6 = new Team("PepsiCola", new String[]{"Robert","Ali"});
        Team team7 = new Team("Elefant med små ører", new String[]{"Mogens", "Mathias"});
        Team team8 = new Team("Høje smølf og skøre smølf", new String[]{"Ditte", "Tobias"});
        System.out.println(team1);
        System.out.println(team4);

    }
}
