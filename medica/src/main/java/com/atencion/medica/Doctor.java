package com.atencion.medica;

public class Doctor {
    private int id_doctor;
    private String nombre_completo_doctor;
    private String correo_doctor;
    private String especialidad;

    public Doctor(int id_doctor, String nombre_completo_doctor, String correo_doctor, String especialidad){
        this.id_doctor = id_doctor;
        this.nombre_completo_doctor = nombre_completo_doctor;
        this.correo_doctor = correo_doctor;
        this.especialidad = especialidad;
    }
    
    public int getId_doctor(){
        return id_doctor;
    }
    public String getNombre_completo_doctor(){
        return nombre_completo_doctor;
    }
    public String getCorreo_doctor(){
        return correo_doctor;
    }
    public String getEspecialidad(){
        return especialidad;
    }
}
