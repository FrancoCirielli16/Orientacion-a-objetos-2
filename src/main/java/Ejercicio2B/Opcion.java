package Ejercicio2B;

public abstract class Opcion {
    private String nombre;

    public Opcion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract int comparar(Opcion otraOpcion);
}
