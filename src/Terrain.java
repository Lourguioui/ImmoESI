
public class Terrain extends Non_Habitable{



    public Terrain(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                   boolean negoc_prix, String description, String date_ajout, String photo, int ID, String statu_juru,
                   int nbr_facede) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, ID, statu_juru,
                nbr_facede);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean equals(Non_Habitable n) {
        // TODO Auto-generated method stub
        return super.equals(n);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

}
