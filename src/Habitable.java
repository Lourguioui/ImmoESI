
abstract class Habitable extends Bien {
    private boolean meuble;
    private int nbr_piece;

    public Habitable(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                     boolean negoc_prix, String description, String date_ajout, String photo, int ID, boolean meuble,
                     int nbr_piece) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, ID);
        this.meuble = meuble;
        this.nbr_piece = nbr_piece;
    }
    public boolean isMeuble() {
        return meuble;
    }
    public void setMeuble(boolean meuble) {
        this.meuble = meuble;
    }
    public int getNbr_piece() {
        return nbr_piece;
    }
    public void setNbr_piece(int nbr_piece) {
        this.nbr_piece = nbr_piece;
    }
    public boolean equals(Habitable h) {
        if(super.equals(h) && this.meuble==h.isMeuble() && this.nbr_piece==h.getNbr_piece()) return true;
        return false;
    }
    public int hashCode() {
        return 31*this.nbr_piece;
    }
}
