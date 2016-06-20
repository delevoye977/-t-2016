/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lolotchi_program;

/**
 *
 * @author benedetti 21
 */
public enum nomImages {
    
    perso("sprite_tamagotchi_11_1.png"),
    MenuFaim("spr_hungerhud1_1.png"),
    MenuFaimSelect("spr_hungerhud2_1.png"),
    MenuJeux("sprite_gameshud1_1.png"),
    MenuJeuxSelect("sprite_gameshud2_1.png"),
    MenuSante("sprite_healthhud1_1.png"),
    MenuSanteSelect("sprite_healthhud2_1.png"),
    MenuLampe("sprite_lamphud1_1.png"),
    MenuLampeSelect("sprite_lamphud2_1.png"),
    MenuToilettes("sprite_toilethud1_1.png"),
    MenuToilettesSelect("sprite_toilethud2_1.png"),
    MenuTravail("sprite_workhud1_1.png"),
    MenuTravailSelect("sprite_workhud2_1.png");

    

    private String nomFichier = "";

    nomImages(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    @Override
    public String toString() {
        return "/Ressources/Images/" + nomFichier;
    }
}