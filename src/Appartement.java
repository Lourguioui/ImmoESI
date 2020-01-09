import java.util.Date;

public class Appartement extends Habitable{
    private int etage;
    private String type;
    private boolean ascenseur;


    public Appartement(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                       boolean negoc_prix, String description, Date date_ajout, String photo, int iD, Wilaya wilaya,
                       boolean meuble, int nbr_piece, int etage, String type, boolean ascenseur) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, iD, wilaya,
                meuble, nbr_piece);
        this.etage = etage;
        this.type = type;
        this.ascenseur = ascenseur;
    }



    public int getEtage() {
        return etage;
    }



    public void setEtage(int etage) {
        this.etage = etage;
    }



    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }



    public boolean isAscenseur() {
        return ascenseur;
    }



    public void setAscenseur(boolean ascenseur) {
        this.ascenseur = ascenseur;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (ascenseur ? 1231 : 1237);
        result = prime * result + etage;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        Appartement other = (Appartement) obj;
        if (ascenseur != other.ascenseur)
            return false;
        if (etage != other.etage)
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }



    @Override
    public int compareTo(Bien o) {
        // TODO Auto-generated method stub
        return super.compareTo(o);
    }


    public void Afficher(){
        System.out.println("L'adresse de de l'appartement est : " + getAdresse());
        System.out.println("La superficié de l'appartement est :" + getSuperficie());
        System.out.println("La nature de transaction de l'appartement ");
        System.out.println("Le prix de l'appartement est :" + getPrix());
        System.out.println("Le propietaire de l'appartement est : " + getProp());
        if (isNegoc_prix()){
            System.out.println("Le prix de cet appartement est negociable.");
        }else{
            System.out.println("Le prix de cet appartement n'est pas negociable.");
        }
        System.out.println("Description :" + getDescription());
        System.out.println("La date d'ajout de l'appartement est :"  + getDate_ajout());
        System.out.println("Les Photo : ");
        System.out.println("Le nombre des pièces : " + getNbr_piece());
        if(isMeuble()){
            System.out.println("L'appartement est meublé");
        }else{
            System.out.println("L'appartement n'est pas meublé");
        }
        System.out.println("Le nombres des etages de l'appartement est : " + getEtage());
        System.out.println("Le type de l'appartement est : " + getType());
    }
    public double calculer_prix(){
        double prix;
        prix = this.getPrix();
        if (this.getNatu_trans().equals("Vente")  || this.getNatu_trans().equals("vente")){
            if (this.getEtage() >= 0 && this.getEtage() <= 2){
                prix =+ 50000;
                if (this.getPrix() < 5000000){

                    if (this.wilaya.getPrix_metre() < 50000){
                        prix =+ (prix*3)/100;
                        return prix;
                    }else{
                        prix =+ (prix*3.5)/100;
                        return prix;
                    }
                }
                if (this.getPrix() >= 5000000 && this.getPrix() <= 15000000){
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
        if (this.getNatu_trans().equals("Location") || this.getNatu_trans().equals("location")){

        }
        return prix;
    }
}
