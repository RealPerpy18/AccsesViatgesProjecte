package Implementacions;

import Interficies.DAO;
import Objects.Bitllet;
import Objects.Client;

import java.util.List;

public class Implementacions implements DAO {

    @Override
    public List<Bitllet> TotsBit() {
        return null;
    }

    @Override
    public Client cercaBitllet(int id) {
        return null;
    }

    @Override
    public boolean createBitllet(Bitllet bit) {
        return false;
    }

    @Override
    public boolean updateBitllet(Bitllet bit) {
        return false;
    }

    @Override
    public boolean deleteBitllet(Bitllet bit) {
        return false;
    }
}
