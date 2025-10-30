import app.interfaces.Danable;
import app.interfaces.Atacante;
public abstract class Personaje implements Danable, Atacante {
    
    private String nombre;
    private int vida;
    private int daño;
    private int velocidad;

    public Personaje(String nombre,   int vida,int daño, int velocidad){
        this.nombre=nombre;
        this.vida=vida;
        this.daño=daño;
        this.velocidad=velocidad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida= vida;
    }
    public int getDaño(){
        return daño;
    }
    public void setDaño(int daño){
        this.daño=daño;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }
    @Override
public abstract void atacar(Danable enemigo);

@Override
    public void recibirDaño(int cantidad) {
        vida -= cantidad;
        if (vida < 0) vida = 0;
        System.out.println(nombre + " - " + cantidad + " . Vida restante: " + vida);
    }
}


