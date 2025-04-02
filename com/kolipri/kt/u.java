package com.kolipri.kt;

public class u extends l {
   protected String a = null;
   protected ai b = null;
   protected ai c = null;
   protected ai e = null;

   public u(r var1, String var2) {
      super(var1);
      this.a = var2;
   }

   public final d c() {
      d var1 = new d(0, 0);
      if (this.b != null && this.c != null && this.e != null) {
         var1 = new d(this.b.a().a + this.c.a().a + this.e.a().a, this.e.a().b);
      }

      return var1;
   }

   public void a() {
      super.a();
      this.b(0);
      this.b(true);
      this.b = super.b_.a.b(this.a + "-left");
      this.c = super.b_.a.b(this.a + "-right");
      this.e = super.b_.a.b(this.a + "-middle");
      if (this.b != null && this.c != null && this.e != null) {
         this.a(this.c());
      }

   }

   public void a(e var1) {
      super.a(var1);
      if (this.b != null && this.c != null && this.e != null && this.e.a().a >= 1) {
         if (this.s().a >= this.b.a().a + this.c.a().a) {
            boolean var2 = false;
            int var3 = this.c.a().a;
            var1.a(new ag(0, 0), this.b);

            int var4;
            for(var4 = 0 + this.b.a().a; var4 < this.s().a - var3; var4 += this.e.a().a) {
               var1.a(new ag(var4, 0), this.e);
            }

            var1.a(new ag(var4, 0), this.c);
         }

      }
   }
}
