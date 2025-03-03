package com.example.models;

import com.example.utils.ControlException;

public class Club {

    String nombre;
    int capacidadMaxima;
    int capacidadActual;

    public Club(String nombre, int capacidadMaxima, int capacidadActual) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void actualizarCapacidad() throws ControlException{}
    public void verificarDisponibilidad() throws ControlException{}
    public void permitirIngreso(Cliente c) throws ControlException{}
    public void mostrarEstadoClub() throws ControlException{}

}
