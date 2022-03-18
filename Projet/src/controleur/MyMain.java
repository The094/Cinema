package controleur;
/**
 * Librairies et packages importes
 */
import modele.Cinema;
import java.sql.*;
import vue.Fenetre;

public class MyMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Creation d'un objet de la classe cinema
        Cinema a = new Cinema();
        Fenetre test = new Fenetre();
        //Creation de la classe connexion
        Connexion connexionTable = new Connexion(a.getId(), a.getLogin(), a.getMdp());
        System.out.println("Bienvenue au " + a.getId() + " de " + Cinema.nomVille);
    }
}
