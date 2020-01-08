import java.util.HashSet;
public class Agence {
    private HashSet<Bien> biens = new HashSet<Bien>();
    public HashSet<Bien> bienArchives = new HashSet<Bien>();
    public HashSet<Proprietaire> listeProprietaire = new HashSet<Proprietaire>();
    public HashSet<Wilaya> listeWilaya = new HashSet<Wilaya>();

    public Agence(HashSet<Bien> biens,HashSet<Bien> bienArchives, HashSet<Proprietaire> listeProprietaire, HashSet<Wilaya> listeWilaya) {
        super();
        this.biens = biens;
        this.bienArchives = bienArchives;
        this.listeProprietaire = listeProprietaire;
        this.listeWilaya = listeWilaya;
    }
    public HashSet<Bien> getBiens() {
        return biens;
    }
    public void setBiens(HashSet<Bien> biens) {
        this.biens = biens;
    }
    public HashSet<Bien> getBienArchives() {
        return bienArchives;
    }
    public void setBienArchives(HashSet<Bien> bienArchives) {
        this.bienArchives = bienArchives;
    }
    public HashSet<Proprietaire> getListeProprietaire() {
        return listeProprietaire;
    }
    public void setListeProprietaire(HashSet<Proprietaire> listeProprietaire) {
        this.listeProprietaire = listeProprietaire;
    }
    public HashSet<Wilaya> getListeWilaya() {
        return listeWilaya;
    }
    public void setListeWilaya(HashSet<Wilaya> listeWilaya) {
        this.listeWilaya = listeWilaya;
    }


}
