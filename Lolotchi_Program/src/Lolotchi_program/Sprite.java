package tamagotchi_program;

import java.awt.Graphics;
import java.awt.Image;

/**
 * Une classe représentant un Sprite, c'est à dire une image mouvante (personnage, objet, etc...)
 * @author benedetti 21
 */
public class Sprite {
	private final Image image;

	/**
	 * Crée un nouveau sprite à partir d'une image
	 * @param i l'image de départ
	 */
	public Sprite(Image i) {
		this.image = i;
	}

	/**
	 * @return la largeur du sprite
	 */
	public int getWidth() {
            return image.getWidth(null);
	}

	/**
	 * @return la hauteur du sprite
	 */
	public int getHeight() {
            return image.getHeight(null);
	}
        
        /**
         * @return l'image associée (utile)
         */
        public Image getImage() {
            return this.image;
        }

	/**
	 * Dessine le sprite
	 * @param g la surface d'affichage
	 * @param x la position gauche du sprite
	 * @param y la position haute du sprite
         * @param width
         * @param height
	 */
	public void draw(Graphics g, int x, int y, int width, int height) {
            g.drawImage(image, x, y, width, height, null);
	}
}