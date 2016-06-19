/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi_program;

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
    
    public PanelPrincipal(Fenetre maman) {
        this.fenetreMere = maman;
        this.setVisible(true);
        
        this.setBounds(0, 0, 300, 300);
        //Transparence
        this.setOpaque(false);
    }
    
    @Override
    public void paint(Graphics g) {
        //Actualisation automatisée
        this.revalidate();
        
    }
    
    
    
    
}
