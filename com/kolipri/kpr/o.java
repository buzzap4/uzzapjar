package com.kolipri.kpr;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public final class o {
   private static int a(InputStreamReader var0) {
      boolean var1 = false;

      int var4;
      try {
         var4 = var0.read();
      } catch (Exception var3) {
         var4 = -1;
      }

      return var4;
   }

   public static String a(String var0) {
      StringBuffer var1;
      InputStream var2 = (var1 = new StringBuffer()).getClass().getResourceAsStream(var0);
      InputStreamReader var3 = null;

      try {
         var3 = new InputStreamReader(var2, "UTF-8");
      } catch (UnsupportedEncodingException var6) {
         var3 = null;
      }

      int var4;
      if (var3 != null) {
         while((var4 = a(var3)) != -1) {
            var1.append((char)var4);
         }
      }

      if (var2 != null) {
         try {
            var2.close();
         } catch (IOException var5) {
         }
      }

      return var1.length() > 0 ? var1.toString() : null;
   }
}
