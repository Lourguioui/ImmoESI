import java.security.PublicKey;

public class Terrain extends Non_Habitable{



    public Terrain(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                   boolean negoc_prix, String description, String date_ajout, String photo, int ID, String statu_juru,
                   int nbr_facede,String nom,double prix_metre) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, ID, statu_juru,
                nbr_facede,nom,prix_metre);
        // TODO Auto-generated constructor stub
    }
    public void Afficher(){}
    public double calculer_prix(){
        double prix = 0;
        return prix;
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
