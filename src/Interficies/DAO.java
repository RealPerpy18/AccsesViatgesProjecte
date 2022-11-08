package Interficies;

import Objects.Client;
import java.util.List;

public interface DAO {
    List<Client> Tots();
    Client cercaClient(int id);

    boolean createClient(Client cli);
    boolean updateClient(Client cli);
    boolean deleteClient(Client cli);

}
