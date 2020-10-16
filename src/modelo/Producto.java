
package modelo;

public class Producto {
    String idProducto,nombre,idProveedor,Descripcion;
    double precio;

    public Producto() {
    }

    public Producto(String idProducto, String nombre, String idProveedor, String Descripcion, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.idProveedor = idProveedor;
        this.Descripcion = Descripcion;
        this.precio = precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  
    
    
    
}
