package com.felipe.domain.Appoftalmólogo;

import java.util.ArrayList;
import java.util.List;

public  class Oftalmologo {
    private String nombre;
    private static final int maximaEdad = 40;
    private List <Paciente> pacientes;

    public Oftalmologo(){
        this.pacientes = new ArrayList<>();
    }

    public Object revisarPaciente(String nombre, int edad) {
        if (edad < maximaEdad && (nombre.contains("A") || nombre.contains("a")))  {
            PacienteApto pacienteApto = new PacienteApto(nombre, edad, true);
            this.pacientes.add(pacienteApto);
            return pacienteApto;
        }else{
            PacienteNoApto pacienteNoApto = new PacienteNoApto(nombre, edad, false);
            this.pacientes.add(pacienteNoApto);
            return pacienteNoApto;
        }
    }

    public void operarPacientes(){
       pacientes.stream().filter(P -> P instanceof PacienteApto && P.isNecesitaCirujia()).forEach(paciente -> ((PacienteApto) paciente).operar());



    }

    public void getPacientesAOperar (){
        pacientes.stream().filter(p -> p instanceof PacienteApto && p.isNecesitaCirujia() ).forEach(System.out::println);

//        Profe, aquí se me dificultó realizar la lista sin colocarla como atributo.


    }
}



