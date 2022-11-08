package Interficies;

import Objects.Bitllet;
import Objects.Client;
import Objects.Localitat;

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





    List<Localitat> TotsLoc();
    Client cercaLocalitat(int id);

    boolean createLocalitat(Localitat loc);
    boolean updateLocalitat(Localitat loc);
    boolean deleteLocalitat(Localitat loc);

}
