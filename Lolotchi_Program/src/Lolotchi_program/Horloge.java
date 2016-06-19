/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lolotchi_program;

import java.util.TimerTask;



/**
 *
 * @author benedetti 21
 * 
 */
public class Horloge extends java.util.Timer {

    private final Jeu jeu;

    public Horloge(Jeu j) {
        jeu = j;
        //On actualise toutes les 50 millisecondes 
        this.scheduleAtFixedRate(new TimerTaskFast(), 0, 50);

    }

    public class TimerTaskFast extends TimerTask {

        @Override
        public void run() {
            //Repaint à chaque tic
            jeu.getFenetre().repaint();
        }

    }
}