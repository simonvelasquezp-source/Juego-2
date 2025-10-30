package app;

   
public class Juego {
    public static void main(String[] args) {

        Caballero arturo = new Caballero("Arturo");
        Mago merlin = new mago("Merlín");
        Espadachin leon goretzka = new Espadachin("León");

        System.out.println(" Comienza la batalla ");
        arturo.atacar(merlin);
        merlin.atacar(arturo);
        leon.atacar(merlin);
    }
}

