package vue;

/**
 * Librairies importées
 */
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import modele.*;

public class Fenetre extends JFrame implements ActionListener {

    private final JButton boutonExit = new JButton("EXIT");
    private final JButton boutonBienvenue = new JButton("Bienvenue");
    private final JButton boutonClient = new JButton("Client"), espaceClient = new JButton("Espace Client");
    private final JButton boutonEmployé = new JButton("Employé"), espaceEmployé = new JButton("Espace Employé");
    private JLabel login = new JLabel("Login"), mdp = new JLabel("Mot de passe");
    private JTextField textLog = new JTextField(), textMdp = new JTextField();
    private final JPanel conteneur = new JPanel();

    /**
     * Constructeur qui cree une fenetre et l'affiche
     */
    public Fenetre() {
        /**
         * Taille de la fenetre
         */
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        /**
         * Titre de la fenetre
         */
        setTitle("Cinema");
        /**
         * Pour creer les boutons
         */
        boutonExit.setBackground(Color.lightGray);
        boutonExit.setBounds(0, 0, 60, 40);
        boutonBienvenue.setBackground(Color.lightGray);
        boutonBienvenue.setBounds(300, 100, 100, 100);

        boutonClient.setBackground(Color.lightGray);
        boutonClient.setBounds(200, 250, 100, 100);
        espaceClient.setBackground(Color.lightGray);
        espaceClient.setBounds(250, 50, 200, 100);

        boutonEmployé.setBackground(Color.lightGray);
        boutonEmployé.setBounds(400, 250, 100, 100);
        espaceEmployé.setBackground(Color.lightGray);
        espaceEmployé.setBounds(250, 50, 200, 100);

        login.setBackground(Color.lightGray);
        login.setBounds(200, 250, 100, 40);
        textLog.setBackground(Color.lightGray);
        textLog.setBounds(300, 260, 100, 20);

        mdp.setBackground(Color.lightGray);
        mdp.setBounds(200, 300, 100, 40);
        textMdp.setBackground(Color.lightGray);
        textMdp.setBounds(300, 310, 100, 20);
        /**
         * On cree un conteneur pour ajouter les differents boutons
         */
        conteneur.setBackground(Color.gray);
        conteneur.setLayout(null);
        conteneur.add(boutonExit);
        conteneur.add(boutonBienvenue);
        setContentPane(conteneur);
        /**
         * On les ajoute au actionListernet
         */
        boutonExit.addActionListener(this);
        boutonBienvenue.addActionListener(this);
        boutonClient.addActionListener(this);
        boutonEmployé.addActionListener(this);

        /**
         * On affiche la fenetre
         */
        setVisible(true);
    }

    //Methodes 
    @Override
    public void actionPerformed(ActionEvent ev) {
        /**
         * Si bouton exit, alors on ferme le programme
         */
        if (ev.getSource() == boutonExit) {
            System.exit(0);
        }
        /**
         * Si bouton bienvenue, on affiche la premiere interface
         */
        if (ev.getSource() == boutonBienvenue) {
            System.out.println("Bienvenue");
            conteneur.remove(boutonBienvenue);
            conteneur.repaint();
            conteneur.add(boutonClient);
            conteneur.add(boutonEmployé);
            setContentPane(conteneur);
        }
        /**
         * Si bouton client, on rentre dans l'espace client pour la connexion
         */
        if (ev.getSource() == boutonClient) {
            System.out.println("Client");
            conteneur.remove(boutonBienvenue);
            conteneur.remove(boutonEmployé);
            conteneur.remove(boutonClient);
            conteneur.repaint();
            conteneur.add(espaceClient);
            setContentPane(conteneur);

            conteneur.add(login);
            conteneur.add(mdp);
            conteneur.add(textLog);
            conteneur.add(textMdp);
            setContentPane(conteneur);
        }
        /**
         * Si bouton employé, on rentre dans l'espace de connexion de l'employé
         */
        if (ev.getSource() == boutonEmployé) {
            System.out.println("Employé");
            conteneur.remove(boutonBienvenue);
            conteneur.remove(boutonEmployé);
            conteneur.remove(boutonClient);
            conteneur.repaint();
            conteneur.add(espaceEmployé);
            setContentPane(conteneur);
            
            conteneur.add(login);
            conteneur.add(mdp);
            conteneur.add(textLog);
            conteneur.add(textMdp);
            setContentPane(conteneur);
        }
    }
}
