package modele;

public class Cinema {
    /**
     * Attributs de la classe Cinema
     * Avec comme attribut static le nom de la ville
     */
    public static String nomVille;
    private String id;
    private String login;
    private String mdp;
        
    //Constructeurs
    public Cinema() {
        nomVille = "Paris";
        id = "cinema";
        login = "root";
        mdp = "mdppoo";        
    }

    //Getters et Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
        
    //Methodes
    
}
