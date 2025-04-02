package com.kolipri.kt;

public final class ao {
   public int a;
   public int b;
   public int c;

   public ao(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public ao() {
      this.a = 0;
      this.b = 0;
      this.c = 0;
   }

   public final boolean a(String var1) {
      boolean var2 = false;
      if (var1.length() == 6) {
         try {
            this.a = Integer.parseInt(var1.substring(0, 2), 16);
            this.b = Integer.parseInt(var1.substring(2, 4), 16);
            this.c = Integer.parseInt(var1.substring(4, 6), 16);
            var2 = true;
         } catch (Exception var4) {
            var2 = false;
         }
      }

      return var2;
   }

   public static ao b(String var0) {
      ao var1 = null;
      if (var0 != null && !(var1 = new ao()).a(var0)) {
         var1 = null;
      }

      return var1;
   }
}
