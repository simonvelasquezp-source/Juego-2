import app.interfaces.Danable;
import app.interfaces.Atacante;
public class Mago extends Personaje {
    public Mago(String nombre){
        super(nombre,  100, 30, 2);
    }
 
  
        @Override
    public void atacar(Danable enemigo) {
        System.out.println(getNombre() + " lanza un hechizo mágico!");
        enemigo.recibirDaño(getDaño());
    }
    }

