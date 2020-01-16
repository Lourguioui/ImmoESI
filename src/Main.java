import java.util.*;
public class Main {
   ;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> Administrateurs = new ArrayList<String>();
        Administrateurs.add("Admin");
        Administrateurs.add("12345678");
        TreeSet<Bien> listeBien = new TreeSet<Bien>();
        TreeSet<Bien> listeBien1 = new TreeSet<Bien>();
        TreeSet<Bien> listeBien2 = new TreeSet<Bien>();
        TreeSet<Bien> listeBien3 = new TreeSet<Bien>();
        TreeSet<Bien> listeBien4 = new TreeSet<Bien>();
        TreeSet<Bien> bienArchives = new TreeSet<Bien>();
        HashSet<Wilaya> wilayas = new HashSet<Wilaya>();
        HashSet<Proprietaire> props = new HashSet<Proprietaire>();
        ArrayList<Message> messages = new ArrayList<Message>();
        Client client = new Client("imed19", "0000");
        Message msg = new Message(123456, "salut salut salut", client.getUsername());
        Message msg1 = new Message(145134, "salut qsfq qfsf", client.getUsername());
        Message msg2 = new Message(121134, "dqsdq qsfq qfsf", client.getUsername());
        messages.add(msg2);messages.add(msg1);messages.add(msg);
        //liste de 4 propriétaires (Prop1, Prop2, Prop3, Prop4)
        Proprietaire prop1 = new Proprietaire("slimani", "imed", "ii_slimani@esi.dz", "0549554612", "Ain Temouchent, BARAKA de TOUNSI bloc V numero 8", 123456, listeBien1);
        Proprietaire prop2 = new Proprietaire("lourgui", "zoher", "iz_lourgui@esi.dz", "0689554612", "Tizi Ouzou, BARAKA de TOUNSI bloc V numero 8", 133856, listeBien2);
        Proprietaire prop3 = new Proprietaire("zebich", "youcef", "iy_zebich@esi.dz", "0598343182", "Sétif, numero 17", 356486, listeBien3);
        Proprietaire prop4 = new Proprietaire("meziti", "imad", "im_meziti@esi.dz", "0735614612", "Borj Bou Ariridj, numero 18", 323456, listeBien4);
        props.add(prop1);props.add(prop2);props.add(prop3);props.add(prop4);
        // liste de 3 wilaya  ( wilaya1, 100 000 DA/m2) ( wilaya2, 30 000 DA/m2) ( wilaya3, 60 000 DA/m2)
        Wilaya wilaya1 = new Wilaya("wilaya1", 100000);
        Wilaya wilaya2 = new Wilaya("wilaya2", 30000);
        Wilaya wilaya3 = new Wilaya("wilaya3", 60000);
        wilayas.add(wilaya1);wilayas.add(wilaya2);wilayas.add(wilaya3);
        //liste de 8 biens
        Date date0 = new Date("31/10/2010");
        Appartement bien1 = new Appartement("25 rue La Boétie",120,"vente",4000000,prop2,true,"From the outside this house looks posh and extravagant",date0,"https://www.example.com/border/amount.aspx\r\n",123456,wilaya1,true,4,1,"simplex",true);
        Date date1 = new Date("21/11/2011");
        Appartement bien2 = new Appartement("4294  Fincham Road",200,"vente",10000000,prop1,true,"The building is shaped like a short U",date1,"http://example.net/border.php#bath",214830,wilaya3,true,4,1,"simplex",true);
        Date date2 = new Date("30/9/2012");
        Terrain bien3 = new Terrain("274  Lindale Avenue",500,"vente",20000000,prop1,true,"The building is shaped like a squared S",date2,"http://example.net/border.php#bath",212130,wilaya1,"",3);
        Date date3 = new Date("31/10/2014");
        Appartement bien4 = new Appartement("172  Rainbow Road",100,"location",40000,prop2,true,"The two extensions are linked by cloth sunscreens",date3,"http://example.net/border.php#bath",214831,wilaya3,true,3,1,"simplex",true);
        Date date4 = new Date("10/12/2015");
        Maison bien5 = new Maison("1812  Creekside Lane",160,"location",150000,prop3,true,"The building is shaped like a T",date4,"http://example.net/border.php#bath",214832,wilaya2,true,4,0,0,1,0,160);
        Date date5 = new Date("1/2/2016");
        Appartement bien6 = new Appartement("1373  Cabell Avenue",50,"location",60000,prop2,true,"The roof is high and slanted to one side",date5,"http://example.net/border.php#bath",214833,wilaya3,true,4,6,"duplexe",false);
        Date date6 = new Date("11/4/2017");
        Terrain bien7 = new Terrain("274  Lindale Avenue",500,"echange",18000000,prop1,true,"The building is shaped like a squared S",date6,"http://example.net/border.php#bath",212131,wilaya1,"",1);
        Date date7 = new Date("18/7/2018");
        Maison bien8 = new Maison("1812  Creekside Lane",200,"echange",14000000,prop2,true,"The building is shaped like a T",date7,"http://example.net/border.php#bath",214834,wilaya2,true,4,0,1,0,0,200);
        listeBien.add(bien1);listeBien.add(bien2);listeBien.add(bien3);listeBien.add(bien4);listeBien.add(bien5);listeBien.add(bien6);listeBien.add(bien7);listeBien.add(bien8);
        listeBien1.add(bien2);listeBien1.add(bien3);listeBien1.add(bien7);
        listeBien2.add(bien1);listeBien2.add(bien4);listeBien2.add(bien6);listeBien2.add(bien8);
        listeBien3.add(bien5);
        Administrateur admin = new Administrateur(listeBien, bienArchives, props, wilayas, messages);
        System.out.print("                        ____________________________________     ______________________________________\n");
        System.out.print("                     .-/|       ~~~~~~ ***** ~~~~~~          \\ /           ~~~~~~ ***** ~~~~~~        |\\-.\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||  Ecole Superieure d'Informatique    :       Cycle preparatoire  (2CP)       ||||\n");
        System.out.print("                     ||||");
        System.out.print("                     _");
        System.out.print("               :              Module : POO             ||||\n");
        System.out.print("                     ||||");
        System.out.print("                    |_|");
        System.out.print("              :                    TP                 ||||\n");
        System.out.print("                     ||||");
        System.out.print("                    /_/");
        System.out.print("              :                                       ||||\n");
        System.out.print("                     ||||");
        System.out.print("            ___  ___ _");
        System.out.print("               :                                       ||||\n");
        System.out.print("                     ||||");
        System.out.print("           / _ \\/ __| |");
        System.out.print("              :                                       ||||\n");
        System.out.print("                     ||||");
        System.out.print("          |  __/\\__ \\ |              :");
        System.out.print("                                       ||||\n");
        System.out.print("                     ||||");
        System.out.print("           \\___||___/_|              : ");
        System.out.print("                                      ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||");
        System.out.print("  Programme : ");
        System.out.print("                       :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||  Gestion d'une agence immobiliere   :                                       ||||\n");
        System.out.print("                     ||||                                     :");
        System.out.print("   Realise par :");
        System.out.print("                       ||||\n");
        System.out.print("                     ||||    --> Manipulation des classes     :                                       ||||\n");
        System.out.print("                     ||||    --> Manipulation de l'heritage   :");

