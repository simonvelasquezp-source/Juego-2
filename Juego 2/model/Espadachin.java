import app.interfaces.Danable;
import app.interfaces.Atacante;
public class Espadachin extends Personaje {
    public Espadachin(String nombre){
        super(nombre,  150, 10, 5);
    }
 

    @Override
    public void atacar(Danable enemigo) {
        System.out.println(getNombre() + " ataca con su espada");
        enemigo.recibirDaño(getDaño());
    }
}
