import java.util.*;
public class Client {
    private String username;
    private String pword;
    public Client(String username, String pword) {
        this.username = username;
        this.pword = pword;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPword() {
        return pword;
    }
    public void setPword(String pword) {
        this.pword = pword;
    }

    public void envoyerMessage(Administrateur a) {
        Scanner input=new Scanner(System.in);
        System.out.println("Veuillez entrez l'id du bien concerné : ");
        int id=input.nextInt();
        input.nextLine();
        System.out.println("Veuillez entrez le message voulu : ");
        String message0=input.nextLine();
        Message message = new Message(id,message0,this.username);
        a.getListeMessage().add(message);
        System.out.println("Le message est envoyé avec succes");
    }
}