import com.sun.source.tree.Tree;
import java.util.*;
public class Agence {
    private TreeSet<Bien> biens = new TreeSet<Bien>();
    private TreeSet<Bien> bienArchives = new TreeSet<Bien>();
    private HashSet<Proprietaire> listeProprietaire = new HashSet<Proprietaire>();
    private HashSet<Wilaya> listeWilaya = new HashSet<Wilaya>();
    private ArrayList<Message> listeMessage = new ArrayList<Message>();
    public Agence(TreeSet<Bien> biens, TreeSet<Bien> bienArchives, HashSet<Proprietaire> listeProprietaire,
                  HashSet<Wilaya> listeWilaya, ArrayList<Message> listeMessage) {
        this.biens = biens;
        this.bienArchives = bienArchives;
        this.listeProprietaire = listeProprietaire;
        this.listeWilaya = listeWilaya;
        this.listeMessage=listeMessage;
    }



    public ArrayList<Message> getListeMessage() {
        return listeMessage;
    }



    public void setListeMessage(ArrayList<Message> listeMessage) {
        this.listeMessage = listeMessage;
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
    public HashSet<Wilaya> getListeWilaya() {
        return listeWilaya;
    }
    public void setListeWilaya(HashSet<Wilaya> listeWilaya) {
        this.listeWilaya = listeWilaya;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bienArchives == null) ? 0 : bienArchives.hashCode());
        result = prime * result + ((biens == null) ? 0 : biens.hashCode());
        result = prime * result + ((listeProprietaire == null) ? 0 : listeProprietaire.hashCode());
        result = prime * result + ((listeWilaya == null) ? 0 : listeWilaya.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Agence other = (Agence) obj;
        if (bienArchives == null) {
            if (other.bienArchives != null)
                return false;
        } else if (!bienArchives.equals(other.bienArchives))
            return false;
        if (biens == null) {
            if (other.biens != null)
                return false;
        } else if (!biens.equals(other.biens))
            return false;
        if (listeProprietaire == null) {
            if (other.listeProprietaire != null)
                return false;
        } else if (!listeProprietaire.equals(other.listeProprietaire))
            return false;
        if (listeWilaya == null) {
            if (other.listeWilaya != null)
                return false;
        } else if (!listeWilaya.equals(other.listeWilaya))
            return false;
        return true;
    }


}
