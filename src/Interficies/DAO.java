package Interficies;

import Objects.*;

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



    List<Compra> TotsCom();
    Client cercaCompra(int id);

    boolean createCompra(Compra com);
    boolean updateCompra(Compra com);
    boolean deleteCompra(Compra com);

    List<Localitat> TotsLoc();
    Client cercaLocalitat(int id);

    boolean createLocalitat(Localitat loc);
    boolean updateLocalitat(Localitat loc);
    boolean deleteLocalitat(Localitat loc);


    List<Transport> TotsTran();
    Client cercaTransport(int id);

    boolean createTransport(Transport tra);
    boolean updateTransport(Transport tra);
    boolean deleteTransport(Transport tra);


    List<Viatge> TotsVia();
    Client cercaViatge(int id);

    boolean createTViatge(Viatge via);
    boolean updateViatge(Viatge via);
    boolean deleteViatge(Viatge via);


}
