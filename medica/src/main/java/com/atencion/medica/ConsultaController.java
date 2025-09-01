package com.atencion.medica;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ConsultaController {
    private List<Consulta> consu = new ArrayList<>();

    public ConsultaController(){
        consu.add (new Consulta(1, new Date(), "medicina general", "paciente se presenta con sintomas de resfrio severo", 1, 2));
        consu.add (new Consulta(2, new Date(), "Dermatologia", "revisión de acne en la cara y tratamiento", 4, 1));
        consu.add (new Consulta(3, new Date(), "Cardiologia", "paciente se presenta con sintomas de arritmia, se controla sin observaciones", 2, 3));
    }
    
    @GetMapping("/Consulta")
    public List<Consulta> getConsulta(){
        return consu;
    }

    @GetMapping("/Consulta/{id_Consulta}")
    public Consulta getConsultaById_Consulta(@PathVariable int id_Consulta) {
        for (Consulta consu2 : consu){
            if (consu2.getId_consulta()==id_Consulta){
                return consu2;
            }
        }
        return null;
    }
    
}
