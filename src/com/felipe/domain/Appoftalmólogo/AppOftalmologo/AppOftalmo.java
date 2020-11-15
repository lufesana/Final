package com.felipe.domain.Appoftalmólogo.AppOftalmologo;

import com.felipe.domain.Appoftalmólogo.Oftalmologo;

public class AppOftalmo {

    public static void main(String[] args) {

        Oftalmologo oftalmologo = new Oftalmologo();

        oftalmologo.revisarPaciente("Juan", 35);
        oftalmologo.revisarPaciente("Alejandra", 30);
        oftalmologo.revisarPaciente("Carlos", 30);
        oftalmologo.revisarPaciente("Emilio", 28);
        oftalmologo.revisarPaciente("Luis", 31);

        oftalmologo.getPacientesAOperar();
        oftalmologo.operarPacientes();


    }
}