/***********************************************************************
 * Module:  Dosen.java
 * Author:  Acer
 * Purpose: Defines the Class Dosen
 ***********************************************************************/

import java.util.*;

/** @pdOid afae8e8a-7022-43a7-af69-9b3627363fcb */
public class Dosen {
   /** @pdOid 3c518868-eed4-4838-8af9-f3f05c294b57 */
   private int npp_dosen;
   /** @pdOid 8adb28c3-a103-465c-ab5a-cd675d7f22c7 */
   private int id_jabatan;
   /** @pdOid 9205c5de-6072-4dcd-ae5a-d01c908a5686 */
   private String nama_dosen;
   /** @pdOid 8896951d-0ffe-44bf-b57f-afe6477cd557 */
   private java.util.Date tanggal_lahir;
   /** @pdOid d8617a87-a8a6-4de8-b763-e2d4fd2c79f4 */
   private String tempat_lahir;
   /** @pdOid b8f3c347-3550-4b40-9a30-694df9475c22 */
   private int no_telpon;
   /** @pdOid bb4d962a-f436-4282-ac13-aa095ac7a47a */
   private String alamat;
   
   /** @pdRoleInfo migr=no name=User assc=Association_8 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public User user;
   
   /** @pdOid 8403d138-0659-4924-8d7e-c87f97840ea5 */
   public Dosen() {
      // TODO: implement
   }
   
   /** @pdOid 4136e215-53fb-4b8b-aa02-f8a32699a2ea */
   public int getnpp_dosen() {
      return npp_dosen;
   }
   
   /** @param newNpp_dosen
    * @pdOid 393be7dd-402e-4fa9-9e16-4f0596cddf5a */
   public void setnpp_dosen(int newNpp_dosen) {
      npp_dosen = newNpp_dosen;
   }
   
   /** @pdOid 67c47272-16f7-4ede-86ba-516f611596dd */
   public int getid_jabatan() {
      return id_jabatan;
   }
   
   /** @param newId_jabatan
    * @pdOid f48045c5-8e21-4421-a360-088a08e7623f */
   public void setid_jabatan(int newId_jabatan) {
      id_jabatan = newId_jabatan;
   }
   
   /** @pdOid 4d4e4c1c-c4f4-4aca-af82-2aa02f7dd88b */
   public String getnama_dosen() {
      return nama_dosen;
   }
   
   /** @param newNama_dosen
    * @pdOid ac59d567-f7b9-4ad9-a13d-f61409eea828 */
   public void setnama_dosen(String newNama_dosen) {
      nama_dosen = newNama_dosen;
   }
   
   /** @pdOid 66d5557c-42bf-480d-94c1-0f6a35cb6279 */
   public java.util.Date getTanggal_lahir() {
      return tanggal_lahir;
   }
   
   /** @param newTanggal_lahir
    * @pdOid ad9b1d34-7471-473a-917f-d57610f02040 */
   public void settanggal_lahir(java.util.Date newTanggal_lahir) {
      tanggal_lahir = newTanggal_lahir;
   }
   
   /** @pdOid 14126c5e-e513-43e7-8047-5064df784a0d */
   public String gettempat_lahir() {
      return tempat_lahir;
   }
   
   /** @param newTempat_lahir
    * @pdOid 8ddcc0c8-9f46-4187-9f22-7093273dd7fa */
   public void settempat_lahir(String newTempat_lahir) {
      tempat_lahir = newTempat_lahir;
   }
   
   /** @pdOid dfbf3867-21ec-4220-8bdb-9b0db2b826e6 */
   public int getno_telpon() {
      return no_telpon;
   }
   
   /** @param newNo_telpon
    * @pdOid e877a99c-b49c-49da-9e49-54c0315b51d8 */
   public void setno_telpon(int newNo_telpon) {
      no_telpon = newNo_telpon;
   }
   
   /** @pdOid ba7cdf79-dcb5-4793-a9b9-18439b909da1 */
   public String getalamat() {
      return alamat;
   }
   
   /** @param newAlamat
    * @pdOid f55187c8-4a40-4367-97ef-523ad436c5de */
   public void setalamat(String newAlamat) {
      alamat = newAlamat;
   }

}