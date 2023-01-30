package POOJava;

public class Homme extends Humain {

    // ici, 3 paramètres pour notre constructeur
    // => super va automatiquement chercher le constructeur correspondant dans la
    // classe-mère
    // (celui avec 3 paramètres)
    protected String equipePreferee = "aucune";

    public Homme(String nomHomme, String prenomHomme, int ageHomme) {
        super(nomHomme, prenomHomme, ageHomme);
    }

    // constructeur complet avec 7 paramètres (super le trouve automatiquement)
    public Homme(String nomHomme, String prenomHomme, int ageHomme, String paysHomme, int tailleHomme, int poidsHomme,
            int anneeNaissanceHomme, String equipePrefereeHomme) {
        super(nomHomme, prenomHomme, ageHomme, paysHomme, tailleHomme, poidsHomme, anneeNaissanceHomme);
        equipePreferee = equipePrefereeHomme;
    }

    // ici, on redéfinit la méthode SayHello()
    // POLYMORPHISME => la méthode existe dans 2 classes différentes avec le même
    // nom
    @Override
    public void sayHello() {
        System.out.println("Je m'appelle " + prenom + " " + nom + ", je suis un homme et j'ai " + age + " ans");
    }

    public String getEquipePreferee() {
        return this.equipePreferee;
    }

    public void setEquipePreferee(String equipePreferee) {
        this.equipePreferee = equipePreferee;
    }



}
