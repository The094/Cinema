
package modele;

/**
 *
 * @author Théo
 */
public class Film {
    //Attributs
    private int idFilm;
    private String nomFilm;
    private String realisateur;
    private String genreFilm;
    private String dureeFilm;
    private int ageClient;
    private int noteFilm;
    
    //Constructeur
    public Film(){
        idFilm = 0;
        nomFilm = "";
        realisateur = "";
        genreFilm = "";
        dureeFilm = "";
        ageClient = 0;
        noteFilm = 0;
    }
    //Accesseurs
    public int getIdFilm() {
        return idFilm;
    }
    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getNomFilm() {
        return nomFilm;
    }
    public void setNomFilm(String nomFilm) {
        this.nomFilm = nomFilm;
    }

    public String getRealisateur() {
        return realisateur;
    }
    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getGenreFilm() {
        return genreFilm;
    }
    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    public String getDureeFilm() {
        return dureeFilm;
    }
    public void setDureeFilm(String dureeFilm) {
        this.dureeFilm = dureeFilm;
    }

    public int getAgeClient() {
        return ageClient;
    }
    public void setAgeClient(int ageClient) {
        this.ageClient = ageClient;
    }

    public int getNoteFilm() {
        return noteFilm;
    }
    public void setNoteFilm(int noteFilm) {
        this.noteFilm = noteFilm;
    }
    
    //Methodes
    
    
}
