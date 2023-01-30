package POOJava;

public abstract class Humain { /// abstract signifie que la classe n'est pas instanciable

    // ATTRIBUTS de la classe (= CHAMPS)

    // variable statique
   final static String genre = "genre humain";

    // variables d'instance. protected permet de les rendre accessibles uniquement à l'intérieur de la classe
    // et des classes enfants => respect de l'encapsulation
    protected String nom;
    protected String prenom;
    protected int age;
    protected String pays;
    protected int taille;
    protected int poids;
    protected int anneeNaissance;

    // CONSTRUCTEUR de la classe (= fonction qui permet de l'instancier)
    // public Humain(String nomHumain, String prenomHumain) {
    //     nom = nomHumain; // l'attribut nom de la classe prend comme valeur le paramètre nomHumain
    //     prenom = prenomHumain; //même principe
    // }

    // autre écriture possible avec THIS (même résultat)
    // permet d'avoir le même nom de paramètre que l'attribut
    public Humain(String nom, String prenom) {
        this.nom = nom; 
        this.prenom = prenom;
    }

    // on définit un autre constructeur avec un paramètre en plus
    // => même nom de fonction, mais autre version
    // => on dit qu'on SURCHARGE / redéfinit cette méthode
    public Humain(String nomHumain, String prenomHumain, int ageHumain) {
        nom = nomHumain;
        prenom = prenomHumain;
        age = ageHumain;
    }

    // troisième constructeur avec cette fois-ci tous les paramètres
    public Humain(String nomHumain, String prenomHumain, int ageHumain, String paysHumain, int tailleHumain, int poidsHumain, int anneeNaissanceHumain){
        nom = nomHumain;
        prenom = prenomHumain;
        age = ageHumain;
        pays =  paysHumain;
        taille = tailleHumain;
        poids = poidsHumain;
        anneeNaissance = anneeNaissanceHumain;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getTaille() {
        return this.taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return this.poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getAnneeNaissance() {
        return this.anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    // méthode de la classe (void, car ne retourne pas de variable)
    public void sayHello() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom);
    }

    // GETTER (de type String): retourne le pays de l'humain
    public String getPays(){
        return this.pays;
    }
}


