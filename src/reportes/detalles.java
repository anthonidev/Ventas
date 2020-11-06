/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

/**
 *
 * @author anthoni
 */
public class detalles {
    private String idDetalleventa,idVentas,idProducto,cantidad,precioventa;

    public detalles() {
    }

    public detalles(String idDetalleventa, String idVentas, String idProducto, String cantidad, String precioventa) {
        this.idDetalleventa = idDetalleventa;
        this.idVentas = idVentas;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
    }

    public detalles(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(String precioventa) {
        this.precioventa = precioventa;
    }
    
    
}
