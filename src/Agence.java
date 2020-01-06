import java.util.HashSet;
public class Agence {
    private HashSet<Maison> maisons = new HashSet<Maison>() ;
    private HashSet<Appartement> appartements = new HashSet<Appartement>();
    private HashSet<Terrain> terrains = new HashSet<Terrain>();
    public HashSet<Bien> bienArchives = new HashSet<Bien>();
    public HashSet<Proprietaire> listeProprietaire = new HashSet<Proprietaire>();
    public HashSet<Wilaya> listeWilaya = new HashSet<Wilaya>();
    public Agence(HashSet<Maison> maisons, HashSet<Appartement> appartements, HashSet<Terrain> terrains,
                  HashSet<Bien> bienArchives, HashSet<Proprietaire> listeProprietaire, HashSet<Wilaya> listeWilaya) {
        this.maisons = maisons;
        this.appartements = appartements;
        this.terrains = terrains;
        this.bienArchives = bienArchives;
        this.listeProprietaire = listeProprietaire;
        this.listeWilaya = listeWilaya;
    }
    public HashSet<Maison> getMaisons() {
        return maisons;
    }
    public void setMaisons(HashSet<Maison> maisons) {
        this.maisons = maisons;
    }
    public HashSet<Appartement> getAppartements() {
        return appartements;
    }
    public void setAppartements(HashSet<Appartement> appartements) {
        this.appartements = appartements;
    }
    public HashSet<Terrain> getTerrains() {
        return terrains;
    }
    public void setTerrains(HashSet<Terrain> terrains) {
        this.terrains = terrains;
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
