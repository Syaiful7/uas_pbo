/***********************************************************************
 * Module:  Fakultas.java
 * Author:  User
 * Purpose: Defines the Class Fakultas
 ***********************************************************************/

import java.util.*;

/** @pdOid 35be3c37-a4f5-4e27-9f6e-b8687636f485 */
public class Fakultas {
   /** @pdOid 64b4ee97-52a3-4d1f-b8b7-b8b72bbcd6ec */
   private int Id_fakultas;
   /** @pdOid 5cd5d4f9-4282-4372-a152-a3e76ae51241 */
   private String nama_fakultas;
   
   /** @pdRoleInfo migr=no name=Prodi assc=Association_2 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Prodi> prodi;
   
   /** @pdOid cb5c9259-a635-4c28-aa3f-fa16fadce5f9 */
   public Fakultas() {
      // TODO: implement
   }
   
   /** @pdOid bab64405-cc83-433e-9453-a7277ee48538 */
   public int getId_fakultas() {
      return Id_fakultas;
   }
   
   /** @param newId_fakultas
    * @pdOid ecff42da-bc0a-4e57-b45c-e93906a10b1d */
   public void setId_fakultas(int newId_fakultas) {
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
   public java.util.Collection<Prodi> getProdi() {
      if (prodi == null)
         prodi = new java.util.HashSet<Prodi>();
      return prodi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProdi() {
      if (prodi == null)
         prodi = new java.util.HashSet<Prodi>();
      return prodi.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProdi */
   public void setProdi(java.util.Collection<Prodi> newProdi) {
      removeAllProdi();
      for (java.util.Iterator iter = newProdi.iterator(); iter.hasNext();)
         addProdi((Prodi)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProdi */
   public void addProdi(Prodi newProdi) {
      if (newProdi == null)
         return;
      if (this.prodi == null)
         this.prodi = new java.util.HashSet<Prodi>();
      if (!this.prodi.contains(newProdi))
         this.prodi.add(newProdi);
   }
   
   /** @pdGenerated default remove
     * @param oldProdi */
   public void removeProdi(Prodi oldProdi) {
      if (oldProdi == null)
         return;
      if (this.prodi != null)
         if (this.prodi.contains(oldProdi))
            this.prodi.remove(oldProdi);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProdi() {
      if (prodi != null)
         prodi.clear();
   }

}