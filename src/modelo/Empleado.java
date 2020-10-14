package modelo;

public class Empleado {
    String idEmpleado,DNI,Nombre,Apellido,Numero,FechaNa,FechaIng,idCategoria,sexo;

    public Empleado() {
    }

    public Empleado(String idEmpleado, String DNI, String Nombre, String Apellido, String Numero, String FechaNa, String FechaIng, String idCategoria, String sexo) {
        this.idEmpleado = idEmpleado;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Numero = Numero;
        this.FechaNa = FechaNa;
        this.FechaIng = FechaIng;
        this.idCategoria = idCategoria;
        this.sexo = sexo;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getFechaNa() {
        return FechaNa;
    }

    public void setFechaNa(String FechaNa) {
        this.FechaNa = FechaNa;
    }

    public String getFechaIng() {
        return FechaIng;
    }

    public void setFechaIng(String FechaIng) {
        this.FechaIng = FechaIng;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
