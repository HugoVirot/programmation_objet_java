import POOJava.*;

// classe principale du programme
public class Main {

    // public static void main = méthode principale du programme (obligatoire en
    // Java)
    public static void main(String args[]) {

        // Créez au moins deux instances de la classe Homme, une avec chaque version du
        // constructeur (3 paramètres et 7 + 1) .
        Homme hovan = new Homme("Chamamyan", "Hovan", 42);
        Homme tony = new Homme("Sicot", "Tony", 36, "France", 175, 65, 1986, "FC Nantes");

        // Pour chacun de ces 2 hommes, appeler la méthode sayHello pour afficher ses
        // informations.
        hovan.sayHello();
        tony.sayHello();

        // appelez le getter getEquipePreferee pour afficher son équipe favorite
        // Vous devez obtenir « aucune » pour le premier (valeur par défaut) et celle
        // choisie dans le constructeur pour le second.
        System.out.println("équipe préférée de hovan : " + hovan.getEquipePreferee() + "\n");
        System.out.println("équipe préférée de tony : " + tony.getEquipePreferee() + "\n");

        // Utilisez le setter setPoids pour modifier le poids de ces deux hommes.
        // poids du 1er : 65kg.
        System.out.println("ancien poids de Hovan : " + hovan.getPoids());
        hovan.setPoids(65);
        System.out.println("nouveau poids de Hovan : " + hovan.getPoids());

        // Poids du second : poids de départ + 5kg.
        System.out.println("ancien poids de Tony : " + tony.getPoids());
        int poidsTony = tony.getPoids();
        int nouveauPoidsTony = poidsTony -= 3;
        tony.setPoids(nouveauPoidsTony);
        System.out.println("nouveau poids de Tony : " + tony.getPoids());

        // Ensuite (toujours dans Main.js, à la suite) :
        // - créez une instance de la classe femme (avec le second constructeur)
        // - affichez son magazine préféré.
        // - modifiez son magazine préféré pour « Niort Agglo Magazine »

        Femme manue = new Femme("Boinot", "Manue", 32, "France", 172, 55, 1989, "Metal Magazine");
        System.out.println("magazine préféré : " + manue.getMagazinePrefere());
        manue.setMagazinePrefere("Niort Agglo Magazine");
        System.out.println("magazine préféré : " + manue.getMagazinePrefere());

        // tableau d'Humains
        Humain[] tableauHumains = { tony, hovan, manue };

        for (Humain humain : tableauHumains) {
            humain.sayHello();
        }

    }

}
