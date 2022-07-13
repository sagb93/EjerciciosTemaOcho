
package com.sara.ejerciciostemaocho.primerEjercicio;

public class Persona {

    private String nombre;
    private int edad;
    private int numeroTelefono;

    public Persona(String nombre, int edad, int numeroTelefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
    }

    public String getDetalles() {
        return (String.format("Datos personales:\n %s\t %d anios\t telefono %d ", nombre, edad, numeroTelefono));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
