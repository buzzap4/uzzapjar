package com.kolipri.kpr;

public final class k {
   public static String a(byte[] var0) {
      char[] var1 = new char[4];
      int var2 = 1;
      int var3 = 0;
      int var4 = 0;
      StringBuffer var5 = new StringBuffer();

      for(int var6 = 0; var6 < var0.length; ++var6) {
         int var7 = var0[var6] >= 0 ? var0[var6] : (var0[var6] & 127) + 128;
         switch(var2) {
         case 1:
            var1[0] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(var7 >>> 2);
            var3 = var7 & 3;
            break;
         case 2:
            var1[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(var3 << 4 | var7 >>> 4);
            var3 = var7 & 15;
            break;
         case 3:
            var1[2] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(var3 << 2 | var7 >>> 6);
            var1[3] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(var7 & 63);
            var5.append(var1);
            ++var4;
            if (var4 % 19 == 0) {
               var5.append("\r\n");
            }
         }

         var2 = var2 < 3 ? var2 + 1 : 1;
      }

      switch(var2) {
      case 2:
         var1[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(var3 << 4);
         var1[2] = var1[3] = '=';
         var5.append(var1);
         break;
      case 3:
         var1[2] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(var3 << 2);
         var1[3] = '=';
         var5.append(var1);
      }

      return var5.toString();
   }
}
