package com.felipe.domain.Appoftalmólogo;

class PacienteApto extends Paciente implements Operable {


    public PacienteApto(String nombre, int edad, boolean necesitaCirujia) {
        super(nombre, edad, necesitaCirujia);
    }

    @Override
    public boolean operar() {
        this.setNecesitaCirujia(false);
        return false;

    }

    @Override
    public String toString() {
        return this.getNombre()  +": " + this.getEdad();
    }
}
