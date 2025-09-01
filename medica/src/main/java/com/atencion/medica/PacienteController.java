package com.atencion.medica;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class PacienteController {
    private List<Paciente> paci = new ArrayList<>();

    public PacienteController(){
        paci.add(new Paciente(1, "Alberto Javier Diaz Espinoza", 944881912, "a.diaze@duocuc.cl"));
        paci.add(new Paciente(2, "Maria del Carmen Espinoza Maulen", 955881425, "m.espinozam@duocuc.cl"));
        paci.add(new Paciente(3, "Adriana Rosa Espinoza Maulen", 995475844, "a.espinozam@duocuc.cl"));
        
    }
    
    @GetMapping("/Paciente")
    public List<Paciente> getPaciente(){
        return paci;
    }

    @GetMapping("/Paciente/{id_paciente}")
    public Paciente getPacienteById_Paciente(@PathVariable int id_paciente) {
        for (Paciente paci2 : paci){
            if (paci2.getId_paciente()==id_paciente){
                return paci2;
            }
        }
        return null;
    }
    
}
    
