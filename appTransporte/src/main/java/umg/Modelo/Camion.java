
package umg.Modelo;

/**
 *
 * @author abell
 */
public class Camion {
    private int idCamion;
    private String modelo;
    private String Tipo;
    private int potencia;
    private String NoPlaca;

    public Camion(int idCamion, String modelo, String Tipo, int potencia, String NoPlaca) {
        this.idCamion = idCamion;
        this.modelo = modelo;
        this.Tipo = Tipo;
        this.potencia = potencia;
        this.NoPlaca = NoPlaca;
    }
    
    
    public Camion(){
        
    }

    public int getIdCamion() {
        return idCamion;
    }

    public void setIdCamion(int idCamion) {
        this.idCamion = idCamion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getNoPlaca() {
        return NoPlaca;
    }

    public void setNoPlaca(String NoPlaca) {
        this.NoPlaca = NoPlaca;
    }

    @Override
    public String toString() {
        return "Camion{" + "idCamion=" + idCamion + ", modelo=" + modelo + ", Tipo=" + Tipo + ", potencia=" + potencia + ", NoPlaca=" + NoPlaca + '}';
    }
    
    
}
