package com.kolipri.kimp;

public final class e {
   private static String a(String var0) {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         char var3;
         if (Character.isDigit(var3 = var0.charAt(var2))) {
            var1.append(var3);
         }
      }

      return var1.toString();
   }

   public static String a(String var0, String var1) {
      StringBuffer var2 = new StringBuffer();
      String var3;
      if ((var3 = a(var0)).length() > 0 && var3.charAt(0) == '0' && var1 != null && var1.length() > 0) {
         var2.append(var1);
         var2.append(var3.substring(1));
         return var2.toString();
      } else {
         return var3;
      }
   }

   public static boolean b(String var0, String var1) {
      boolean var2 = false;
      StringBuffer var3 = new StringBuffer();

      for(int var4 = 0; !var2 && var0 != null && var0.length() > 0 && var1 != null && var1.length() > 0 && var4 < var1.length(); ++var4) {
         if (var1.charAt(var4) == ',') {
            if (var3.length() > 0 && var0.startsWith(var3.toString())) {
               var2 = true;
            }

            var3 = new StringBuffer();
         } else if (var1.charAt(var4) != ' ' && var1.charAt(var4) != '\n' && var1.charAt(var4) != '\r' && var1.charAt(var4) != '\t') {
            var3.append(var1.charAt(var4));
         }
      }

      if (var3.length() > 0 && var0 != null && var0.startsWith(var3.toString())) {
         var2 = true;
      }

      return var2;
   }
}
