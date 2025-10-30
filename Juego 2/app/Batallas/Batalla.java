package app.Batallas;

import java.util.ArrayList;
import java.util.Random;
import juego.Personaje;

public class Batalla {
    




    private ArrayList<Personaje> equipo1;
    private ArrayList<Personaje> equipo2;
    private Random random = new Random();

    public Batalla(ArrayList<Personaje> equipo1, ArrayList<Personaje> equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void iniciarBatalla() {
        System.out.println(" Comienza la batalla entre equipos ");

        while (equipoVivo(equipo1) && equipoVivo(equipo2)) {

            Personaje atacante1 = obtenerAleatorioVivo(equipo1);
            Personaje atacante2 = obtenerAleatorioVivo(equipo2);

            System.out.println("\nTurno del equipo 1:");
            atacante1.atacar(atacante2);
            if (atacante2.getVida() <= 0) {
                System.out.println(atacante2.getNombre() + " eliminado ");
            }

            if (atacante2.getVida() > 0) {
                System.out.println("\nTurno del equipo 2:");
                atacante2.atacar(atacante1);
                if (atacante1.getVida() <= 0) {
                    System.out.println(atacante1.getNombre() + " Eliminado ");
                }
            }

            esperar(1500); 
        }

        System.out.println("\n=== La batalla ha terminado ===");
        if (equipoVivo(equipo1))
            System.out.println(" El equipo 1 gana");
        else
            System.out.println(" El equipo 2 gana");
    }

    private boolean equipoVivo(ArrayList<Personaje> equipo) {
        for (Personaje p : equipo) {
            if (p.getVida() > 0)
                return true;
        }
        return false;
    }

    private Personaje obtenerAleatorioVivo(ArrayList<Personaje> equipo) {
        ArrayList<Personaje> vivos = new ArrayList<>();
        for (Personaje p : equipo) {
            if (p.getVida() > 0) vivos.add(p);
        }
        return vivos.get(random.nextInt(vivos.size()));
    }

    private void esperar(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}


