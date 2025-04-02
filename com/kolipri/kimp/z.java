package com.kolipri.kimp;

import java.util.Enumeration;
import javax.microedition.pim.Contact;
import javax.microedition.pim.PIM;
import javax.microedition.pim.PIMList;

public final class z {
   protected PIMList a = null;
   protected Enumeration b = null;

   public final boolean a() {
      boolean var1 = false;

      try {
         this.a = PIM.getInstance().openPIMList(1, 1);
         if (this.a != null) {
            com.kolipri.kpr.d.a(500);
            this.b = this.a.items();
            com.kolipri.kpr.d.a(500);
            if (this.b != null) {
               var1 = true;
            }
         }
      } catch (Exception var3) {
         var3.toString();
         var1 = false;
      }

      return var1;
   }

   public final void b() {
      if (this.a != null) {
         try {
            this.a.close();
         } catch (Exception var2) {
            var2.toString();
         }
      }

      this.a = null;
      this.b = null;
   }

   private static void a(com.kolipri.kpr.b var0, String var1, String var2) {
      if (var0 != null && var1 != null && var2 != null) {
         StringBuffer var3 = new StringBuffer();
         if (var0.a(var1) != null) {
            var3.append(var0.a(var1));
         }

         if (var3.length() > 0) {
            var3.append(",");
         }

         var3.append(var2);
         var0.b(var1, var3.toString());
      }

   }

   private com.kolipri.kpr.b a(Contact var1) {
      com.kolipri.kpr.b var2 = new com.kolipri.kpr.b();
      int[] var3 = var1.getFields();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         int var5;
         if (var3[var4] == 115) {
            for(var5 = 0; var5 < var1.countValues(var3[var4]); ++var5) {
               a(var2, "phone", var1.getString(var3[var4], var5));
            }
         } else if (var3[var4] == 103) {
            for(var5 = 0; var5 < var1.countValues(var3[var4]); ++var5) {
               a(var2, "email", var1.getString(var3[var4], var5));
            }
         } else if (var3[var4] != 105 && var3[var4] != 107) {
            if (var3[var4] == 106) {
               for(var5 = 0; var5 < var1.countValues(var3[var4]); ++var5) {
                  String[] var6;
                  if ((var6 = var1.getStringArray(var3[var4], var5)) != null) {
                     for(int var7 = 0; var7 < var6.length; ++var7) {
                        if (var6[var7] != null && var6[var7].length() >= 1) {
                           if (var7 == 0) {
                              a(var2, "lastname", var6[var7]);
                           } else if (var7 == 1) {
                              a(var2, "firstname", var6[var7]);
                           } else if (var7 == 2) {
                              a(var2, "firstname", var6[var7]);
                           }
                        }
                     }
                  }
               }
            }
         } else {
            for(var5 = 0; var5 < var1.countValues(var3[var4]); ++var5) {
               a(var2, "displayname", var1.getString(var3[var4], var5));
            }
         }
      }

      if (var2.b() < 1) {
         var2 = null;
      }

      return var2;
   }

   public final com.kolipri.kpr.b c() {
      com.kolipri.kpr.b var1 = null;

      while(var1 == null && this.b != null && this.b.hasMoreElements()) {
         Object var2;
         if ((var2 = this.b.nextElement()) instanceof Contact && var2 != null) {
            var1 = this.a((Contact)var2);
         }
      }

      return var1;
   }
}
