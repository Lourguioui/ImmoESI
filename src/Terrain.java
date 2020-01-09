import java.util.Date;

public class Terrain extends Non_Habitable{




    public Terrain(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                   boolean negoc_prix, String description, Date date_ajout, String photo, int iD, Wilaya wilaya,
                   String statu_juru, int nbr_facede) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, iD, wilaya, statu_juru,
                nbr_facede);
        // TODO Auto-generated constructor stub
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }



    @Override
    public int compareTo(Bien o) {
        // TODO Auto-generated method stub
        return super.compareTo(o);
    }


    public void Afficher(){
        System.out.println("L'adresse du terrain est :" + this.getAdresse());
        System.out.println("La superficier du terrain est : " + this.getSuperficie());
        System.out.println("La nature de transaction du terrain est : " + this.getNatu_trans());
        System.out.println("Le prix du terrain est :" + this.getPrix());
        System.out.println("Le proprietaire du terrain est : " + this.getProp().getNom());
        System.out.println("Son nom est :" + this.getProp().getNom());
        System.out.println("Son adresse est :" + this.getProp().getAdresse());
        System.out.println("Son numero de telephone est :" + this.getProp().getTelephone());
        if (this.isNegoc_prix()){
            System.out.println("Le prix du terrain est negoceable.");
        }else {
            System.out.println("Le prix du terrain n'est pas negoceable.");
        }
        System.out.println("Description :" + this.getDescription());
        System.out.println("La date d'ajout du terrain est :" + this.getDate_ajout());
        System.out.println("Le statu jurudique :" + this.getStatu_juru());
        System.out.println("Le nombre de facades du terrain est :" + this.getNbr_facede());
    }
    public double calculer_prix(){
        double prix;
        prix = this.getPrix();
        if(this.getNatu_trans() == "Vente" || this.getNatu_trans() == "vente"  || this.getNatu_trans() == "Echange" || this.getNatu_trans() == "echange"){
            if (this.getNbr_facede() > 0){
                prix =+ (prix*0.5*this.getNbr_facede())/100;
                if (this.getPrix() < 5000000){

                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*3)/100;
                        return prix;
                    }else{
                        prix =+ (prix*3.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() >= 5000000 || this.getPrix() <= 15000000){
                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*2)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() > 15000000){
                    if(this.wilaya.getPrix_metre() > 70000){
                        prix =+ (prix*1)/100;
                        return prix;
                    }else{
                        prix =+ (prix*2)/100;
                        return prix;
                    }
                }
            }
        }
        if (this.getNatu_trans() == "Location" || this.getNatu_trans() == "location"){
            if (this.getSuperficie() < 60){
                if (this.wilaya.getPrix_metre() <50000){
                    prix =+ prix/100;
                    return prix;
                }else{
                    prix =+ (prix*1.5)/100;
                    return prix;
                }
            }
            if (this.getSuperficie() >= 60 && this.getSuperficie() <= 150){
                if (this.wilaya.getPrix_metre() < 50000){
                    prix =+ (prix*2)/100;
                    return prix;
                }else{
                    prix =+ (prix*2.5)/100;
                    return prix;
                }

            }
            if(this.getSuperficie() > 150){
                if (this.wilaya.getPrix_metre() < 50000){
                    prix =+ (prix*3)/100;
                    return prix;
                }else{
                    prix =+ (prix*3.5)/100;
                    return prix;
                }
            }
        }
        return prix;
    }

}
