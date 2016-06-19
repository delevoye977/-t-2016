/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi_program;

/**
 *
 * @author benedetti 21
 */
public enum nomSons {
    
    laser("laser_Shoot.wav");
    
    private String nomFichier = "";
    
    nomSons(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    @Override
    public String toString() {
        return "/Ressources/Sons/" + nomFichier;
    }
    
}
