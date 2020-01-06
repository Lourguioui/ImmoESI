import java.util.HashSet;
public class Client {
    private String username;
    private String pword;
    private HashSet<Terrain> listeTerrain = new HashSet<Terrain>();
    private HashSet<Maison> listeMaison = new HashSet<Maison>();
    private HashSet<Appartement> listeAppartement = new HashSet<Appartement>();
    public Client(String username, String pword, HashSet<Terrain> listeTerrain, HashSet<Maison> listeMaison,
                  HashSet<Appartement> listeAppartement) {
        this.username = username;
        this.pword = pword;
        this.listeTerrain = listeTerrain;
        this.listeMaison = listeMaison;
        this.listeAppartement = listeAppartement;
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
    public HashSet<Terrain> getListeTerrain() {
        return listeTerrain;
    }
    public void setListeTerrain(HashSet<Terrain> listeTerrain) {
        this.listeTerrain = listeTerrain;
    }
    public HashSet<Maison> getListeMaison() {
        return listeMaison;
    }
    public void setListeMaison(HashSet<Maison> listeMaison) {
        this.listeMaison = listeMaison;
    }
    public HashSet<Appartement> getListeAppartement() {
        return listeAppartement;
    }
    public void setListeAppartement(HashSet<Appartement> listeAppartement) {
        this.listeAppartement = listeAppartement;
    }

}
