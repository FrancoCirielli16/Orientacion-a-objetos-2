package Ejercicio2;

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
