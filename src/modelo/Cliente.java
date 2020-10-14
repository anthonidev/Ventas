
package modelo;

public class Cliente {
    String idCliente, DNI,Nombre,Apellido,Numero,Sexo;
    

    public Cliente() {
    }

    public Cliente(String idCliente, String DNI, String Nombre, String Apellido, String Numero, String Sexo) {
        this.idCliente = idCliente;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Numero = Numero;
        this.Sexo = Sexo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNumero() {
        return Numero;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
    
}

