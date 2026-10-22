
package umg.Modelo;

/**
 *
 * @author abell
 */
public class Paquete {
    private int idPaquete;
     private String descripcion;
    private String destinatario;
    private String direccion;
    private int idcamionero;
    private int idciudad;

    public Paquete(int idPaquete, String descripcion, String destinatario, String direccion, int idcamionero, int idciudad) {
        this.idPaquete = idPaquete;
        this.descripcion = descripcion;
        this.destinatario = destinatario;
        this.direccion = direccion;
        this.idcamionero = idcamionero;
        this.idciudad = idciudad;
    }
    
    public Paquete(){
        
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdcamionero() {
        return idcamionero;
    }

    public void setIdcamionero(int idcamionero) {
        this.idcamionero = idcamionero;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", descripcion=" + descripcion + ", destinatario=" + destinatario + ", direccion=" + direccion + ", camionero=" + idcamionero + ", ciudad=" + idciudad + '}';
    }
    
    
}
