/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi_program;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author benedetti 21
 */
public class PanelPrincipal extends JPanel {
    
    private final Fenetre fenetreMere;
    private final Personnage perso;
    
    public PanelPrincipal(Fenetre maman) throws Exception {
        this.fenetreMere = maman;
        this.setVisible(true);   
        
        

        //Dimensions
        this.setBounds(25, 0, 275, 300);
       
        
        //Transparence
        this.setOpaque(false);
        this.perso = new Personnage("perso",0,0,50,50);
    }
    
    @Override
    public void paint(Graphics g) {
        //Actualisation automatisée
        this.revalidate();
        try {
            this.perso.draw(g);
        } catch (Exception ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    
}
