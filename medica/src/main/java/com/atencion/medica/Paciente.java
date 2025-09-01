package com.atencion.medica;

public class Paciente {
    private int id_paciente;
    private String nombre_completo;
    private int telefono;
    private String correo;

    public Paciente (int id_paciente, String nombre_completo, int telefono, String correo){
        this.id_paciente = id_paciente;
        this.nombre_completo = nombre_completo;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId_paciente(){
        return id_paciente;
    }
    public String getNombre_completo(){
        return nombre_completo;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getCorreo(){
        return correo;
    }
}
