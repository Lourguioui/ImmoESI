import java.util.Date;

abstract class Habitable extends Bien implements Comparable<Bien>{
    private boolean meuble;
    private int nbr_piece;

    public Habitable(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                     boolean negoc_prix, String description, Date date_ajout, String photo, int iD, Wilaya wilaya,
                     boolean meuble, int nbr_piece) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, iD, wilaya);
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (meuble ? 1231 : 1237);
        result = prime * result + nbr_piece;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Habitable other = (Habitable) obj;
        if (meuble != other.meuble)
            return false;
        if (nbr_piece != other.nbr_piece)
            return false;
        return true;
    }
    @Override
    public int compareTo(Bien o) {
        return super.compareTo(o);
    }


}
