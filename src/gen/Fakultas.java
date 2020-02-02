package gen;

/***********************************************************************
 * Module:  Fakultas.java
 * Author:  User
 * Purpose: Defines the Class Fakultas
 ***********************************************************************/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 35be3c37-a4f5-4e27-9f6e-b8687636f485 */
public class Fakultas {
   /** @pdOid 64b4ee97-52a3-4d1f-b8b7-b8b72bbcd6ec */
   private String Id_fakultas;
   /** @pdOid 5cd5d4f9-4282-4372-a152-a3e76ae51241 */
   private String nama_fakultas;
   
   /** @pdOid cb5c9259-a635-4c28-aa3f-fa16fadce5f9 */
   public Fakultas() {
      // TODO: implement
   }
   
   public Fakultas(String Id_fakultas, String nama_fakultas) {
      // TODO: implement
       setId_fakultas(Id_fakultas);
       setnama_fakultas(nama_fakultas);
   }
   
   /** @pdOid bab64405-cc83-433e-9453-a7277ee48538 */
   public String getId_fakultas() {
      return Id_fakultas;
   }
   
   /** @param newId_fakultas
    * @pdOid ecff42da-bc0a-4e57-b45c-e93906a10b1d */
   public void setId_fakultas(String newId_fakultas) {
      Id_fakultas = newId_fakultas;
   }
   
   /** @pdOid 9eb92d95-19b5-43c4-9f16-38fab25a3d60 */
   public String getnama_fakultas() {
      return nama_fakultas;
   }
   
   /** @param newNama_fakultas
    * @pdOid e1b1117e-b76f-4616-b9eb-0ffe60302025 */
   public void setnama_fakultas(String newNama_fakultas) {
      nama_fakultas = newNama_fakultas;
   }
   
   public void insertDb(){
       String query = "INSERT INTO fakultas VALUES (?, ?)";
       try(PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
           statement.setString(1, getId_fakultas());
           statement.setString(2, getnama_fakultas());
           
           statement.execute();
           statement.close();
       } catch (Exception e) {
       }
   }
   
   public Fakultas satuDb(String Id_fakultas){
       Fakultas fak = new Fakultas();
       String query = "SELECT * FROM fakultas WHERE Id_fakultas = (?)";
       try{
           ResultSet rs;
           try (PreparedStatement statement = connect.getConnection().prepareStatement(query)) {
               statement.setString(1, Id_fakultas);
               rs = statement.executeQuery();
               if(rs.next()){
                   fak.setId_fakultas(rs.getString("Id_fakultas"));
                   fak.setnama_fakultas(rs.getString("nama_fakultas"));
               }
           }
           rs.close();
       }
       catch(SQLException e){
           
       }
       return fak;
   }
   
   public ArrayList<Fakultas> semuaDb(){
       ArrayList<Fakultas> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM fakultas";
           
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Fakultas fak = new Fakultas();
               fak.setId_fakultas(rs.getString("Id_fakultas"));
               fak.setnama_fakultas(rs.getString("nama_fakultas"));
               
               list.add(fak);
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
           String query = "UPDATE fakultas SET nama_fakultas = (?) WHERE Id_fakultas =(?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           
           statement.setString(1, getnama_fakultas());
           statement.setString(2, getId_fakultas());
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
}