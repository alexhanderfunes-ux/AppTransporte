
package umg.Modelo;

/**
 *
 * @author abell
 */
public class Camionero {
    private int idCamionero;
    private String nombreCamionero;
    private String direccionCamionero;
    private double salario;
    private String telefono;

    public Camionero(int idCamionero, String nombreCamionero, String direccionCamionero, double salario, String telefono) {
        this.idCamionero = idCamionero;
        this.nombreCamionero = nombreCamionero;
        this.direccionCamionero = direccionCamionero;
        this.salario = salario;
        this.telefono = telefono;
    }
    public Camionero(){
        
    }

    public int getIdCamionero() {
        return idCamionero;
    }

    public void setIdCamionero(int idCamionero) {
        this.idCamionero = idCamionero;
    }

    public String getNombreCamionero() {
        return nombreCamionero;
    }

    public void setNombreCamionero(String nombreCamionero) {
        this.nombreCamionero = nombreCamionero;
    }

    public String getDireccionCamionero() {
        return direccionCamionero;
    }

    public void setDireccionCamionero(String direccionCamionero) {
        this.direccionCamionero = direccionCamionero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Camionero{" + "idCamionero=" + idCamionero + ", nombreCamionero=" + nombreCamionero + ", direccionCamionero=" + direccionCamionero + ", salario=" + salario + ", telefono=" + telefono + '}';
    }
    
}
