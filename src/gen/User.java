package gen;

/***********************************************************************
 * Module:  User.java
 * Author:  User
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.util.*;

/** @pdOid 535391fd-540d-4e0a-b8ef-3ed7292c4202 */
public class User {
   /** @pdOid 34920b19-2ed9-42a4-9739-af44382ee8a5 */
   private String username;
   /** @pdOid daab7c1a-3245-40c8-a128-6c8f5e5a0de0 */
   private String password;
   /** @pdOid b474b519-1a2e-4cbb-8271-3e5be66415b4 */
   private String tipeLogin;
   
   /** @param Status
    * @pdOid 86d065c4-67be-453e-bae2-cbbe31d27812 */
   public User(int Status) {
      // TODO: implement
   }
   
   /** @pdOid e20570fe-2995-4b32-b09f-8cb0ecd6271e */
   public String getusername() {
      return username;
   }
   
   /** @param newUsername
    * @pdOid 56280830-ea62-4f25-9bce-71b4b391bf3d */
   public void setusername(String newUsername) {
      username = newUsername;
   }
   
   /** @pdOid 08888d19-9b58-4f2e-bcbe-33958e1c7f1a */
   public String getpassword() {
      return password;
   }
   
   /** @param newPassword
    * @pdOid 128525b8-b595-45f6-8868-5216bf56d5a1 */
   public void setpassword(String newPassword) {
      password = newPassword;
   }
   
   /** @pdOid 271e3efe-2d6b-4d70-b8ca-3778e5a86b11 */
   public String getTipeLogin() {
      return tipeLogin;
   }
   
   /** @param newTipeLogin
    * @pdOid b0ec45ea-54e8-407c-ba13-d2325a68a7b8 */
   public void setTipeLogin(String newTipeLogin) {
      tipeLogin = newTipeLogin;
   }

}