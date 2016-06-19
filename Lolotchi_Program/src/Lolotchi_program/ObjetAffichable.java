/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lolotchi_program;

import java.awt.Graphics;

/**
 *
 * @author benedetti 21
 */
public abstract class ObjetAffichable{

    //private String nomSprite;
    private final Sprite sprite;
    private final String nom;
    private double x;
    private double y;
    private int width;
    private int height;

    /**
     * Initialise un objet dessinable, déplaçable
     *
     * @param nom le nom du sprite utilisé pour dessiner l'objet
     * @param _x point gauche de l'objet
     * @param _y point haut de l'objet
     * @param width la largeur de l'objet
     * @param height la hauteur de l'objet
     * @throws java.lang.Exception
     */
    public ObjetAffichable(String nom, double _x, double _y, int width, int height) throws Exception {
        this.nom = nom;
        sprite = SpriteStore.get().getSprite(nom);
        this.x = _x;
        this.y = _y;
        this.width = width;
        this.height = height;
    }

    public String getType() {
        return this.nom;
    }

    /**
     * @return la largeur (en pixels) de l'objet
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * @return l'absisse médiane de l'objet
     */
    public int getMiddleX() {
        return (int) (this.x + (this.width / 2));
    }

    /**
     * @return l'ordonnée médiane de l'objet
     */
    public int getMiddleY() {
        return (int) (this.y + (this.height / 2));
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public int getHeight() {
        return height;
    }

    /**
     * Dessine l'objet sur la surface 2D
     *
     * @param g la surface 2D @throws Exception en cas d'impossibilité de
     * dessiner
     * @throws java.lang.Exception
     */
    public void draw(Graphics g) throws Exception {
        sprite.draw(g, (int) this.x, (int) this.y, this.width, this.height);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
