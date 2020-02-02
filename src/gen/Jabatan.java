package gen;

/***********************************************************************
 * Module:  Jabatan.java
 * Author:  User
 * Purpose: Defines the Class Jabatan
 ***********************************************************************/

import java.util.*;
import java.sql.*;

/** @pdOid b7f757fd-5942-4b87-b4af-a548ffd77e20 */
public class Jabatan {
   /** @pdOid b1987919-97de-4277-9f62-a763ae005e01 */
   private int Id_jabatan;
   /** @pdOid d43b8e2f-f62a-40b5-a9b4-52cba1c46838 */
   private String nama_jabatan;
   
   /** @pdRoleInfo migr=no name=Dosen assc=association3 mult=0..1 side=A */
   public Dosen dosen;
   /** @pdRoleInfo migr=no name=Prodi assc=association4 mult=0..1 side=A */
   public Prodi prodi;
   /** @pdRoleInfo migr=no name=Fakultas assc=association5 mult=0..1 side=A */
   public Fakultas fakultas;
   
   /** @param Id_jabatan 
    * @param nama_jabatan
    * @pdOid a84886b9-de3b-4c1b-94f4-228d2098f51a */
   public Jabatan() {
      // TODO: implement
   }
   
   public Jabatan(String Id_fakultas, String npp, String nama_jabatan) {
      // TODO: implement
       setId_jabatan(semuaDb().size() + 1);
       setnama_jabatan(nama_jabatan);
       dosen = new Dosen().satuDb(npp);
       if(Id_fakultas != null)
           fakultas = new Fakultas().satuDb(Id_fakultas);
       
   }
   
   /** @pdOid bd681891-be24-4f76-ae08-2f9e4157f30f */
   public int getId_jabatan() {
      return Id_jabatan;
   }
   
   /** @param newId_jabatan
    * @pdOid 8543a475-2de9-4323-acb9-aee43d5f2227 */
   public void setId_jabatan(int newId_jabatan) {
      Id_jabatan = newId_jabatan;
   }
   
   /** @pdOid f07b3d6b-b008-4664-869f-1fdfeb053747 */
   public String getnama_jabatan() {
      return nama_jabatan;
   }
   
   /** @param newNama_jabatan
    * @pdOid 0b50041f-db61-4695-a69f-6981d379e501 */
   public void setnama_jabatan(String newNama_jabatan) {
      nama_jabatan = newNama_jabatan;
   }

   public void insertDb(){
       String query = "INSERT INTO jabatan VALUES (?, ?, ?, ?)";
       try(PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
           statement.setInt(1, getId_jabatan());
           if(fakultas.getId_fakultas() != null)
               statement.setString(2, fakultas.getId_fakultas());
           statement.setString(3, dosen.getnpp());
           statement.setString(4, getnama_jabatan());
           
           statement.execute();
           statement.close();
       } catch (Exception e) {
       }
   }
   
   public Jabatan satuDb(int Id_jabatan){
       Jabatan jab = new Jabatan();
       String query = "SELECT * FROM jabatan WHERE Id_jabatan = (?)";
       try{
           ResultSet rs;
           try (PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
               statement.setInt(1, Id_jabatan);
               rs = statement.executeQuery();
               if(rs.next()){
                   jab.setId_jabatan(rs.getInt("Id_jabatan"));
                   jab.fakultas = new Fakultas().satuDb(rs.getString("Id_fakultas"));
                   jab.dosen = new Dosen().satuDb(rs.getString("npp"));
                   jab.setnama_jabatan(rs.getString("nama_jabatan"));
                   
               }
           }
           rs.close();
       }
       catch(SQLException e){
           
       }
       return jab;
   }
   
   public ArrayList<Jabatan> semuaDb(){
       ArrayList<Jabatan> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM jabatan";
           
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Jabatan jab = new Jabatan();
               jab.setId_jabatan(rs.getInt("Id_jabatan"));
               jab.fakultas = new Fakultas().satuDb(rs.getString("Id_fakultas"));
               jab.dosen = new Dosen().satuDb(rs.getString("npp"));
               jab.setnama_jabatan(rs.getString("nama_jabatan"));
               list.add(jab);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
}