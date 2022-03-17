
package modele;

public class Seance {
    //Attributs
    private int idSeance;
    private int numSalle;
    private String titreFilm;
    private int horaire;
    
    //Constructeur
    public Seance(){
        idSeance = 0;
        numSalle = 0;
        titreFilm = "";
        horaire = 0;
    }
    
    //Accesseurs
    public int getIdSeance() {
        return idSeance;
    }
    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public int getNumSalle() {
        return numSalle;
    }
    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }

    public String getTitreFilm() {
        return titreFilm;
    }
    public void setTitreFilm(String titreFilm) {
        this.titreFilm = titreFilm;
    }

    public int getHoraire() {
        return horaire;
    }
    public void setHoraire(int horaire) {
        this.horaire = horaire;
    }
    
}
