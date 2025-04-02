package com.kolipri.kalypte;

public final class c extends com.kolipri.kt.g implements com.kolipri.kt.b {
   protected com.kolipri.kpr.f a = new com.kolipri.kpr.f();

   public c(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("", "Close");
   }

   public final String b() {
      return "* Change theme\n";
   }

   public final void a() {
      com.kolipri.kt.ae var1 = new com.kolipri.kt.ae(super.b_, "themes");
      this.a = com.kolipri.kt.aj.a();
      var1.a(this);
      int var3 = 0;

      for(int var2 = 0; var2 < this.a.b(); ++var2) {
         var1.a(var2, super.b_.a.b("small-arrow"), (String)this.a.b(var2));
         if (super.b_.a.c.equals((String)this.a.b(var2))) {
            var3 = var2;
         }
      }

      super.a((com.kolipri.kt.af)var1);
      if (super.b != null) {
         super.b.a(var3);
      }

   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Close")) {
         this.f();
      }

   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      String var3;
      if (var2 >= 0 && var2 < this.a.b() && (var3 = (String)this.a.b(var2)) != null) {
         super.b_.a.a(var3);
         ((Kalypte)super.b_).h.b("kalypte.theme", var3);
         ((Kalypte)super.b_).h.c();
         this.v().a(new com.kolipri.kt.n(100, 300, this.v().getWidth(), this.v().getHeight(), super.b_.a));
      }

      return false;
   }
}
