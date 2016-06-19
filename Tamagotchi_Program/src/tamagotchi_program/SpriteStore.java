package tamagotchi_program;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;


/**
 * Singleton permettant de construire ou récupérer les sprites à partir de leur
 * nom Le nom du sprite doit correspondre à un fichier .png Le sprite doit être
 * placé dans un dossier ressource de l'application
 *
 * @author aguidet
 * @author Kevin Glass
 */
public class SpriteStore {

    private static SpriteStore instance = null;
    private HashMap<String, Sprite> sprites = new HashMap();
    private Sprite perso = null;
    

    private SpriteStore() throws IOException {
        try {
            //Ici toute les adresses ont été modifier pour la compatibilité cross OS, avec les packages.
            this.perso = new Sprite(ImageIO.read(Tamagotchi_Program.class.getResource(nomImages.perso.toString())));
            
        } catch (IOException e) {
            //gestion d'erreur
            System.err.println("ERREUR : Impossible de charger les images.");
            System.exit(0);
        }
        this.sprites.put("perso", this.perso);
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