        System.out.print("     --> Lourguioui Zoher");
        System.out.print("             ||||\n");
        System.out.print("                     ||||    --> ...                          :");

        System.out.print("     --> Sliman Imadeeddin");
        System.out.print("                    ||||\n");

        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :");

        System.out.print("        Section B Groupe 6");
        System.out.print("             ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :");

        System.out.print("   Encadre par :");
        System.out.print("                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :");

        System.out.print("                Mme Sadeg");
        System.out.print("           ||||\n");
        System.out.print("                     ||||____________________________________ : ______________________________________||||\n");
        System.out.print("                     ||/=====================================\\:/=======================================\\||\n");
        System.out.print("                     `--------------------------------------~___~---------------------------------------''\n\n\n");
        int choix;
        do {
            System.out.println("1-Se connecter en tant qu'administrateur.");
            System.out.println("2- Utiliser la platform en tant qu'un utilisateur public.");
            System.out.println("3-Quitter");
            choix = input.nextInt();
            input.nextLine();
            switch (choix){

                case 2:

                        do {


                            System.out.println("    1 - affichage des biens d'un proprietaire");
                            System.out.println("    2 - affichage detaille d'un bien");
                            System.out.println("    3 - calcul des prix");
                            System.out.println("    4 - recherche filtree");
                            System.out.println("    5 - Envoyer un messages");
                            System.out.println("    6 - afficher tous les biens existants");
                            System.out.println("    7 - Quitter\n");
                            choix = input.nextInt();
                            switch (choix) {
                                case 1:
                                    System.out.println("Donnez le ID du proprietaire :");
                                    int ID = input.nextInt();
                                    input.nextLine();
                                    admin.findProp(ID).Afficher_listeBien();
                                    break;

                                case 2:
                                    System.out.println("Donnez le ID du bien :");
                                    int ID_bien;
                                    ID_bien = input.nextInt();
                                    input.nextLine();
                                    Bien bien = admin.findBien(ID_bien);
                                    if (bien instanceof Maison){
                                        bien = (Maison) bien;
                                        ((Maison) bien).Afficher();
                                    }if (bien instanceof Appartement){
                                        ((Appartement) bien).Afficher();
                                    }if (bien instanceof Terrain){
                                        bien = (Terrain) bien;
                                        ((Terrain) bien).Afficher();
                                    }
                                    break;

                                case 3:
                                    for (Bien bien1_ : admin.getBiens()){
                                        System.out.println("##############################################################################");
                                        System.out.println("Le ID du bien :" + bien1_.getID());
                                        if (bien1_ instanceof Maison){
                                            System.out.println(((Maison) bien1_).calculer_prix());
                                        }if (bien1_ instanceof Appartement){
                                            System.out.println(((Appartement) bien1_).calculer_prix());
                                        }if (bien1_ instanceof Terrain){
                                            System.out.println(((Terrain) bien1_).calculer_prix());
                                        }
                                    }
                                    break;
                                case 4:
                                    try{
                                        TreeSet<Bien> biens_filtre = admin.recherche_criteres();
                                        System.out.println("Choisisez une options :");
                                        System.out.println("1- Afficher la liste des biens flitre");
                                        System.out.println("2-Ajaouter un filtre à la recherche ");
                                        int Choix = input.nextInt();
                                        input.nextLine();
                                        System.out.println(Choix);
                                        switch (Choix){
                                            case 1:
                                                System.out.println("fdsggsddsgsdv");
                                                for (Bien __bien : biens_filtre){
                                                    System.out.println("########################################");
                                                    __bien.Afficher_bien();
                                                }
                                                break;
                                            case 2:
                                                try {
                                                    TreeSet<Bien> biens_filtre_ = admin.Ajouter_criter(biens_filtre);
                                                    for (Bien Bien : biens_filtre_){
                                                        System.out.println("#################################################");
                                                        Bien.Afficher_bien();
                                                    }
                                                }catch (WrongInputException e){
                                                    System.out.println("Wrong input");
                                                }

                                                break;
                                        }
                                    }catch (NotAChoiceExeption exeption){
                                        System.out.println("Choisisez une autre reponse. ");
                                    }
                                    catch(IsNotMaisonExeotion e){
                                        System.out.println("Le bien n'est pas une maison");
                                    }
                                    catch (NegativeValueException Exeption){
                                        System.out.println("Vous avez entré une valeur negative");
                                    }
                                    finally {

                                        break;
                                    }


                                case 5:
                                    client.envoyerMessage(admin);
                                    break;
                                case 6:
                                    admin.Afficher_listeBien();
                                    break;
                                case 7:
                                    break;
                            }

                        }while(true);

                case 1:
                    System.out.println("Donnez l'identifiant de l'utilisateur");
                    String id = input.nextLine();
                    System.out.println("Donnez le mot de passe de l'administrateur");
                    String pwrd = input.nextLine();
                    if (Administrateurs.contains(id) && Administrateurs.contains(pwrd)) {
                        System.out.println("    1 - ajouter un bien");
                        System.out.println("    2 - suppression d'un bien");
                        System.out.println("    3 - archiver un bien");
                        System.out.println("    4 - modification d'un bien ");
                        System.out.println("    5 - Quitter\n");
                        int choix1 = input.nextInt();
                        input.nextLine();
                        switch (choix1) {
                            case 1:
                                try {
                                    admin.Ajouter();
                                } catch (HabituelException e) {
                                    System.out.println("Vous avez donné une superficie habitable plus grande que la superfici total!!");
                                } catch (NegativeValueException ex) {
                                    System.out.println("Vous avez donné une valeur negative!!");
                                }catch(NotAChoiceExeption e0){
                                    System.out.println("ce choix n'existe pas");
                                }
                                break;
                            case 2:
                                try {
                                    admin.Supprimer();
                                } catch (NegativeValueException e) {
                                    System.out.println("vous avez donné une valeur negative");
                                }
                                break;
                            case 3:
                                try {
                                    admin.Archiver();
                                } catch (NegativeValueException ex) {
                                    System.out.println("Vous avez donné une valeur negative");
                                }
                            case 4:
                                try {
                                    admin.Modifier();
                                } catch (WrongInputException e) {
                                    System.out.println("Vous avez donné une valeur non valide");
                                } catch (HabituelException ex) {
                                    System.out.println("Vous avez donné une superficie habituel plus gerande que al superficie total");
                                }
                                break;
                            case 5:
                                break;
                        }
                    }else{
                        System.out.println("mot de passe ou l'identifiant n'existe pas");
                    }
            }

        }while(true);
      




    }

}
