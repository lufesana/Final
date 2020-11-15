package com.felipe.domain.Appoftalmólogo;

public abstract class Paciente {

    private String nombre;
    private int edad;
    private boolean necesitaCirujia;

    public Paciente(String nombre, int edad, boolean necesitaCirujia) {
        this.nombre = nombre;
        this.edad = edad;
        this.necesitaCirujia = necesitaCirujia;
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

    public boolean isNecesitaCirujia() {
        return  true;
    }

    public void setNecesitaCirujia(boolean necesitaCirujia) {
        this.necesitaCirujia = necesitaCirujia;
    }
}
