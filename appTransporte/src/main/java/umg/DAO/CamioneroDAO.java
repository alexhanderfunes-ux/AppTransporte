
package umg.DAO;
import umg.Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;


public class CamioneroDAO {
    public void insertar (Camionero camionero)throws SQLException{
        String sql= "insert into camionero(Nombre,Direccion,Telefono,Salario) values (?,?,?,?)";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
             ps.setString(1, camionero.getNombreCamionero());
             ps.setString(2, camionero.getDireccionCamionero());
             ps.setString(3, camionero.getTelefono());
             ps.setDouble(4, camionero.getSalario());
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se almaceno ningun registro");
             }
         }
        }
    
    public void Actualizar (Camionero camionero)throws SQLException{
        String sql= "update camionero set Nombre=?,Direccion=?,Salario=?,Telefono=? where idCamionero = ?";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
                 ps.setInt(5, camionero.getIdCamionero());
                 ps.setString(1, camionero.getNombreCamionero());
                 ps.setString(2, camionero.getDireccionCamionero()); 
                 ps.setString(4, camionero.getTelefono());
                 ps.setDouble(3, camionero.getSalario());
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se actualizo ningun registro");
             }
         }
        }
    
     public void Eliminar (int id)throws SQLException{
        String sql= "delete from camionero where idCamionero = ?";
        
         try (Connection cn = ConexionDB.abrir();
                 PreparedStatement ps = cn.prepareStatement(sql)){
             ps.setInt(1, id);
             int filas = ps.executeUpdate();
             if (filas == 0){
                 throw new SQLException("No se pudo eliminar ningun registro");
             }
         }
        }
     
     
     
     public List<Camionero> listar() throws SQLException {
       
   
   List <Camionero> lista = new ArrayList<>();
   String sql = "select idCamionero,Nombre,Direccion,Salario,Telefono from camionero";
   
   try (Connection cn= ConexionDB.abrir();
           PreparedStatement ps = cn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery()){
       
       while (rs.next()){
           Camionero camionero = new Camionero();
           camionero.setIdCamionero(rs.getInt("idCamionero"));
           camionero.setNombreCamionero(rs.getString("Nombre"));
           camionero.setSalario(rs.getDouble("Salario"));
           camionero.setDireccionCamionero(rs.getString("Direccion"));
           camionero.setTelefono(rs.getString("Telefono"));
           lista.add(camionero); 
       }
   }
   return lista;
}


}
