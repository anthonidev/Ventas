
package modelo;

public class EntidadUsuario {
    String usuario,clave,idNivel,idEmpleado,mode;

    public EntidadUsuario() {
    }

    public EntidadUsuario(String usuario, String clave, String idNivel, String idEmpleado, String mode) {
        this.usuario = usuario;
        this.clave = clave;
        this.idNivel = idNivel;
        this.idEmpleado = idEmpleado;
        this.mode = mode;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(String idNivel) {
        this.idNivel = idNivel;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    
    
    
}
