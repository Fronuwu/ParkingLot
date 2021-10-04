package com.example.dev;

public class Sucursal {

    public int capacidad; //separar segun size del vehiculo
    public String nombre;
    public String ciudad;
    public String codSucursal;

    public Sucursal(int capacidad, String nombre, String ciudad, String codSucursal) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.codSucursal = codSucursal;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(String codSucursal) {
        this.codSucursal = codSucursal;
    }
}
