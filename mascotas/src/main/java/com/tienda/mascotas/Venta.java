package com.tienda.mascotas;

import java.time.LocalDate;

public class Venta {
    private int id_venta;
    private LocalDate fecha_venta;
    private String nombre_cliente;
    private int total_venta;

    public Venta (int id_venta, LocalDate fecha_venta, String nombre_cliente, int total_venta){
        this.id_venta = id_venta;
        this.fecha_venta = fecha_venta;
        this.nombre_cliente = nombre_cliente;
        this.total_venta = total_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public LocalDate getFecha_venta() {
        return fecha_venta;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public int getTotal_venta() {
        return total_venta;
    }
 
}
