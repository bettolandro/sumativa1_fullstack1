package com.tienda.mascotas;

public class Detalle_venta {
    private int id_detalle_venta;
    private int id_producto;
    private int id_venta;
    private int cantidad;
    private int subtotal;

    

    public Detalle_venta(int id_detalle_venta, int id_producto, int id_venta, int cantidad, int subtotal) {
        this.id_detalle_venta = id_detalle_venta;
        this.id_producto = id_producto;
        this.id_venta = id_venta;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }
    public int getId_detalle_venta() {
        return id_detalle_venta;
    }
    public int getId_producto() {
        return id_producto;
    }
    public int getId_venta() {
        return id_venta;
    }
    public int getCantidad() {
        return cantidad;
    }
    public int getSubtotal() {
        return subtotal;
    }
    
}
