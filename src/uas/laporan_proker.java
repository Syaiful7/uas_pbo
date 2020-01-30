/***********************************************************************
 * Module:  laporan_proker.java
 * Author:  User
 * Purpose: Defines the Class laporan_proker
 ***********************************************************************/

import java.util.*;

/** @pdOid f51b86ae-1505-40f3-b02b-0ed149770329 */
public class laporan_proker {
   /** @pdOid 9be558ee-8379-4bae-9c66-cf2306386376 */
   private int id_laporan;
   /** @pdOid 7143f64f-0706-45b1-9982-3b76df772e03 */
   private char nama_proker;
   /** @pdOid f17ab34d-3ecd-444c-b9c2-bf13f89e3142 */
   private java.util.Date tgl_realisasi;
   /** @pdOid aa002337-9f57-42b6-bf3e-60b7005c897b */
   private double tgl_selesai;
   /** @pdOid ee0350a5-3455-42d4-a31c-6b5503748c15 */
   private char uraian;
   /** @pdOid 2109014e-0933-4358-91d6-52b4eb9f6f56 */
   private double angg_digunakan;
   
   /** @pdOid 4da83f71-9221-433f-8c25-b932b1f4859c */
   public int getid_laporan() {
      return id_laporan;
   }
   
   /** @param newId_laporan
    * @pdOid 84dc8b89-bfde-4ef8-9c87-59c2efe7c922 */
   public void setid_laporan(int newId_laporan) {
      id_laporan = newId_laporan;
   }
   
   /** @pdOid ed1bfcec-e106-4295-bec1-f3205643901d */
   public char getnama_proker() {
      return nama_proker;
   }
   
   /** @param newNama_proker
    * @pdOid 91008ea9-f45a-40f5-9b28-62a946ffd2a5 */
   public void setnama_proker(char newNama_proker) {
      nama_proker = newNama_proker;
   }
   
   /** @pdOid f23abad4-f070-4613-97eb-7ebb66c7e0aa */
   public java.util.Date getTgl_realisasi() {
      return tgl_realisasi;
   }
   
   /** @param newTgl_realisasi
    * @pdOid 6e12bdc6-706d-4854-8b46-8450acd0ed38 */
   public void settgl_realisasi(java.util.Date newTgl_realisasi) {
      tgl_realisasi = newTgl_realisasi;
   }
   
   /** @pdOid 47434909-22bb-4205-be56-4eef786faefe */
   public double gettgl_selesai() {
      return tgl_selesai;
   }
   
   /** @param newTgl_selesai
    * @pdOid 9658aa6b-7f88-4a8c-be91-4b3cd5339946 */
   public void settgl_selesai(double newTgl_selesai) {
      tgl_selesai = newTgl_selesai;
   }
   
   /** @pdOid b1c21db2-39a5-443f-b161-a6ce5689574d */
   public char geturaian() {
      return uraian;
   }
   
   /** @param newUraian
    * @pdOid de814b3f-acb4-42a2-b67e-2d24a94b6a7f */
   public void seturaian(char newUraian) {
      uraian = newUraian;
   }
   
   /** @pdOid a81e6e3e-55fb-4ce0-b1e9-5e6f010e909a */
   public double getangg_digunakan() {
      return angg_digunakan;
   }
   
   /** @param newAngg_digunakan
    * @pdOid 7c143ef4-ddf4-4b42-8cde-92a2e78e2f98 */
   public void setangg_digunakan(double newAngg_digunakan) {
      angg_digunakan = newAngg_digunakan;
   }

}