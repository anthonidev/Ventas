
package reportes;

public class ListarVentas {
    private String idventas,idCliente,fecha,monto;
    

    public ListarVentas() {
    }

    public ListarVentas(String idventas, String idCliente, String fecha, String monto) {
        this.idventas = idventas;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.monto = monto;
    }

    public String getIdventas() {
        return idventas;
    }

    public void setIdventas(String idventas) {
        this.idventas = idventas;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    
}
