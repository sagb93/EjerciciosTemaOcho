
package com.sara.ejerciciostemaocho;

import com.sara.ejerciciostemaocho.primerEjercicio.Persona;

public class EjerciciosTemaOcho {

    public static void main(String[] args) {
        executeNuevaPersona("Rebe", 20, 21254548);
    }

    public static void executeNuevaPersona(String nombre, int edad, int numeroTelefono){
        Persona persona = new Persona(nombre, edad, numeroTelefono);
        System.out.println(persona.getDetalles());    
    }        
}