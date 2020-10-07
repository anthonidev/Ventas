
package modelo;

public class EntidadUsuario {
    String usuario,clave,idNivel,idEmpleado;

    public EntidadUsuario() {
    }

    public EntidadUsuario(String usuario, String clave, String idNivel, String idEmpleado) {
        this.usuario = usuario;
        this.clave = clave;
        this.idNivel = idNivel;
        this.idEmpleado = idEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getIdNivel() {
        return idNivel;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setIdNivel(String idNivel) {
        this.idNivel = idNivel;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
}
