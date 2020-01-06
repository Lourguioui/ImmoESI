
abstract class Non_Habitable extends Bien {
    private String statu_juru;
    private int nbr_facede;

    public Non_Habitable(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                         boolean negoc_prix, String description, String date_ajout, String photo, int ID, String statu_juru,
                         int nbr_facede,String nom,double prix_metre) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, ID, nom, prix_metre);
        this.statu_juru = statu_juru;
        this.nbr_facede = nbr_facede;
        this.wilaya.setPrix_metre(prix_metre);
        this.wilaya.setNom(nom);
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
    public boolean equals(Non_Habitable n) {
        if(super.equals(n) && this.statu_juru==n.getStatu_juru() && this.nbr_facede==n.getNbr_facede()) return true;
        return false;
    }
    public int hashCode() {
        return 31*this.nbr_facede;
    }
}
