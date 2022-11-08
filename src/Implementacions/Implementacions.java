package Implementacions;

import Interficies.DAO;
import Objects.*;

import java.sql.Connection;
import java.util.List;

public class Implementacions implements DAO {

    @Override
    public List<Client> TotsCli() {

        return null;
    }

    @Override
    public Client cercaClient(int id, Connection con) {
        return null;
    }


    @Override
    public boolean createClient(Client cli, Connection con) {

        return false;
    }

    @Override
    public boolean updateClient(Client cli, Connection con) {
        return false;
    }

    @Override
    public boolean deleteClient(Client cli, Connection con) {
        return false;
    }

    @Override
    public List<Bitllet> TotsBit() {
        return null;
    }

    @Override
    public Client cercaBitllet(int id, Connection con) {
        return null;
    }

    @Override
    public boolean createBitllet(Bitllet bit, Connection con) {
        return false;
    }

    @Override
    public boolean updateBitllet(Bitllet bit, Connection con) {
        return false;
    }

    @Override
    public boolean deleteBitllet(Bitllet bit, Connection con) {
        return false;
    }

    @Override
    public List<Compra> TotsCom() {
        return null;
    }

    @Override
    public Client cercaCompra(int id, Connection con) {
        return null;
    }

    @Override
    public boolean createCompra(Compra com, Connection con) {
        return false;
    }

    @Override
    public boolean updateCompra(Compra com, Connection con) {
        return false;
    }

    @Override
    public boolean deleteCompra(Compra com, Connection con) {
        return false;
    }

    @Override
    public List<Localitat> TotsLoc() {
        return null;
    }

    @Override
    public Client cercaLocalitat(int id, Connection con) {
        return null;
    }

    @Override
    public boolean createLocalitat(Localitat loc, Connection con) {
        return false;
    }

    @Override
    public boolean updateLocalitat(Localitat loc, Connection con) {
        return false;
    }

    @Override
    public boolean deleteLocalitat(Localitat loc, Connection con) {
        return false;
    }

    @Override
    public List<Transport> TotsTran() {
        return null;
    }

    @Override
    public Client cercaTransport(int id, Connection con) {
        return null;
    }

    @Override
    public boolean createTransport(Transport tra, Connection con) {
        return false;
    }

    @Override
    public boolean updateTransport(Transport tra, Connection con) {
        return false;
    }

    @Override
    public boolean deleteTransport(Transport tra, Connection con) {
        return false;
    }

    @Override
    public List<Viatge> TotsVia() {
        return null;
    }

    @Override
    public Client cercaViatge(int id, Connection con) {
        return null;
    }

    @Override
    public boolean createTViatge(Viatge via, Connection con) {
        return false;
    }

    @Override
    public boolean updateViatge(Viatge via, Connection con) {
        return false;
    }

    @Override
    public boolean deleteViatge(Viatge via, Connection con) {
        return false;
    }
}
