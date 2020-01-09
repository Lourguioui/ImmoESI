import java.util.HashSet;
public class Client {
    private String username;
    private String pword;
    public Client(String username, String pword, HashSet<Terrain> listeTerrain, HashSet<Maison> listeMaison,
                  HashSet<Appartement> listeAppartement) {
        this.username = username;
        this.pword = pword;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPword() {
        return pword;
    }
    public void setPword(String pword) {
        this.pword = pword;
    }
}
