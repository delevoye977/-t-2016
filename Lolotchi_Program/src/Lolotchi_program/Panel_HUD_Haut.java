/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lolotchi_program;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author benedetti 21
 */
public class Panel_HUD_Haut extends JPanel{
    
    private final Fenetre fenetreMere;
    private final Menu_Sante MenuSante;
    private final Menu_Faim MenuFaim;
    private final Menu_Toilettes MenuToilettes;
    private final Menu_Jeux MenuJeux;
    private final Menu_Travail MenuTravail;
    
    public Panel_HUD_Haut(Fenetre maman) throws Exception {
        this.fenetreMere = maman;
        this.setVisible(true);        
        //Dimensions
        this.setBounds(0, 0, 300, 30);    
        //Transparence
        this.setOpaque(false);
        
        this.MenuSante = new Menu_Sante("MenuSante",0,0,60,30);
        this.MenuFaim = new Menu_Faim("MenuFaim",60,0,60,30);
        this.MenuToilettes = new Menu_Toilettes("MenuToilettes",120,0,60,30);
        this.MenuJeux = new Menu_Jeux("MenuJeux",180,0,60,30);
        this.MenuTravail = new Menu_Travail("MenuTravail",240,0,60,30);
    }
    
    @Override
    public void paint(Graphics g) {
        //Actualisation automatisée
        this.revalidate();
        try {
            this.MenuSante.draw(g);
            this.MenuFaim.draw(g);
            this.MenuToilettes.draw(g);
            this.MenuJeux.draw(g);
            this.MenuTravail.draw(g);
        } catch (Exception ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    
}
