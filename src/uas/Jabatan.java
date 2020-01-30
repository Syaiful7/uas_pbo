/***********************************************************************
 * Module:  Jabatan.java
 * Author:  Acer
 * Purpose: Defines the Class Jabatan
 ***********************************************************************/

import java.util.*;

/** @pdOid b7f757fd-5942-4b87-b4af-a548ffd77e20 */
public class Jabatan {
   /** @pdOid b1987919-97de-4277-9f62-a763ae005e01 */
   private int Id_jabatan;
   /** @pdOid d43b8e2f-f62a-40b5-a9b4-52cba1c46838 */
   private String nama_jabatan;
   
   /** @pdRoleInfo migr=no name=Dosen assc=Association_7 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Dosen dosen;
   
   /** @param Id_jabatan 
    * @param nama_jabatan
    * @pdOid a84886b9-de3b-4c1b-94f4-228d2098f51a */
   public Jabatan(int Id_jabatan, String nama_jabatan) {
      // TODO: implement
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

}