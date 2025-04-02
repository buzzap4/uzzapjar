package com.kolipri.kt;

import javax.microedition.lcdui.Font;

public final class j {
   protected Font a;
   public int b;

   public j(int var1) {
      this(64, 0, var1);
   }

   public j(int var1, int var2) {
      this(64, var1, var2);
   }

   private j(int var1, int var2, int var3) {
      this.a = null;
      this.a = Font.getFont(var1 != 32 && var1 != 0 && var1 != 64 ? 64 : var1, var2 != 1 && var2 != 2 && var2 != 0 && var2 != 4 ? 0 : var2, var3 != 8 && var3 != 0 && var3 != 16 ? 8 : var3);
      if (this.a == null) {
         throw new IllegalStateException("Failed to initialize font");
      } else {
         this.b = this.a.getHeight();
      }
   }

   public final Font a() {
      return this.a;
   }

   public final int a(char var1) {
      int var2 = 0;
      if (this.a != null) {
         var2 = this.a.charWidth(var1);
      }

      return var2;
   }

   public final int a(String var1) {
      int var2 = 0;
      if (this.a != null) {
         var2 = this.a.stringWidth(var1);
      }

      return var2;
   }
}
