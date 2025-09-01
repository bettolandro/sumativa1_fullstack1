package com.atencion.medica;

import java.util.Date;

public class Consulta {
    private int id_consulta;
    private Date fecha_consulta;
    private String especialidad_consulta;
    private String observacion_consulta;
    private int id_doctor;
    private int id_paciente;

    
    public Consulta(int id_consulta, Date fecha_consulta, String especialidad_consulta, String observacion_consulta,
            int id_doctor, int id_paciente) {
        this.id_consulta = id_consulta;
        this.fecha_consulta = fecha_consulta;
        this.especialidad_consulta = especialidad_consulta;
        this.observacion_consulta = observacion_consulta;
        this.id_doctor = id_doctor;
        this.id_paciente = id_paciente;
    }

    public int getId_consulta() {
        return id_consulta;
    }

    public Date getFecha_consulta() {
        return fecha_consulta;
    }

    public String getEspecialidad_consulta() {
        return especialidad_consulta;
    }

    public String getObservacion_consulta() {
        return observacion_consulta;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public int getId_paciente() {
        return id_paciente;
    }
    
}
