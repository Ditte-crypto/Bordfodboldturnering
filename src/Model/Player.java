package Model;

public class Player {
    private String name;
    private String email;
    private int telefon;
    private int scoringer;

    public Player(String name) {
        this.name = name;
    }

    public String toString(){
        String str = this.name;
        return str;
    }

    //gettere

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefon() {
        return telefon;
    }

    public int getScoringer() {
        return scoringer;
    }

    //settere

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setScoringer(int scoringer) {
        this.scoringer = scoringer;
    }
}
