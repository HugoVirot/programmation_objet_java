package POOJava;

// la classe Femme HERITE de Humain (extends) => c'est une classe ENFANT (ou classe FILLE)
public class Femme extends Humain {

    private String magazinePrefere;

    public Femme(String nomFemme, String prenomFemme, int ageFemme) {
        // super permet de réutiliser le constructeur de la classe mère Humain
        super(nomFemme, prenomFemme, ageFemme);
    }

    // constructeur complet avec 7 paramètres (super le trouve automatiquement)
    public Femme(String nomFemme, String prenomFemme, int ageFemme, String paysFemme, int tailleFemme, int poidsFemme,
            int anneeNaissanceFemme, String magazineFemme) {
        super(nomFemme, prenomFemme, ageFemme, paysFemme, tailleFemme, poidsFemme, anneeNaissanceFemme);
        magazinePrefere = magazineFemme;
    }

    public String getMagazinePrefere() {
        return this.magazinePrefere;
    }

    public void setMagazinePrefere(String magazinePrefere) {
        this.magazinePrefere = magazinePrefere;
    }

    // on redéfinit la méthode sayHello() de la classe mère Humain
    // => mot-clé OVERRIDE (= passer outre)
    @Override
    public void sayHello() {
        System.out.println("Je suis une femme et je m'appelle " + prenom + " " + nom);
    }
}