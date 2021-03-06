package gen;

/***********************************************************************
 * Module:  Program_kerja.java
 * Author:  User
 * Purpose: Defines the Class Program_kerja
 ***********************************************************************/

import java.util.*;
import java.sql.*;

/** @pdOid e856b1f9-dab0-4ddb-9cd3-d601f6426682 */
public class Program_kerja {
   /** @pdOid a9827618-12e6-4777-b8b0-098037931fac */
   private int Id_proker;
   /** @pdOid 913b23fc-9557-4f75-b851-bdc1cbb54cbb */
   private String nama_proker;
   /** @pdOid ab213625-224f-4918-9bfc-bc5f488776da */
   private java.util.Date tgl_pelaksanaan;
   /** @pdOid 4a22dec4-0598-4212-b648-cfa901b329ec */
   private java.util.Date tgl_selesai;
   /** @pdOid d4bbf0f8-7382-4ba6-bcf5-6708268355eb */
   private double angg_digunakan;
   /** @pdOid 81d69860-0ee1-4878-ad30-07e6525a5503 */
   private String lokasi_proker;
   /** @pdOid 1aa88ef3-ee78-461d-98af-5c350c929fc1 */
   private String uraian;
   /** @pdOid 119a348f-53fd-4b8a-b9fe-a97272da9ced */
   private String status;
   
   /** @pdRoleInfo migr=no name=Prodi assc=Association_3 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Prodi prodi;
   
   /** @param status
    * @pdOid 23548a5d-a65b-4e26-9e80-8958afbc6864 */
   public Program_kerja() {
      // TODO: implement
   }
   
   public Program_kerja(String nama_proker, java.util.Date tgl_pelaksanaan, java.util.Date tgl_selesai, double angg_digunakan, String lokasi_proker, String uraian, String status, String Id_prodi) {
      // TODO: implement
      setId_proker(semuaDb().size() + 1);
      setnama_proker(nama_proker);
      settgl_pelaksanaan(tgl_pelaksanaan);
      settgl_selesai(tgl_selesai);
      setangg_digunakan(angg_digunakan);
      setlokasi_proker(lokasi_proker);
      seturaian(uraian);
      setstatus(status);
      prodi = new Prodi().satuDb(Id_prodi);
   }
   
   /** @pdOid 71ccd32d-7069-4118-90c4-65d823e34449 */
   public int getId_proker() {
      return Id_proker;
   }
   
   /** @param newId_proker
    * @pdOid 9432d122-aaed-4e3f-90c9-ba3000a18d0e */
   public void setId_proker(int newId_proker) {
      Id_proker = newId_proker;
   }
   
   /** @pdOid 804f2682-7827-43cc-8f92-05a3c65eed4b */
   public String getnama_proker() {
      return nama_proker;
   }
   
   /** @param newNama_proker
    * @pdOid 0ffc3b63-b2a7-4c7a-9941-06dbf0655c24 */
   public void setnama_proker(String newNama_proker) {
      nama_proker = newNama_proker;
   }
   
   /** @pdOid d8c1c2dd-8851-460f-a164-0674ef1e192d */
   public java.util.Date getTgl_pelaksanaan() {
      return tgl_pelaksanaan;
   }
   
   /** @param newTgl_pelaksanaan
    * @pdOid bf6c2379-a9c8-43b5-884a-caa3e88fd384 */
   public void settgl_pelaksanaan(java.util.Date newTgl_pelaksanaan) {
      tgl_pelaksanaan = newTgl_pelaksanaan;
   }
   
   /** @pdOid c737d3da-6fbd-4c90-b214-9a3a39843b14 */
   public java.util.Date getTgl_selesai() {
      return tgl_selesai;
   }
   
   /** @param newTgl_selesai
    * @pdOid f013dcf4-eb93-4d98-8587-5e8509d83f25 */
   public void settgl_selesai(java.util.Date newTgl_selesai) {
      tgl_selesai = newTgl_selesai;
   }
   
   /** @pdOid 5f9dc03d-6985-458e-8d75-36424475926f */
   public double getangg_digunakan() {
      return angg_digunakan;
   }
   
   /** @param newAngg_digunakan
    * @pdOid 815cade5-d338-4b4f-a0a9-e9bf94e2a9bc */
   public void setangg_digunakan(double newAngg_digunakan) {
      angg_digunakan = newAngg_digunakan;
   }
   
   /** @pdOid 6641e3be-5d2c-4b30-8a22-9fb85cab9a72 */
   public String getlokasi_proker() {
      return lokasi_proker;
   }
   
