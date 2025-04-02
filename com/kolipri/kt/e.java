package com.kolipri.kt;

import javax.microedition.lcdui.Graphics;

public final class e {
   protected Graphics a = null;
   protected ag b = null;

   public e(Graphics var1, ag var2) {
      this.a = var1;
      this.b = new ag(var2.a, var2.b);
   }

   public e(e var1, ag var2) {
      this.a = var1.a;
      this.b = new ag(var1.b.a + var2.a, var1.b.b + var2.b);
   }

   public final void a(ag var1, ai var2) {
      this.a.drawImage(var2.b(), this.b.a + var1.a, this.b.b + var1.b, 20);
   }

   public final void a(ag var1, d var2, ao var3) {
      this.a.setColor(var3.a, var3.b, var3.c);
      this.a.fillRect(this.b.a + var1.a, this.b.b + var1.b, var2.a, var2.b);
   }

   public final void a(ag var1, j var2, ao var3, String var4, int var5) {
      this.a.setFont(var2.a());
      if (var3 != null) {
         this.a.setColor(var3.a, var3.b, var3.c);
      }

      boolean var6 = false;
      byte var7;
      if ((var5 & 1) != 0) {
         var7 = 8;
      } else if ((var5 & 4) != 0) {
         var7 = 1;
      } else {
         var7 = 4;
      }

      int var8;
      if ((var5 & 2) != 0) {
         var8 = var7 | 32;
      } else {
         var8 = var7 | 16;
      }

      this.a.drawString(var4, this.b.a + var1.a, this.b.b + var1.b, var8);
   }
}
