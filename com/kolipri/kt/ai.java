package com.kolipri.kt;

import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class ai {
   protected Image a = null;
   protected r b;

   public ai(r var1) {
      this.b = var1;
   }

   private static int[] a(int[] var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var3 * var4];

      for(int var6 = 0; var6 < var4; ++var6) {
         int var7 = var6 * var2 / var4;

         for(int var8 = 0; var8 < var3; ++var8) {
            int var9 = var8 * var1 / var3;
            var5[var3 * var6 + var8] = var0[var1 * var7 + var9];
         }
      }

      return var5;
   }

   private Image a(Image var1, int var2) {
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      int var6 = var4 * var2 / 100;
      int var7 = var5 * var2 / 100;
      if (var6 < 1) {
         var6 = 1;
      }

      if (var7 < 1) {
         var7 = 1;
      }

      int[] var8 = new int[var1.getWidth() * var1.getHeight()];
      var1.getRGB(var8, 0, var1.getWidth(), 0, 0, var1.getWidth(), var1.getHeight());
      return Image.createRGBImage(a(var8, var4, var5, var6, var7), var6, var7, true);
   }

   public final boolean a(String var1) {
      int var2 = 100;
      this.a = null;
      if (this.b != null) {
         var2 = this.b.l();
      }

      try {
         this.a = Image.createImage(var1);
      } catch (IOException var4) {
         this.a = null;
      }

      if (this.a != null && var2 != 100) {
         this.a = this.a(this.a, var2);
      }

      return this.c();
   }

   public final d a() {
      return this.a == null ? new d(0, 0) : new d(this.a.getWidth(), this.a.getHeight());
   }

   private boolean c() {
      return this.a != null;
   }

   public final Image b() {
      return this.a;
   }
}
