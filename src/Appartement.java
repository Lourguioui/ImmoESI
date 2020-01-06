
public class Appartement extends Habitable{
    private int etage;
    private String type;


    public Appartement(String adresse, double superficie, String natu_trans, double prix, Proprietaire prop,
                       boolean negoc_prix, String description, String date_ajout, String photo, int ID, boolean meuble,
                       int nbr_piece, int etage, String type,String nom,double prix_metre) {
        super(adresse, superficie, natu_trans, prix, prop, negoc_prix, description, date_ajout, photo, ID, meuble,
                nbr_piece,nom,prix_metre);
        this.etage = etage;
        this.type = type;
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
        double prix = 0;
        return prix;

    }
    public boolean equals(Appartement a) {
        if(super.equals(a)&& this.etage==a.getEtage() && this.type==a.getType())return true;
        return false;
    }

    public int hashCode() {
        return 31*this.etage;
    }
}
