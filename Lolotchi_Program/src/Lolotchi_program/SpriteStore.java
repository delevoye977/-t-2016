package Lolotchi_program;

import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;


/**
 * Singleton permettant de construire ou récupérer les sprites à partir de leur
 * nom Le nom du sprite doit correspondre à un fichier .png Le sprite doit être
 * placé dans un dossier ressource de l'application
 *
 * @author benedetti 21
 */
public class SpriteStore {

    private static SpriteStore instance = null;
    private HashMap<String, Sprite> sprites = new HashMap();
    private Sprite perso = null;
    
    //HUD
    private Sprite MenuFaim = null;
    private Sprite MenuJeux = null;
    private Sprite MenuSante = null;
    private Sprite MenuToilettes = null;
    private Sprite MenuLampe = null;
    private Sprite MenuTravail = null;
    //HUD select
    private Sprite MenuFaimSelect = null;
    private Sprite MenuJeuxSelect = null;
    private Sprite MenuSanteSelect = null;
    private Sprite MenuToilettesSelect = null;
    private Sprite MenuLampeSelect = null;
    private Sprite MenuTravailSelect = null;

    private SpriteStore() throws IOException {
        try {
            //Ici toute les adresses ont été modifier pour la compatibilité cross OS, avec les packages.
            this.perso = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.perso.toString())));
            this.MenuFaim = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuFaim.toString())));
            this.MenuFaimSelect = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuFaimSelect.toString())));
            this.MenuJeux = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuJeux.toString())));
            this.MenuJeuxSelect = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuJeuxSelect.toString())));
            this.MenuSante = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuSante.toString())));
            this.MenuSanteSelect = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuSanteSelect.toString())));
            this.MenuToilettes = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuToilettes.toString())));
            this.MenuToilettesSelect = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuToilettesSelect.toString())));
            this.MenuLampe = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuLampe.toString())));
            this.MenuLampeSelect = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuLampeSelect.toString())));
            this.MenuTravail = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuTravail.toString())));
            this.MenuTravailSelect = new Sprite(ImageIO.read(Lolotchi_Program.class.getResource(nomImages.MenuTravailSelect.toString())));
            
        } catch (IOException e) {
            //gestion d'erreur
            System.err.println("ERREUR : Impossible de charger les images.");
            System.exit(0);
        }
        this.sprites.put("perso", this.perso);
        this.sprites.put("MenuFaim", this.MenuFaim);
        this.sprites.put("MenuFaimSelect", this.MenuFaimSelect);
        this.sprites.put("MenuJeux", this.MenuJeux);
        this.sprites.put("MenuJeuxSelect", this.MenuJeuxSelect);
        this.sprites.put("MenuSante", this.MenuSante);
        this.sprites.put("MenuSanteSelect", this.MenuSanteSelect);
        this.sprites.put("MenuToilettes", this.MenuToilettes);
        this.sprites.put("MenuToilettesSelect", this.MenuToilettesSelect);
        this.sprites.put("MenuLampe", this.MenuLampe);
        this.sprites.put("MenuLampeSelect", this.MenuLampeSelect);
        this.sprites.put("MenuTravail", this.MenuTravail);
        this.sprites.put("MenuTravailSelect", this.MenuTravailSelect);
    }

    /**
     * Obtient l'instance du magasin de sprites
     *
     * @return le magasin de sprites
     */
    public static SpriteStore get() throws Exception {
        if (instance == null) {
            instance = new SpriteStore();
        }
        return instance;
    }

    /**
     * Fournit un sprite à partir de son nom
     *
     * @param nom le nom symbolique du sprite
     * @return le sprite construit
     * @throws Exception si le sprite de ce nom n'existe pas ou ne peut pas etre
     * chargé
     */
    public Sprite getSprite(String nom) throws Exception {
        return (Sprite) sprites.get(nom);
    }
}
