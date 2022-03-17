
package modele;

/**
 *
 * c
 */
public class Salle {
    
    //Attributs
    private int numSalle;
    private int nbrPlaces;
        
    //Constructeurs
    public Salle(){
        numSalle = 0;
        nbrPlaces = 150;
    }
    
    //Accesseurs
    public int getNbrPlaces() {
        return nbrPlaces;
    }

    public void setNbrPlaces(int nbrPlaces) {
        this.nbrPlaces = nbrPlaces;
    }

    public int getNumSalle() {
        return numSalle;
    }

    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }
    //Methodes
    
}
