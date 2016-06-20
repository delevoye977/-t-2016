/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lolotchi_program;

import java.awt.Graphics;
import javax.swing.JFrame;


/**
 *
 * @author benedetti 21
 */
public class Fenetre extends JFrame {
    
    private final PanelPrincipal panelprincipal;
    private final Panel_HUD_Haut panelHUDHaut;
    private final Panel_HUD_Bas panelHUDBas;

    //SpriteStore
    private final SpriteStore sprite;
    
    public Fenetre() throws Exception {
        sprite = SpriteStore.get();
        
        this.setSize(305, 300);
        //Fermeture bah euh à la fermeture...
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Fenêtre redimensionnable
        this.setResizable(false);
        //Un titre bien représentatif du jeu
        this.setTitle("Tamagotchi");
        //Initialisation
        this.panelprincipal = new PanelPrincipal(this);
        this.add(this.panelprincipal);
        this.panelHUDHaut = new Panel_HUD_Haut(this);
        this.add(this.panelHUDHaut);
        this.panelHUDBas = new Panel_HUD_Bas(this);
        this.add(this.panelHUDBas);
        

        //affichage
        this.setVisible(true);
        
        //init du lecteur de clavier
        this.addKeyListener(new Clavier());
        
        //Son d'intro au jeu
        Son s = new Son(nomSons.laser);
        s.jouer();
        
    }
    
    @Override
    public void paint(Graphics g) {
        //Super pour la JFrame
        super.paint(g);
        
        //Appel des paints filles
        this.panelprincipal.paint(this.panelprincipal.getGraphics());
        this.panelHUDHaut.paint(this.panelHUDHaut.getGraphics());
        this.panelHUDBas.paint(this.panelHUDBas.getGraphics());
    }
    
    public PanelPrincipal getPanelPrincipal() {
        return this.panelprincipal;
    }
    
    
    
}
