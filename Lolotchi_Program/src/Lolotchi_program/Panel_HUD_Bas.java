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
public class Panel_HUD_Bas extends JPanel{
    
    private final Fenetre fenetreMere;
    
    public Panel_HUD_Bas(Fenetre maman) throws Exception {
        this.fenetreMere = maman;
        this.setVisible(true);   
        

        //Dimensions
        this.setBounds(0, 270, 300, 30);
       
        
        //Transparence
        this.setOpaque(false);
    }
    
    @Override
    public void paint(Graphics g) {
        //Actualisation automatisée
        this.revalidate();
        try {
            //this.XXXXXXXX.draw(g);
        } catch (Exception ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
