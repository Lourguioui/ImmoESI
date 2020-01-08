import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;
public class Agence {
    private TreeSet<Bien> biens = new TreeSet<Bien>();
    public TreeSet<Bien> bienArchives = new TreeSet<Bien>();
    public HashSet<Proprietaire> listeProprietaire = new HashSet<Proprietaire>();
    public TreeSet<Wilaya> listeWilaya = new TreeSet<Wilaya>();

    public Agence(TreeSet<Bien> biens,TreeSet<Bien> bienArchives, HashSet<Proprietaire> listeProprietaire, TreeSet<Wilaya> listeWilaya) {
        super();
        this.biens = biens;
        this.bienArchives = bienArchives;
        this.listeProprietaire = listeProprietaire;
        this.listeWilaya = listeWilaya;
    }
    public TreeSet<Bien> getBiens() {
        return biens;
    }
    public void setBiens(TreeSet<Bien> biens) {
        this.biens = biens;
    }
    public TreeSet<Bien> getBienArchives() {
        return bienArchives;
    }
    public void setBienArchives(TreeSet<Bien> bienArchives) {
        this.bienArchives = bienArchives;
    }
    public HashSet<Proprietaire> getListeProprietaire() {
        return listeProprietaire;
    }
    public void setListeProprietaire(HashSet<Proprietaire> listeProprietaire) {
        this.listeProprietaire = listeProprietaire;
    }
    public TreeSet<Wilaya> getListeWilaya() {
        return listeWilaya;
    }
    public void setListeWilaya(TreeSet<Wilaya> listeWilaya) {
        this.listeWilaya = listeWilaya;
    }


}
