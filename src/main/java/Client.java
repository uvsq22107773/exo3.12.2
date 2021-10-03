import java.util.Scanner;


public class Client {
    String nom;
    Serveur serveur ;

    Client(String n, Serveur s){
        this.nom = n ;
        this.serveur = s;
    }
    boolean seConnecter(){
        System.out.println("\n"+this.nom+" Connnecting to serverur..");
        System.out.println(this.serveur.connecter(this));
        return true;
    }
    void envoyer(String msg){
        System.out.println("\nje suis Client "+this.nom+" et Je suis en train d'envoyer un message au serveur \n"+msg);
        this.serveur.diffuser(msg);
    }
    void recevoir(String message){
        System.out.println("\nje suis Client "+this.nom+" et J'ai recu un message\n"+message);
    }

    public static void main(String[] args) {
        Serveur serveur = new Serveur() ;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Nom Client 1 : ");
        String nom = myObj.nextLine();

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter Nom Client 2 : ");
        String nom2 = myObj2.nextLine();

        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Enter Nom Client 3 : ");
        String nom3 = myObj3.nextLine();

        Client c1 = new Client(nom,serveur);
        Client c2 = new Client(nom2,serveur);
        Client c3 = new Client(nom3,serveur);

        String message="BLA BLA MESSAGE";
        c1.seConnecter();
        c2.seConnecter();
        c3.seConnecter();
        System.out.println("\n============================\nSending the message from "+c3.nom+" to "+c1.nom+" ,"+c2.nom);
        c3.envoyer(message);

    }
}
