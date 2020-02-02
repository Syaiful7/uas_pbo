package gen;

/***********************************************************************
 * Module:  Prodi.java
 * Author:  User
 * Purpose: Defines the Class Prodi
 ***********************************************************************/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 6fb7974a-d66c-4da1-9d2c-49be6adcc944 */
public class Prodi {
   /** @pdOid 5b42b8d2-1621-4d75-93b8-2059920223a1 */
   private String Id_prodi;
   /** @pdOid 0a51111e-4011-43a3-9cb7-b629fdac96bf */
   private String nama_prodi;
   
   /** @pdRoleInfo migr=no name=Jabatan assc=association4 mult=0..1 */
   public Jabatan jabatan;
   /** @pdRoleInfo migr=no name=Fakultas assc=Association_2 mult=0..1 side=A */
   public Fakultas fakultas;
   
   /** @pdOid d1e3c239-53ec-4c8c-908b-e5137fe89695 */
   public Prodi() {
      // TODO: implement
   }
   
   public Prodi(String Id_prodi, String nama_prodi, String Id_fakultas, int Id_jabatan) {
      // TODO: implement
       setId_prodi(Id_prodi);
       setnama_prodi(nama_prodi);
       jabatan = new Jabatan().satuDb(Id_jabatan);
       fakultas = new Fakultas().satuDb(Id_fakultas);
   }
   
   /** @pdOid f31e0867-343c-4e0e-be67-242c34dcae01 */
   public String getId_prodi() {
      return Id_prodi;
   }
   
   /** @param newId_prodi
    * @pdOid 647a8d8f-a448-4213-96a5-495a8fad7ad4 */
   public void setId_prodi(String newId_prodi) {
      Id_prodi = newId_prodi;
   }
   
   /** @pdOid cea9ac6f-d499-4888-a388-eeb8fcbee64e */
   public String getnama_prodi() {
      return nama_prodi;
   }
   
   /** @param newNama_prodi
    * @pdOid 1aa4e674-46e1-4e5f-8e90-cd67c0c22a09 */
   public void setnama_prodi(String newNama_prodi) {
      nama_prodi = newNama_prodi;
   }

   public void insertDb(){
       String query = "INSERT INTO prodi VALUES (?, ?, ?, ?)";
       try(PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
           statement.setString(1, getId_prodi());
           statement.setString(2, fakultas.getId_fakultas());
           statement.setInt(3, jabatan.getId_jabatan());
           statement.setString(4, getnama_prodi());
           
           statement.execute();
           statement.close();
       } catch (Exception e) {
       }
   }
   
   public Prodi satuDb(String Id_prodi){
       Prodi pro = new Prodi();
       String query = "SELECT * FROM prodi WHERE Id_prodi = (?)";
       try{
           ResultSet rs;
           try (PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
               statement.setString(1, Id_prodi);
               rs = statement.executeQuery();
               if(rs.next()){
                   pro.setId_prodi(rs.getString("Id_prodi"));
                   pro.fakultas = new Fakultas().satuDb(rs.getString("Id_fakultas"));
                   pro.jabatan = new Jabatan().satuDb(rs.getInt("id_jabatan"));
                   pro.setnama_prodi(rs.getString("nama_prodi"));
                                   
               }
           }
           rs.close();
       }
       catch(SQLException e){
           
       }
       return pro;
   }
   
   public Prodi satuJabatanDb(int Id_jabatan){
       Prodi pro = new Prodi();
       String query = "SELECT * FROM prodi WHERE Id_jabatan = (?)";
       try{
           ResultSet rs;
           try (PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
               statement.setInt(1, Id_jabatan);
               rs = statement.executeQuery();
               if(rs.next()){
                   pro.setId_prodi(rs.getString("Id_prodi"));
                   pro.fakultas = new Fakultas().satuDb(rs.getString("Id_fakultas"));
                   pro.jabatan = new Jabatan().satuDb(rs.getInt("Id_jabatan"));
                   pro.setnama_prodi(rs.getString("nama_prodi"));
                                   
               }
           }
           rs.close();
       }
       catch(SQLException e){
           
       }
       return pro;
   }
   
   public ArrayList<Prodi> semuaDb(){
       ArrayList<Prodi> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM prodi";
           
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Prodi pro = new Prodi();
                   pro.setId_prodi(rs.getString("Id_prodi"));
                   pro.fakultas = new Fakultas().satuDb(rs.getString("Id_fakultas"));
                   pro.jabatan = new Jabatan().satuDb(rs.getInt("id_jabatan"));
                   pro.setnama_prodi(rs.getString("nama_prodi"));
               list.add(pro);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
}