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
public enum nomImages {
    
    perso("sprite_tamagotchi_11.png");

    

    private String nomFichier = "";

    nomImages(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    @Override
    public String toString() {
        return "/Ressources/Images/" + nomFichier;
    }
}