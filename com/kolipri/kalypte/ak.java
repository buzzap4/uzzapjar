package com.kolipri.kalypte;

public final class ak extends com.kolipri.kt.k {
   protected com.kolipri.kt.ab a = null;
   public String b = "";
   public String c = "Close";

   public ak(com.kolipri.kt.r var1) {
      super(var1);
   }

   private void a(String var1) {
      if (this.a != null) {
         this.a.c(var1);
      }

      this.g();
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a(this.b, this.c);
   }

   public final void a() {
      super.a();
      this.a = new com.kolipri.kt.ab(super.b_);
      this.a.a();
      this.a.c(true);
      this.a.b(1);
      this.a.b(true);
      this.d(this.a);
      com.kolipri.kimp.p var1 = ((Kalypte)super.b_).s();
      String var2 = null;
      if (var1 != null) {
         if ((var2 = var1.a("firstname")) != null) {
            var2 = var2 + " " + var1.a("lastname");
         }

         if (var2 == null) {
            var2 = var1.d();
         }
      }

      this.a("* Welcome " + (var2 == null ? "" : var2) + "!\n" + com.kolipri.kpr.o.a("/intro.txt"));
   }

   public final void b(String var1) {
      this.f();
   }
}
