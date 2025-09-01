package com.atencion.medica;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class DoctorController {
    private List<Doctor> doc = new ArrayList<>();

    public DoctorController(){
        doc.add (new Doctor(1, "Sofia Andrea Alarcon Perez", "sofia.alarcon@med.com", "Medicina General"));
        doc.add (new Doctor(2, "Constanza Andrea Gatica Saenz", "Constanza.gatica@med.com", "Cardiologia"));
        doc.add (new Doctor(3, "Mario Ignacio Calderon Martinez", "mario.calderon@med.com", "Oftalmologia"));
        doc.add (new Doctor(4, "Beatriz Aurora Pinzon Solano", "beatriz.pinzon@med.com", "Dermatologia"));
    }
    
    @GetMapping("/Doctor")
    public List<Doctor> getDoctor(){
        return doc;
    }

    @GetMapping("/Doctor/{id_doctor}")
    public Doctor getDoctorById_doctor(@PathVariable int id_doctor) {
        for (Doctor doc2 : doc){
            if (doc2.getId_doctor()==id_doctor){
                return doc2;
            }
        }
        return null;
    }
    
}