import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;

public class Serveur {
    ArrayList<Client> refs = new ArrayList<Client>();

    Serveur(){

    }
    boolean connecter (Client cl){
        try {
            System.out.println(cl.nom+" Connected to server..");
            refs.add(cl);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    void diffuser(String message){
        System.out.println("\nBroadcasting the message to clients..");
        for (int i=0;i<refs.size()-1;i++){
            refs.get(i).recevoir(message);
        }
    }
}
