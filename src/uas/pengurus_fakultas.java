/***********************************************************************
 * Module:  pengurus_fakultas.java
 * Author:  User
 * Purpose: Defines the Class pengurus_fakultas
 ***********************************************************************/

import java.util.*;

/** @pdOid b7ff57ef-e9b4-418e-8d0f-73526a810b46 */
public class pengurus_fakultas {
   /** @pdOid 47fda30c-2a9c-4c2c-a7e0-111a377a50e7 */
   private int id_pengurus;
   /** @pdOid c810434a-2575-4c02-89aa-5ca3f4523e3d */
   private int id_fakultas;
   /** @pdOid 2b8ee657-4a1f-429b-81e5-718d7bbff34c */
   private int id_jabatan;
   /** @pdOid 1a44c188-f512-4d8a-a9db-3e2164264fa7 */
   private int npp_dosen;
   
   /** @pdRoleInfo migr=no name=Fakultas assc=Association_5 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Fakultas fakultas;
   
   /** @pdOid 83e60f7f-ea3d-4aed-bb42-8e631ea0ba03 */
   public int getnpp_dosen() {
      return npp_dosen;
   }
   
   /** @param newNpp_dosen
    * @pdOid 91957010-1c2c-4eaf-b13d-af18d649692e */
   public void setnpp_dosen(int newNpp_dosen) {
      npp_dosen = newNpp_dosen;
   }
   
   /** @pdOid 355c8994-fbf4-419f-871c-601eb0a36430 */
   public int getid_pengurus() {
      return id_pengurus;
   }
   
   /** @param newId_pengurus
    * @pdOid 8b784ad3-8a8a-4f66-9a04-81b7d8267b81 */
   public void setid_pengurus(int newId_pengurus) {
      id_pengurus = newId_pengurus;
   }
   
   /** @pdOid ac3035e2-3a66-4b9f-94fa-34b83d55ccfa */
   public int getid_fakultas() {
      return id_fakultas;
   }
   
   /** @param newId_fakultas
    * @pdOid f1407866-b4fc-4a69-8e9c-7e4f4204038f */
   public void setid_fakultas(int newId_fakultas) {
      id_fakultas = newId_fakultas;
   }
   
   /** @pdOid 9c750cd7-11ab-432a-a22e-5ccd5fc03df3 */
   public int getid_jabatan() {
      return id_jabatan;
   }
   
   /** @param newId_jabatan
    * @pdOid 27d171b7-530e-47fa-af76-2bf042b9f00d */
   public void setid_jabatan(int newId_jabatan) {
      id_jabatan = newId_jabatan;
   }

}