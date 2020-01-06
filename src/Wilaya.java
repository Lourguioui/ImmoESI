
public class Wilaya {
    private String nom;
    private double prix_metre;
    public Wilaya(String nom, double prix_metre) {
        this.nom = nom;
        this.prix_metre = prix_metre;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getPrix_metre() {
        return prix_metre;
    }
    public void setPrix_metre(double prix_metre) {
        this.prix_metre = prix_metre;
    }

    public boolean equals(Wilaya w) {
        if(this.nom==w.getNom() && this.prix_metre==w.getPrix_metre()) return true;
        return false;
    }

    public int hashCode() {
        return 31*this.nom.length();
    }
}
