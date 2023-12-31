package GestionClients;

public interface ClientFactory {
    Client createClient(String nom, String identifiant);
}