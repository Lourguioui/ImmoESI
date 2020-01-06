
public class Wilaya {
    private String nom;
    private double prix;
    public Wilaya(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean equals(Wilaya w) {
        if(this.nom==w.getNom() && this.prix==w.getPrix()) return true;
        return false;
    }

    public int hashCode() {
        return 31*this.nom.length();
    }
}
