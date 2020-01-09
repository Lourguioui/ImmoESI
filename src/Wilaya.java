public class Wilaya {
    private String nom;
    private double prix_metre;
    public Wilaya(String nom, double prix_metre) {
        super();
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        long temp;
        temp = Double.doubleToLongBits(prix_metre);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Wilaya other = (Wilaya) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (Double.doubleToLongBits(prix_metre) != Double.doubleToLongBits(other.prix_metre))
            return false;
        return true;
    }

    public void Afficher() {
        System.out.println("le nom de wilaya : "+this.nom);
        System.out.println("le prix du mètre carrée du wilaya : "+this.prix_metre);
    }

}