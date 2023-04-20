package HomeWork_5.service;

import HomeWork_5.model.Client;

import java.util.List;

public interface ClientService {
    void addClient(Client client);
    void removeClient(Client client);
    void showClients();
    List<Client> getClients();
    void clientChangeBalance(int id, int value);

}
