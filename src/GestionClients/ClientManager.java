package GestionClients;

import java.util.HashMap;
import java.util.Map;

public class ClientManager {
private static ClientManager instance;
private Map<String, Client> clients;

private ClientManager() {
    clients = new HashMap<>();
}

public static synchronized ClientManager getInstance() {
    if (instance == null) {
        instance = new ClientManager();
    }
    return instance;
}

public Client getClient(String identifiant) {
    return clients.get(identifiant);
}

public void addClient(Client client) {
    clients.put(client.getIdentifiant(), client);
}
}
