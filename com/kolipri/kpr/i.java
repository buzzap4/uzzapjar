package com.kolipri.kpr;

import java.util.Vector;

public final class i {
   public static String a(String var0) {
      new String("");
      new StringBuffer(var0.length());
      b var3;
      (var3 = new b()).a("&amp;", "&");
      var3.a("&lt;", "<");
      var3.a("&gt;", ">");
      var3.a("&apos;", "'");
      var3.a("&quot;", "\"");
      if (var0 == null) {
         return null;
      } else {
         for(int var4 = 0; var4 < var3.b(); ++var4) {
            while(a(var3.a(var4).toString(), var3.b(var4).toString(), var0) != null) {
               var0 = a(var3.a(var4).toString(), var3.b(var4).toString(), var0);
            }
         }

         return var0;
      }
   }

   public static String b(String var0) {
      new String("");
      new StringBuffer(var0.length());
      b var3;
      (var3 = new b()).a("&", "&amp;");
      var3.a("<", "&lt;");
      var3.a(">", "&gt;");
      var3.a("'", "&apos;");
      var3.a("\"", "&quot;");
      if (var0 == null) {
         return null;
      } else {
         for(int var4 = 0; var4 < var3.b(); ++var4) {
            while(a(var3.a(var4).toString(), var3.b(var4).toString(), var0) != null) {
               var0 = a(var3.a(var4).toString(), var3.b(var4).toString(), var0);
            }
         }

         return var0;
      }
   }

   public static String a(String var0, String var1, String var2) {
      int var3;
      if ((var3 = var2.indexOf(var0)) == -1) {
         return null;
      } else {
         StringBuffer var4;
         (var4 = new StringBuffer()).append(var2.substring(0, var3));
         var4.append(var1);
         var4.append(var2.substring(var3 + var0.length()));
         return var4.toString();
      }
   }

   public static boolean c(String var0) {
      boolean var1 = false;
      if (var0 == null) {
         return true;
      } else {
         String[] var2;
         if ((var2 = b(var0, "@")).length == 2 && !var2[0].equals("") && !var2[1].equals("")) {
            if (b(var2[1], ".").length >= 2) {
               var1 = false;
            } else {
               var1 = true;
            }
         } else {
            var1 = true;
         }

         return var1;
      }
   }

   public static boolean d(String var0) {
      if (var0 == null) {
         return false;
      } else {
         for(int var3 = 0; var3 < var0.length(); ++var3) {
            char var2;
            if (((var2 = var0.charAt(var3)) < '0' || var2 > '9') && (var2 < 'a' || var2 > 'z') && (var2 < 'A' || var2 > 'Z')) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean e(String var0) {
      if (var0 == null) {
         return false;
      } else {
         for(int var3 = 0; var3 < var0.length(); ++var3) {
            char var2;
            if (((var2 = var0.charAt(var3)) < 'a' || var2 > 'z') && (var2 < 'A' || var2 > 'Z') && var2 != ' ') {
               return true;
            }
         }

         return false;
      }
   }

   private static String[] b(String var0, String var1) {
      Vector var2 = new Vector();
      if (var0 == null) {
         return null;
      } else {
         int var3;
         while((var3 = var0.indexOf(var1)) >= 0) {
            var2.addElement(var0.substring(0, var3));
            var0 = var0.substring(var3 + var1.length());
         }

         var2.addElement(var0);
         String[] var4 = new String[var2.size()];

         for(int var5 = 0; var2.size() > 0 && var5 < var2.size(); ++var5) {
            var4[var5] = (String)var2.elementAt(var5);
         }

         return var4;
      }
   }

   public static String[] a(String var0, String var1) {
      return b(var0, var1);
   }
}
