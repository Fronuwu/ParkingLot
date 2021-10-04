package com.example.dev;

public class Miembro {

    public ModelosVehiculos vehiculo;
    public String nombre;
    public String tipoMembresia; //segun vehiculo
    public String rut_cod;
    public int valorSuscripcion;

    public Miembro(ModelosVehiculos vehiculo, String nombre, String rut_cod) {
        this.vehiculo = vehiculo;
        this.nombre = nombre;
        this.rut_cod = rut_cod;
    }

    public ModelosVehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ModelosVehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public String getRut_cod() {
        return rut_cod;
    }

    public void setRut_cod(String rut_cod) {
        this.rut_cod = rut_cod;
    }

    public int getValorSuscripcion() {
        return valorSuscripcion;
    }

    public void setValorSuscripcion(int valorSuscripcion) {
        this.valorSuscripcion = valorSuscripcion;
    }
}
