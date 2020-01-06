

public class Maison extends Habitable {
    private int nbr_etage;
    private int nbr_garage;
    private int nbr_piscine;
    private int nbr_jardin;
    private double sup_habituel;

    public Maison(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                  boolean negoc_prix, String description, String date_ajout, String photo, int ID, boolean meuble,
                  int nbr_piece, int nbr_etage, int nbr_garage, int nbr_piscine, int nbr_jardin, double sup_habituel) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, ID, meuble,
                nbr_piece);
        this.nbr_etage = nbr_etage;
        this.nbr_garage = nbr_garage;
        this.nbr_piscine = nbr_piscine;
        this.nbr_jardin = nbr_jardin;
        this.sup_habituel = sup_habituel;
    }
    public int getNbr_etage() {
        return nbr_etage;
    }
    public void setNbr_etage(int nbr_etage) {
        this.nbr_etage = nbr_etage;
    }
    public int getNbr_garage() {
        return nbr_garage;
    }
    public void setNbr_garage(int nbr_garage) {
        this.nbr_garage = nbr_garage;
    }
    public int getNbr_piscine() {
        return nbr_piscine;
    }
    public void setNbr_piscine(int nbr_piscine) {
        this.nbr_piscine = nbr_piscine;
    }
    public int getNbr_jardin() {
        return nbr_jardin;
    }
    public void setNbr_jardin(int nbr_jardin) {
        this.nbr_jardin = nbr_jardin;
    }
    public double getSup_habituel() {
        return sup_habituel;
    }
    public void setSup_habituel(double sup_habituel) {
        this.sup_habituel = sup_habituel;
    }
    public void Afficher(){
        System.out.println("Le nombre des étage ");
    }
    public void calculer_prix(){}
    public boolean equals(Maison m) {
        if(super.equals(m) && this.nbr_etage==m.getNbr_etage() && this.nbr_garage==m.getNbr_garage() && this.nbr_jardin==m.getNbr_jardin() && this.nbr_piscine==m.getNbr_piscine()&& this.sup_habituel==m.getSup_habituel()) return true;
        return false;
    }

    public int hashCode() {
        return (this.nbr_etage*this.nbr_garage) + (this.nbr_jardin*this.nbr_piscine) ;
    }



}
