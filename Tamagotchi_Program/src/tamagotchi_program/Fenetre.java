/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi_program;

import javax.swing.JFrame;

/**
 *
 * @author benedetti 21
 */
public class Fenetre extends JFrame {
    
    public Fenetre() {
    
        this.setSize(300, 300);
        //Fermeture bah euh à la fermeture...
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Fenêtre redimensionnable
        this.setResizable(true);
        //Un titre bien représentatif du jeu
        this.setTitle("Tamagotchi");
        
        //affichage
        this.setVisible(true);
        
    }
}
