package gen;

/***********************************************************************
 * Module:  Prodi.java
 * Author:  User
 * Purpose: Defines the Class Prodi
 ***********************************************************************/

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

}