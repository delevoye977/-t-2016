/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lolotchi_program;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author benedetti 21
 */
public class Son extends Thread {
    private URL u1;//l'url de ton fichier son
    private static AudioClip s1;//le son créé depuis ton url
 
    public Son(nomSons nom) {
        u1 = Lolotchi_Program.class.getResource(nom.toString());
        s1 = Applet.newAudioClip(u1);
    }
    
    public void jouer() {
        s1.play();
    }
}
