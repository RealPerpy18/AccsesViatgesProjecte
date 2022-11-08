package Interficies;

import Objects.Bitllet;
import Objects.Client;
import java.util.List;

public interface DAO {
    List<Client> TotsCli();
    Client cercaClient(int id);

    boolean createClient(Client cli);
    boolean updateClient(Client cli);
    boolean deleteClient(Client cli);

    List<Bitllet> TotsBit();
    Client cercaBitllet(int id);

    boolean createBitllet(Bitllet bit);
    boolean updateBitllet(Bitllet bit);
    boolean deleteBitllet(Bitllet bit);

}
