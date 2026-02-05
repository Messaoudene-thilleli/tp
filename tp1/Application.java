import javax.xml.ws.Endpoint;

public class Application {

    public static void main(String[] args) {
        System.out.println("debut de deploiement de mon service");

        // adresse utilisee pour publier le service web
        String url="http://localhost:8888/" ; 

        // methode qui permet de lancer le service web
        Endpoint.publish(url, new MonserviceWeb());

        // message pour verifier que le service est bien lance
        System.out.println("Le service Web est déployé !");
    }
}
