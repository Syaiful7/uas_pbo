/***********************************************************************
 * Module:  Prodi.java
 * Author:  User
 * Purpose: Defines the Class Prodi
 ***********************************************************************/

import java.util.*;

/** @pdOid 6fb7974a-d66c-4da1-9d2c-49be6adcc944 */
public class Prodi {
   /** @pdOid 5b42b8d2-1621-4d75-93b8-2059920223a1 */
   private int Id_prodi;
   /** @pdOid 634a8ece-660f-4a8b-8e58-bf2ea759f6c3 */
   private int id_fakultas;
   /** @pdOid 0a51111e-4011-43a3-9cb7-b629fdac96bf */
   private String nama_prodi;
   /** @pdOid 18f24748-72e3-4691-a467-76d10cf1adbf */
   private int id_kaprodi;
   
   /** @pdRoleInfo migr=no name=Dosen assc=Association_6 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Dosen dosen;
   
   /** @pdOid d1e3c239-53ec-4c8c-908b-e5137fe89695 */
   public Prodi() {
      // TODO: implement
   }
   
   /** @pdOid f31e0867-343c-4e0e-be67-242c34dcae01 */
   public int getId_prodi() {
      return Id_prodi;
   }
   
   /** @param newId_prodi
    * @pdOid 647a8d8f-a448-4213-96a5-495a8fad7ad4 */
   public void setId_prodi(int newId_prodi) {
      Id_prodi = newId_prodi;
   }
   
   /** @pdOid d05594d0-8956-4231-8905-80761ab7402b */
   public int getid_fakultas() {
      return id_fakultas;
   }
   
   /** @param newId_fakultas
    * @pdOid 8f012956-8a7e-43a6-a42e-b04a6b88873c */
   public void setid_fakultas(int newId_fakultas) {
      id_fakultas = newId_fakultas;
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
   
   /** @pdOid 6edaadde-d02f-4d9e-b6d2-c50e1de39bc3 */
   public int getid_kaprodi() {
      return id_kaprodi;
   }
   
   /** @param newId_kaprodi
    * @pdOid 38fbe1fa-1c67-4928-8d98-4add5f0da293 */
   public void setid_kaprodi(int newId_kaprodi) {
      id_kaprodi = newId_kaprodi;
   }

}