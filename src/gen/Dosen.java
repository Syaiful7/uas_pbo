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
           statement.setString(3, getNik());
           java.sql.Date sqlDate = new java.sql.Date(getTanggalLahir().getTime());
           statement.setDate(4, sqlDate);
           statement.setString(5, ""+getJenisKelamin());
           statement.setString(6, getAlamat());
           statement.setString(7, getEmail());
           statement.setString(8, getAgama());
           
           statement.execute();
           statement.close();
       } catch (Exception e) {
       }
   }
}