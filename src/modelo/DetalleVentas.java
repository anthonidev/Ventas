/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author anthoni
 */
public class DetalleVentas {
    
    String idDetalleventa,idVentas,idProducto;
    int cantidad;
    double precioventa;

    public DetalleVentas() {
    }

    public DetalleVentas(String idDetalleventa, String idVentas, String idProducto, int cantidad, double precioventa) {
        this.idDetalleventa = idDetalleventa;
        this.idVentas = idVentas;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
    }

    public String getIdDetalleventa() {
        return idDetalleventa;
    }

    public void setIdDetalleventa(String idDetalleventa) {
        this.idDetalleventa = idDetalleventa;
    }

    public String getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(String idVentas) {
        this.idVentas = idVentas;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }
    
    
}
