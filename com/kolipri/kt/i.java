package com.kolipri.kt;

public class i extends l {
   protected String j = null;
   protected String k = null;
   protected ai[] l = new ai[8];

   public i(r var1, String var2, String var3) {
      super(var1);
      this.j = var2;
      this.k = var3;
   }

   public final void d(String var1) {
      this.k = var1;
   }

   public void a() {
      super.a();
      this.b(1);
      this.b(true);
      this.l[0] = super.b_.a.b(this.j + "-topleft");
      this.l[1] = super.b_.a.b(this.j + "-top");
      this.l[2] = super.b_.a.b(this.j + "-topright");
      this.l[3] = super.b_.a.b(this.j + "-left");
      this.l[4] = super.b_.a.b(this.j + "-right");
      this.l[5] = super.b_.a.b(this.j + "-bottomleft");
      this.l[6] = super.b_.a.b(this.j + "-bottom");
      this.l[7] = super.b_.a.b(this.j + "-bottomright");
      if (this.l[0] != null) {
         this.d(this.l[0].a().a);
         new d(this.l[0].a().a * 2, this.l[0].a().b * 2);
      }

   }

   public void a(e var1) {
      int var2 = 0;
      super.b(var1);
      if (this.l[0] != null && this.l[1] != null && this.l[2] != null && this.l[3] != null && this.l[4] != null && this.l[5] != null && this.l[6] != null && this.l[7] != null) {
         var2 = this.l[0].a().a;
         if (this.s().a >= var2 * 2 && this.s().b >= var2 * 2) {
            var1.a(new ag(0, 0), this.l[0]);
            var1.a(new ag(this.s().a - var2, 0), this.l[2]);
            var1.a(new ag(0, this.s().b - var2), this.l[5]);
            var1.a(new ag(this.s().a - var2, this.s().b - var2), this.l[7]);

            int var3;
            for(var3 = var2; var3 < this.s().a - var2; var3 += this.l[1].a().a) {
               var1.a(new ag(var3, 0), this.l[1]);
            }

            for(var3 = var2; var3 < this.s().a - var2; var3 += this.l[6].a().a) {
               var1.a(new ag(var3, this.s().b - var2), this.l[6]);
            }

            for(var3 = var2; var3 < this.s().b - var2; var3 += this.l[3].a().b) {
               var1.a(new ag(0, var3), this.l[3]);
            }

            for(var3 = var2; var3 < this.s().b - var2; var3 += this.l[4].a().b) {
               var1.a(new ag(this.s().a - var2, var3), this.l[4]);
            }
         }
      }

      ao var4;
      if (this.k != null && (var4 = super.b_.a.c(this.k)) != null) {
         var1.a(new ag(var2, var2), new d(this.s().a - var2 * 2, this.s().b - var2 * 2), var4);
      }

      super.c(var1);
   }
}
