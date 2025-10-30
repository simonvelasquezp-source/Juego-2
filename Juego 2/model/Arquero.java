import app.interfaces.Danable;
import app.interfaces.Atacante;

public class Arquero extends Personaje {
    public Arquero(String nombre){
        super(nombre,  100, 15, 5);
    }
    @Override
    public void atacar(Danable enemigo) {
        System.out.println(getNombre() + " lanza una flecha");
        enemigo.recibirDaño(getDaño());
    }
   
   
}
