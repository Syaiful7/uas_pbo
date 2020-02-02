package gen;

/***********************************************************************
 * Module:  Dosen.java
 * Author:  User
 * Purpose: Defines the Class Dosen
 ***********************************************************************/

import java.util.*;
import java.sql.*;

/** @pdOid e4142686-e820-421d-8d46-d75dbbd023e0 */
public class Dosen extends Biodata {
   /** @pdOid 82512d49-32f4-491a-a61a-e31e827be464 */
   private String npp;
   
   /** @pdOid 8bb7551e-e010-4d51-8de4-2aad60d07f47 */
   public Dosen() {
      // TODO: implement
   }
   
   public Dosen(String npp, String nama, java.util.Date tanggal_lahir, String tempat_lahir, int no_telpon, String alamat) {
      // TODO: implement
      super(nama, tanggal_lahir, tempat_lahir, no_telpon, alamat);
      setnpp(npp);
   }
   
   /** @pdOid dc2f3597-dae0-49ef-b192-81284bc821d5 */
   public String getnpp() {
      return npp;
   }
   
   /** @param newNpp
    * @pdOid ad77acd2-222a-4f49-b3b3-337f54d3fb7e */
   public void setnpp(String newNpp) {
      npp = newNpp;
   }

   public void insertDb(){
       String query = "INSERT INTO dosen VALUES (?, ?, ?, ?, ?, ?)";
       try(PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
           statement.setString(1, getnpp());
           statement.setString(2, getnama());
           java.sql.Date sqlDate = new java.sql.Date(getTanggal_lahir().getTime());
           statement.setDate(3, sqlDate);
           statement.setString(4, gettempat_lahir());
           statement.setInt(5, getno_telpon());
           statement.setString(6, getalamat());
           
           statement.execute();
           statement.close();
       } catch (Exception e) {
       }
   }
   
   public Dosen satuDb(String npp){
       Dosen dos = new Dosen();
       String query = "SELECT * FROM dosen WHERE npp = (?)";
       try{
           ResultSet rs;
           try (PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
               statement.setString(1, npp);
               rs = statement.executeQuery();
               if(rs.next()){
                   dos.setnpp(rs.getString("npp"));
                   dos.setnama(rs.getString("nama"));
                   dos.settanggal_lahir(rs.getDate("tanggal_lahir"));
                   dos.settempat_lahir(rs.getString("tempat_lahir"));
                   dos.setno_telpon(rs.getString("jenisKelamin").charAt(0));
                   dos.setalamat(rs.getString("alamat"));
                   
               }
           }
           rs.close();
       }
       catch(SQLException e){
           
       }
       return dos;
   }
   
   public ArrayList<Dosen> semuaDb(){
       ArrayList<Dosen> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM dosen";
           
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Dosen dos = new Dosen();
               dos.setnpp(rs.getString("npp"));
                   dos.setnama(rs.getString("nama"));
                   dos.settanggal_lahir(rs.getDate("tanggal_lahir"));
                   dos.settempat_lahir(rs.getString("tempat_lahir"));
                   dos.setno_telpon(rs.getString("jenisKelamin").charAt(0));
                   dos.setalamat(rs.getString("alamat"));
               list.add(dos);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
    public void perbaruiDb(){
       try{
           String query = "UPDATE dosen SET nama = (?), tanggal_lahir = (?), tempat_lahir = (?),"
                   + " no_telpon = (?), alamat = (?) WHERE npp =(?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           
           statement.setString(1, getnama());
           java.sql.Date sqlDate = new java.sql.Date(getTanggal_lahir().getTime());
           statement.setDate(2, sqlDate);
           statement.setString(3, gettempat_lahir());
           statement.setInt(4, getno_telpon());
           statement.setString(5, getalamat());
           statement.setString(6, getnpp());
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
    
    
}
