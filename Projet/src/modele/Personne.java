
package modele;

public class Personne {
    //Attributs
    private String login;
    private String mdp;
    private int age;
    private int reduction;
    private String statut;
    
    //Constructeur
    public Personne(){
        login = "";
        mdp = "";
        age = 0;
        reduction = 0;
        statut = "";
    }
    
    //Accesseurs
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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getReduction() {
        return reduction;
    }
    public void setReduction(int reduction) {
        this.reduction = reduction;
    }

    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    //Methodes
}
