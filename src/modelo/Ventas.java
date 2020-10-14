
package modelo;


public class Ventas {
    String idVentas,idCliente,idEmpleado,FechaVenta;
    double monto;

    public Ventas() {
    }

    public Ventas(String idVentas, String idCliente, String idEmpleado, String FechaVenta, double monto) {
        this.idVentas = idVentas;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.FechaVenta = FechaVenta;
        this.monto = monto;
    }

    public String getIdVentas() {
        return idVentas;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getIdEmpleado() {
        return idEmpleado;
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

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setFechaVenta(String FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
}
