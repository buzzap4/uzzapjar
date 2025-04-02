package com.kolipri.kt;

public final class h extends l implements q {
   protected af a = null;
   protected int b = 0;
   protected int c = 0;

   public h(r var1) {
      super(var1);
   }

   public final void a(af var1) {
      this.a = var1;
   }

   public final void a(e var1) {
      super.a(var1);
      if (this.a != null) {
         d var2 = this.a.b();
         ao var4 = this.f("kt.menu.selected.color");
         int var6 = 0;
         int var7 = 0;
         int var9 = var2.b + 8;
         int var10 = var2.a + 8;

         for(int var8 = this.c; var8 < this.a.c(); ++var8) {
            if (var6 + var10 > this.s().a) {
               var6 = 0;
               var7 += var9;
            }

            if (var7 + var9 > this.s().b) {
               return;
            }

            if (var8 == this.b) {
               var1.a(new ag(var6, var7), new d(var10, var9), var4);
            } else {
               ao var3;
               if ((var3 = af.f()) != null) {
                  var1.a(new ag(var6, var7), new d(var10, var9), var3);
               }
            }

            ai var5;
            if ((var5 = this.a.b(var8)) != null) {
               var1.a(new ag(var6 + 4, var7 + 4), var5);
            }

            var6 += var10;
         }
      }

   }

   public final boolean b() {
      boolean var1 = false;
      if (this.a != null) {
         var1 = this.a.e(this.b);
      }

      return var1;
   }

   public final boolean a(al var1) {
      boolean var2 = false;
      int var3 = this.a.b().a + 8;
      this.a.b();
      int var5 = this.s().a / (var3 == 0 ? 1 : var3);
      if (this.a != null) {
         if (var1.b == 3) {
            if (this.b > 0) {
               --this.b;
               this.w();
            }

            var2 = true;
         } else if (var1.b == 4) {
            if (this.b + 1 < this.a.c()) {
               ++this.b;
               this.w();
            }

            var2 = true;
         } else if (var1.b == 2) {
            if (this.b + var5 < this.a.c()) {
               this.b += var5;
               this.w();
            }

            var2 = true;
         } else if (var1.b == 1) {
            if (this.b >= var5) {
               this.b -= var5;
               this.w();
            }

            var2 = true;
         } else if (var1.b == 5) {
            this.b();
            var2 = true;
         }
      }

      return var2;
   }

   public final boolean a(int var1, int var2) {
      boolean var3 = super.a(var1, var2);
      if (this.a != null && !var3) {
         d var4 = this.a.b();
         int var5 = var2 / (var4.b + 8);
         int var6 = var1 / (var4.a + 8);
         int var7 = this.s().a / (var4.a + 8);
         this.b = var5 * var7 + var6;
         this.w();
         this.b();
         var3 = true;
      }

      return var3;
   }

   public final d c() {
      int var1 = this.a.b().a + 8;
      int var2 = this.a.b().b + 8;
      int var3 = this.s().a / (var1 == 0 ? 1 : var1);
      int var4 = this.a.c();
      if (var3 < 1) {
         var3 = 1;
      }

      return new d(this.s().a, (var4 / var3 + (var4 % var3 > 0 ? 1 : 0)) * var2);
   }

   public final void a(int var1) {
      this.b = var1;
      if (this.b >= this.a.c()) {
         this.b = 0;
      }

      if (this.b < 0) {
         this.b = 0;
      }

      this.w();
   }
}
