package controleur;
import java.sql.*;
import vue.Fenetre;

public class MyMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Cinema a = new Cinema();
        Fenetre test = new Fenetre();
        Connexion connexionTable = new Connexion(a.getId(), a.getLogin(), a.getMdp());
        System.out.println(a.getId() + " à " + Cinema.nomVille);
    }
}
