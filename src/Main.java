import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
              Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/agencia_viatges","postgres","1234");

    }
}