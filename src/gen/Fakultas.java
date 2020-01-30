package gen;

/***********************************************************************
 * Module:  Fakultas.java
 * Author:  User
 * Purpose: Defines the Class Fakultas
 ***********************************************************************/

import java.util.*;

/** @pdOid 35be3c37-a4f5-4e27-9f6e-b8687636f485 */
public class Fakultas {
   /** @pdOid 64b4ee97-52a3-4d1f-b8b7-b8b72bbcd6ec */
   private String Id_fakultas;
   /** @pdOid 5cd5d4f9-4282-4372-a152-a3e76ae51241 */
   private String nama_fakultas;
   
   /** @pdRoleInfo migr=no name=Jabatan assc=association5 coll=java.util.Collection impl=java.util.ArrayList mult=0..* */
   public java.util.Collection<Jabatan> jabatan;
   
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
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Jabatan> getJabatan() {
      if (jabatan == null)
         jabatan = new java.util.ArrayList<Jabatan>();
      return jabatan;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJabatan() {
      if (jabatan == null)
         jabatan = new java.util.ArrayList<Jabatan>();
      return jabatan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJabatan */
   public void setJabatan(java.util.Collection<Jabatan> newJabatan) {
      removeAllJabatan();
      for (java.util.Iterator iter = newJabatan.iterator(); iter.hasNext();)
         addJabatan((Jabatan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newJabatan */
   public void addJabatan(Jabatan newJabatan) {
      if (newJabatan == null)
         return;
      if (this.jabatan == null)
         this.jabatan = new java.util.ArrayList<Jabatan>();
      if (!this.jabatan.contains(newJabatan))
         this.jabatan.add(newJabatan);
   }
   
   /** @pdGenerated default remove
     * @param oldJabatan */
   public void removeJabatan(Jabatan oldJabatan) {
      if (oldJabatan == null)
         return;
      if (this.jabatan != null)
         if (this.jabatan.contains(oldJabatan))
            this.jabatan.remove(oldJabatan);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllJabatan() {
      if (jabatan != null)
         jabatan.clear();
   }

}