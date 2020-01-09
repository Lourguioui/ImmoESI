import java.util.Date;
abstract class Non_Habitable extends Bien implements Comparable<Bien>{
    private String statu_juru;
    private int nbr_facede;

    public Non_Habitable(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                         boolean negoc_prix, String description, Date date_ajout, String photo, int iD, Wilaya wilaya,
                         String statu_juru, int nbr_facede) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, iD, wilaya);
        this.statu_juru = statu_juru;
        this.nbr_facede = nbr_facede;
    }
    public String getStatu_juru() {
        return statu_juru;
    }
    public void setStatu_juru(String statu_juru) {
        this.statu_juru = statu_juru;
    }
    public int getNbr_facede() {
        return nbr_facede;
    }
    public void setNbr_facede(int nbr_facede) {
        this.nbr_facede = nbr_facede;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + nbr_facede;
        result = prime * result + ((statu_juru == null) ? 0 : statu_juru.hashCode());
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
        Non_Habitable other = (Non_Habitable) obj;
        if (nbr_facede != other.nbr_facede)
            return false;
        if (statu_juru == null) {
            if (other.statu_juru != null)
                return false;
        } else if (!statu_juru.equals(other.statu_juru))
            return false;
        return true;
    }
    @Override
    public int compareTo(Bien o) {
        return super.compareTo(o);
    }

}
