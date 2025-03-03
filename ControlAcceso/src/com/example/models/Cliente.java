package com.example.models;

import com.example.utils.ControlException;

import java.time.LocalDate;

public class Cliente extends Persona{

    //Atributos adicionales
     int historialVisitas;
     boolean esPrimeraVisita;
     boolean puedeIngresar;
     String categoria;


    public Cliente(String nombre, String apellido, LocalDate fechaNacimiento, boolean membresia) {
        super(nombre, apellido, fechaNacimiento, membresia);
    }

    public void evaluarAcceso()throws ControlException{}

    public void actualizarHistorialVisitas() throws ControlException{}

    public void mostrarBeneficios() throws ControlException{}


}
