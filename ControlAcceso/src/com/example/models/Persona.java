package com.example.models;

import com.example.utils.ControlException;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private boolean membresia;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, boolean membresia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.membresia = membresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isMembresia() {
        return membresia;
    }

    public void setMembresia(boolean membresia) {
        this.membresia = membresia;
    }

    public void calcularEdad() throws ControlException {
    }

    public void esMiembroVip() throws ControlException {
    }

    public void mostrarInfo() throws ControlException {

    }

}
