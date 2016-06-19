/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lolotchi_program;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author benedetti 21
 */
public class Clavier implements KeyListener {


    public Clavier() {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                System.out.println("Touche du haut appuyée");
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("Touche bas appuyée");
                break;
            case KeyEvent.VK_SPACE:
                System.out.println("Touche espace");
                break;
            case KeyEvent.VK_C:
                System.out.println("Touche C");
                break;
            default:
                break;
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
