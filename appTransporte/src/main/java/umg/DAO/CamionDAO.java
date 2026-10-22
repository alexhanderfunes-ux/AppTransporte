
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
public class CamionDAO {
    
    public void insertar(Camion camion) throws SQLException{
        String sql = "Insert into camion (NoPlaca,Modelo,Tipo,Potencia) values (?,?,?,?)";
        
        try
            (Connection cn= ConexionDB.abrir();
             PreparedStatement ps= cn.prepareStatement(sql)){
             ps.setString(1, camion.getNoPlaca());
             ps.setString(2, camion.getModelo());
             ps.setString(3, camion.getTipo());
             ps.setInt(4, camion.getPotencia());
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se almaceno ningun registro");
             }
        }
    }
    
     public void Actualizar (Camion camion)throws SQLException{
        String sql= "update camion set NoPlaca=?,Modelo=?,Tipo=?,Potencia=? where idCamion = ?";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
                 ps.setInt(5, camion.getIdCamion());
                 ps.setString(1, camion.getNoPlaca());
                 ps.setString(2, camion.getModelo());
                 ps.setString(3, camion.getTipo()); 
                 ps.setInt(4, camion.getPotencia());
                 
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se actualizo ningun registro");
             }
         }
        }
     
     public void Eliminar (int id)throws SQLException{
        String sql= "delete from camion where idCamion = ?";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
             ps.setInt(1, id);
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se pudo eliminar ningun registro");
             }
         }
        }
     
     
     public List<Camion> listar() throws SQLException {
       
   
   List <Camion> lista = new ArrayList<>();
   String sql = "select idCamion,NoPlaca,Modelo,Tipo,Potencia from camion";
   
   try (Connection cn= ConexionDB.abrir();
           PreparedStatement ps = cn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery()){
       
       while (rs.next()){
           Camion camion = new Camion();
           camion.setIdCamion(rs.getInt("idCamion"));
           camion.setModelo(rs.getString("Modelo"));
           
           camion.setTipo(rs.getString("Tipo"));
           camion.setPotencia(Integer.parseInt(rs.getString("Potencia")));
           camion.setNoPlaca(rs.getString("NoPlaca"));
           lista.add(camion); 
       }
   }
   return lista;
}
}
