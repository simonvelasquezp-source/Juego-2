package app.Batallas;

import java.util.ArrayList;
import app.model.*;
import app.batalla.Batalla;

public class Main {
    public static void main(String[] args) {
       
        ArrayList<Personaje> equipo1 = new ArrayList<>();
        equipo1.add(new Caballero("Arturo"));
        equipo1.add(new Espadachin("León"));

        ArrayList<Personaje> equipo2 = new ArrayList<>();
        equipo2.add(new Mago("Merlín"));
        equipo2.add(new Arquero("Robin"));

        Batalla batalla = new Batalla(equipo1, equipo2);
        batalla.iniciarBatalla();
    }
}
