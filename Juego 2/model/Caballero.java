import app.interfaces.Danable;
import app.interfaces.Atacante;
public class Caballero extends Personaje {
    public Caballero(String nombre){
        super(nombre,  200, 20, 10);
    }
   

    @Override
    public void atacar(Danable enemigo) {
        System.out.println(getNombre() + " ataca con la espada");
        enemigo.recibirDaño(getDaño());
    }
}
