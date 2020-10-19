
package modelo;


public class Ventas {
    String idVentas,idCliente,FechaVenta;
    double monto;

    public Ventas() {
    }

    public Ventas(String idVentas, String idCliente, String FechaVenta, double monto) {
        this.idVentas = idVentas;
        this.idCliente = idCliente;
        this.FechaVenta = FechaVenta;
        this.monto = monto;
    }

    public String getIdVentas() {
        return idVentas;
    }

    public String getIdCliente() {
        return idCliente;
    }

    

    public String getFechaVenta() {
        return FechaVenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setIdVentas(String idVentas) {
        this.idVentas = idVentas;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

  

    public void setFechaVenta(String FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
}
