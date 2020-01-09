public class Message {
    private int bien_ID;
    private String message;
    private String username;
    public Message(int bien_ID, String message, String username) {
        this.bien_ID = bien_ID;
        this.message = message;
        this.username = username;
    }
    public int getBien_ID() {
        return bien_ID;
    }
    public void setBien_ID(int bien_ID) {
        this.bien_ID = bien_ID;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void Afficher() {
        System.out.println("L'ID du bien concernée : "+this.bien_ID);
        System.out.println("Le message est envoyé par : "+this.username);
        System.out.println("le message : "+this.message);
    }
}
