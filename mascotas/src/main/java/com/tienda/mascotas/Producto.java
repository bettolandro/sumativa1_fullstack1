package com.tienda.mascotas;

public class Producto {
    private int id_producto;
    private String nombre_producto;
    private int stock;
    private String tipo_producto;
    private int precio;

    public Producto (int id_producto, String nombre_producto, int stock, String tipo_producto, int precio){
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.stock = stock;
        this.tipo_producto = tipo_producto;
        this.precio = precio;
    }

    public int getId_producto(){
        return id_producto;
    }
    public String getNombre_producto(){
        return nombre_producto;
    }
    public int getStock(){
        return stock;
    }
    public String getTipo_producto(){
        return tipo_producto;
    }
    public int getPrecio() {
        return precio;
    }
    
}
