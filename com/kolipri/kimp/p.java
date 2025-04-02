package com.kolipri.kimp;

import java.util.Vector;

public final class p extends com.kolipri.kpr.b {
   public int b = -1;

   public p() {
   }

   public p(p var1) {
      this.a((com.kolipri.kpr.b)var1);
      this.b = var1.b;
   }

   public p(p var1, int var2) {
      this.a((com.kolipri.kpr.b)var1);
      this.b = var2;
   }

   public p(com.kolipri.kpr.b var1) {
      if (var1 != null) {
         this.a(var1);
      }

   }

   public final boolean b(String var1) {
      boolean var2 = false;
      String var3;
      if ((var3 = this.d()) != null) {
         var3 = var3.toLowerCase();
      }

      if (var1 != null) {
         var1 = var1.toLowerCase();
      }

      if (var1 != null && var1.length() >= 1) {
         if (var3.indexOf(var1) >= 0) {
            var2 = true;
         }
      } else {
         var2 = true;
      }

      return var2;
   }

   public final boolean a(p var1) {
      boolean var2 = false;
      Vector var6;
      (var6 = new Vector()).addElement("amaz-cid");
      var6.addElement("username");
      var6.addElement("yahoo-id");
      var6.addElement("msn-id");

      for(int var3 = 0; var3 < var6.size(); ++var3) {
         String var4 = this.a((String)var6.elementAt(var3));
         String var5 = var1.a((String)var6.elementAt(var3));
         if (var4 != null && var5 != null && var4.equals(var5)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public final String c(String var1) {
      String var2;
      if ((var2 = this.a("custom-mobile")) == null || var2.length() < 1) {
         var2 = this.a("custom-phone");
      }

      if (var2 == null || var2.length() < 1) {
         var2 = this.a("mobile");
      }

      if (var2 == null || var2.length() < 1) {
         var2 = this.a("phone");
      }

      return var2 != null ? e.a(var2, var1) : var2;
   }

   public final String c() {
      String var1;
      if ((var1 = this.a("custom-email")) == null || var1.length() < 1) {
         var1 = this.a("email");
      }

      return var1;
   }

   public final String d() {
      return this.a(false);
   }

   public final String a(boolean var1) {
      String var2 = null;
      if (!var1) {
         var2 = this.a("custom-displayname");
      }

      if (var2 == null || var2.length() < 1) {
         var2 = this.a("displayname");
      }

      if (var2 == null || var2.length() < 1) {
         String var3 = this.a("firstname");
         String var4 = this.a("lastname");
         var2 = "";
         if (var3 != null) {
            var2 = var2 + var3;
         }

         if (var4 != null) {
            if (var2.length() > 0) {
               var2 = var2 + " ";
            }

            var2 = var2 + var4;
         }

         if (var2.length() < 1) {
            var2 = null;
         }
      }

      if (var2 == null || var2.length() < 1) {
         var2 = this.a("username");
      }

      if (var2 == null || var2.length() < 1) {
         var2 = this.a("yahoo-id");
      }

      if (var2 == null || var2.length() < 1) {
         var2 = this.a("msn-id");
      }

      if (var2 == null || var2.length() < 1) {
         var2 = this.a("custom-mobile");
      }

      if (var2 == null || var2.length() < 1) {
         var2 = this.a("mobile");
      }

      if (var2 == null || var2.length() < 1) {
         var2 = "unknown-user";
      }

      return var2;
   }

   public final boolean e() {
      boolean var1 = false;
      String var2;
      if ((var2 = this.a("status")) != null && !var2.equals("unknown") && !var2.equals("offline")) {
         var1 = true;
      }

      return var1;
   }

   public final boolean f() {
      return !this.g() && !this.j();
   }

   public final boolean g() {
      boolean var1 = false;
      if (this.a("yahoo-id") != null || this.a("msn-id") != null) {
         var1 = true;
      }

      return var1;
   }

   public final boolean h() {
      boolean var1 = false;
      if (this.a("yahoo-id") != null) {
         var1 = true;
      }

      return var1;
   }

   public final boolean i() {
      boolean var1 = false;
      if (this.a("msn-id") != null) {
         var1 = true;
      }

      return var1;
   }

   public final boolean j() {
      boolean var1 = false;
      String var2 = this.a("status");
      String var3 = this.a("username");
      if (var2 == null && var3 == null) {
         var1 = true;
      }

      return var1;
   }
}