   /** @param newLokasi_proker
    * @pdOid 19a6b947-5b36-43c0-91f7-7e110997b863 */
   public void setlokasi_proker(String newLokasi_proker) {
      lokasi_proker = newLokasi_proker;
   }
   
   /** @pdOid e31fa825-9780-41cb-a963-94fbd8ed4aff */
   public String geturaian() {
      return uraian;
   }
   
   /** @param newUraian
    * @pdOid 115c8da9-5645-451e-933a-d2f150a08641 */
   public void seturaian(String newUraian) {
      uraian = newUraian;
   }
   
   /** @pdOid 0fd4af92-f799-4d9a-b633-b77c4b33486f */
   public String getstatus() {
      return status;
   }
   
   /** @param newStatus
    * @pdOid c0394fd7-0ec0-458a-94c8-61668b417c10 */
   public void setstatus(String newStatus) {
      status = newStatus;
   }

   public void insertDb(){
       String query = "INSERT INTO program_kerja VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
       try(PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
           statement.setInt(1, getId_proker());
           statement.setString(2, prodi.getId_prodi());
           statement.setString(3, getnama_proker());
           java.sql.Date sqlDate = new java.sql.Date(getTgl_pelaksanaan().getTime());
           statement.setDate(4, sqlDate);
           sqlDate = new java.sql.Date(getTgl_selesai().getTime());
           statement.setDate(5, sqlDate);
           statement.setDouble(6, getangg_digunakan());
           statement.setString(7, getlokasi_proker());
           statement.setString(8, geturaian());
           statement.setString(9, getstatus());
           
           statement.execute();
           statement.close();
       } catch (Exception e) {
       }
   }
   
   public Program_kerja satuDb(int Id_proker){
       Program_kerja proker = new Program_kerja();
       String query = "SELECT * FROM program_kerja WHERE Id_proker = (?)";
       try{
           ResultSet rs;
           try (PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
               statement.setInt(1, Id_proker);
               rs = statement.executeQuery();
               if(rs.next()){
                   proker.setId_proker(rs.getInt("Id_proker"));
                   proker.prodi = new Prodi().satuDb(rs.getString("Id_prodi"));
                   proker.setnama_proker(rs.getString("nama_proker"));
                   proker.settgl_pelaksanaan(rs.getDate("tgl_pelaksanaan"));
                   proker.settgl_selesai(rs.getDate("tgl_selesai"));
                   proker.setangg_digunakan(rs.getDouble("angg_digunakan"));
                   proker.setlokasi_proker(rs.getString("lokasi_proker"));
                   proker.seturaian(rs.getString("uraian"));
                   proker.setstatus(rs.getString("status"));                
               }
           }
           rs.close();
       }
       catch(SQLException e){
           
       }
       return proker;
   }
   
   public ArrayList<Program_kerja> semuaDb(){
       ArrayList<Program_kerja> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM program_kerja";
           
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Program_kerja proker = new Program_kerja();
               proker.setId_proker(rs.getInt("Id_proker"));
               proker.prodi = new Prodi().satuDb(rs.getString("Id_prodi"));
               proker.setnama_proker(rs.getString("nama_proker"));
               proker.settgl_pelaksanaan(rs.getDate("tgl_pelaksanaan"));
               proker.settgl_selesai(rs.getDate("tgl_selesai"));
               proker.setangg_digunakan(rs.getDouble("angg_digunakan"));
               proker.setlokasi_proker(rs.getString("lokasi_proker"));
               proker.seturaian(rs.getString("uraian"));
               proker.setstatus(rs.getString("status"));    
               list.add(proker);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public void updateDb(){
       String query = "UPDATE program_kerja SET Id_prodi =(?), nama_proker =(?), tgl_pelaksanaan =(?), tgl_selesai =(?), angg_digunakan =(?), lokasi_proker =(?), uraian =(?), status  =(?) WHERE Id_proker =(?)";
       try(PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
           statement.setString(1, prodi.getId_prodi());
           statement.setString(2, getnama_proker());
           java.sql.Date sqlDate = new java.sql.Date(getTgl_pelaksanaan().getTime());
           statement.setDate(3, sqlDate);
           sqlDate = new java.sql.Date(getTgl_selesai().getTime());
           statement.setDate(4, sqlDate);
           statement.setDouble(5, getangg_digunakan());
           statement.setString(6, getlokasi_proker());
           statement.setString(7, geturaian());
           statement.setString(8, getstatus());
           statement.setInt(9, getId_proker());
           
           statement.execute();
           statement.close();
       } catch (Exception e) {
       }
   }
}