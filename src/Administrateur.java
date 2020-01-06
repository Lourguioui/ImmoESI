import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class Administrateur extends Agence{

    public Administrateur(HashSet<Maison> maisons, HashSet<Appartement> appartements, HashSet<Terrain> terrains,
                          HashSet<Bien> bienArchives, HashSet<Proprietaire> listeProprietaire, HashSet<Wilaya> listeWilaya) {
        super(maisons, appartements, terrains, bienArchives, listeProprietaire, listeWilaya);
        // TODO Auto-generated constructor stub
    }

    public Proprietaire findProp(int ID) {
        for(Proprietaire p : this.listeProprietaire) {
            if(p.getID()==ID) return p;
        }
        return null;
    }

    public void Ajouter() {
        Scanner input = new Scanner(System.in);
        boolean negoc=true;
        boolean meuble=true;
        boolean habitable=true;
        System.out.println("Veuillez entrer l'ID du proprietaire : ");
        int ID = input.nextInt();
        System.out.println("Veuillez indiquez si le bien est habitable (oui/non): ");
        String habit = input.nextLine();
        if(habit=="oui" || habit=="OUI") habitable=true;else habitable=false;
        Proprietaire p = this.findProp(ID);
        System.out.println("Veuillez entrer le type du bien : ");
        String typeBien = input.nextLine();
        System.out.println("Veuillez entrer l'adresse du bien : ");
        String adresse = input.nextLine();
        System.out.println("Veuillez entrer la superficie du bien : ");
        double superficie = input.nextDouble();
        System.out.println("Veuillez entrer la nature de transaction du bien : ");
        String natu_trans = input.nextLine();
        System.out.println("Veuillez entrer le prix du bien : ");
        double prix = input.nextDouble();
        System.out.println("Veuillez préciser si le bien est négociable ou pas (oui/non): ");
        String negociable = input.nextLine();
        if(negociable=="oui" || negociable=="OUI") {negoc=true;}
        else negoc=false;
        System.out.println("Veuillez entrer une description du bien : ");
        String description = input.nextLine();
        System.out.println("Veuillez entrer la date d'ajout du bien : ");
        String date = input.nextLine();
        System.out.println("Veuillez entrer une photo du bien (URL): ");
        String photo = input.nextLine();
        System.out.println("Veuillez entrer l'ID du bien : ");
        int ID0 = input.nextInt();
        if(habitable) {
            System.out.println("Veuillez préciser si le bien est meublé (oui/non) : ");
            String meuble0 = input.nextLine();
            if(meuble0=="oui" || meuble0=="OUI") meuble=true;else meuble=false;
            System.out.println("Veuillez entrer le nombre de pièce du bien : ");
            int nbr_piece = input.nextInt();
            if(typeBien=="Maison" || typeBien=="maison" || typeBien=="MAISON") {
                System.out.println("Veuillez entrer le nombre d'étages du maison : ");
                int nbr_etage = input.nextInt();
                System.out.println("Veuillez entrer le nombre de garages du maison : ");
                int nbr_garage = input.nextInt();
                System.out.println("Veuillez entrer le nombre de piscines du maison : ");
                int nbr_piscine = input.nextInt();
                System.out.println("Veuillez entrer le nombre de jardins du maison : ");
                int nbr_jardin = input.nextInt();
                System.out.println("Veuillez entrer la superficie habitable du bien : ");
                Double sup_habituel = input.nextDouble();
                Maison maison = new  Maison(adresse, superficie, natu_trans, prix,  p, negoc, description, date, photo, ID0, meuble, nbr_piece, nbr_etage, nbr_garage, nbr_piscine, nbr_jardin, sup_habituel);
                p.getListeBien().add(maison);
                this.getMaisons().add(maison);
            }
            else {
                System.out.println("Veuillez entrer le numero de l'étage du bien : ");
                int num_etage = input.nextInt();
                System.out.println("Veuillez préciser si le bien s'agit d'un simplex ou d'un duplexe : ");
                String type = input.nextLine();
                Appartement appartement = new Appartement(adresse, superficie, natu_trans, prix, p, negoc, description, date, photo, ID0, meuble, nbr_piece, num_etage, type);
                p.getListeBien().add(appartement);
                this.getAppartements().add(appartement);
            }
        }else {
            System.out.println("Veuillez indiquez le statut juridique : ");
            String statu_juru = input.nextLine();
            System.out.println("Veuillez indiquez le nombre de facades : ");
            int nbr_facade = input.nextInt();
            Terrain terrain = new Terrain(adresse, superficie, natu_trans, prix, p, negoc, description, date, photo, ID0, statu_juru, nbr_facade);
            p.getListeBien().add(terrain);
            this.getTerrains().add(terrain);
        }
    }

    public void Supprimer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer l'ID du proprietaire : ");
        int ID0 = input.nextInt();
        System.out.println("Veuillez entrer l'ID du bien : ");
        int ID = input.nextInt();
        Proprietaire p = this.findProp(ID0);
        this.bienArchives.add(p.findBien(ID));
        p.getListeBien().remove(p.findBien(ID));
    }

	/*public Bien rechercherCritere() {
		Scanner input = new Scanner(System.in);
		System.out.println("Veuillez indiquez le critère de recherche du bien : ");

	}*/
}
