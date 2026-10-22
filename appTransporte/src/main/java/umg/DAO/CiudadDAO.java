
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
public class CiudadDAO {
    public void insertar (Ciudad ciudad)throws SQLException{
        String sql= "insert into ciudad(Nombre) values (?)";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
             ps.setString(1, ciudad.getNombre());
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se almaceno ningun registro");
             }
         }
        }
    
     public void Actualizar (Ciudad ciudad)throws SQLException{
        String sql= "update ciudad set Nombre =? where idCiudad = ?";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
             ps.setInt(2, ciudad.getIdCiudad());
              ps.setString(1, ciudad.getNombre());
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se actualizo ningun registro");
             }
         }
        }
     public void Eliminar (int id)throws SQLException{
        String sql= "delete from ciudad where idCiudad = ?";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
             ps.setInt(1, id);
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se pudo eliminar ningun registro");
             }
         }
        }
   public List<Ciudad> listar() throws SQLException {
       
   
   List <Ciudad> lista = new ArrayList<>();
   String sql = "select idCiudad,Nombre from ciudad";
   
   try (Connection cn= ConexionDB.abrir();
           PreparedStatement ps = cn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery()){
       
       while (rs.next()){
           Ciudad ciudad = new Ciudad ();
           ciudad.setIdCiudad(rs.getInt("idCiudad"));
           ciudad.setNombre(rs.getString("Nombre"));
           lista.add(ciudad);
       }
   }
   return lista;
   }       

     
     
     
}
