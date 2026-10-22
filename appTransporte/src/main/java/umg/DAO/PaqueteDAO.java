
package umg.DAO;
import umg.Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author abell
 */
public class PaqueteDAO {
    public void insertar (Paquete paquete)throws SQLException{
        String sql= "insert into paquete (Descripcion,Destinatario,DireccionEnvio,idCamionero,idCiudad) values (?,?,?,?,?)";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
             ps.setString(1, paquete.getDescripcion());
             ps.setString(2, paquete.getDestinatario());
             ps.setString(3, paquete.getDireccion());
             ps.setInt(4, paquete.getIdcamionero());
             ps.setInt(5, paquete.getIdciudad());
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se almaceno ningun registro");
             }
         }
        }
    public void Actualizar (Paquete paquete)throws SQLException{
        String sql= "update paquete set Descripcion=?,Destinatario=?,DireccionEnvio=?,idCamionero=?,idCiudad=? where idPaquete = ?";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
                 ps.setInt(6, paquete.getIdPaquete());
                 ps.setString(1, paquete.getDescripcion());
                 ps.setString(2, paquete.getDestinatario()); 
                 ps.setString(3, paquete.getDireccion());
                 ps.setInt(4, paquete.getIdcamionero());
                 ps.setInt(5, paquete.getIdciudad());
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se actualizo ningun registro");
             }
         }
        }
    
    public void Eliminar (int id)throws SQLException{
        String sql= "delete from paquete where idPaquete = ?";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
             ps.setInt(1, id);
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se pudo eliminar ningun registro");
             }
         }
        }
     
      public List<Paquete> listar() throws SQLException {
       
   
   List <Paquete> lista = new ArrayList<>();
   String sql = "select idPaquete,Descripcion,Destinatario,DireccionEnvio,idCamionero,idCiudad from paquete";
   
   try (Connection cn= ConexionDB.abrir();
           PreparedStatement ps = cn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery()){
       
       while (rs.next()){
           Paquete paquete = new Paquete();
           paquete.setIdPaquete(rs.getInt("idPaquete"));
           paquete.setDescripcion(rs.getString("Descripcion"));
           paquete.setDestinatario(rs.getString("Destinatario"));
           paquete.setDireccion(rs.getString("DireccionEnvio"));
           paquete.setIdcamionero(rs.getInt("idCamionero"));
           paquete.setIdciudad(rs.getInt("idCiudad"));
           lista.add(paquete); 
       }
   }
   return lista;
}
     
}
