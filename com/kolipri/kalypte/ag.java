package com.kolipri.kalypte;

public final class ag extends com.kolipri.kt.v implements com.kolipri.kt.b {
   public com.kolipri.kimp.p a = null;
   protected com.kolipri.kpr.f b = new com.kolipri.kpr.f();
   protected String c = "";

   public ag(com.kolipri.kt.r var1) {
      super(var1, (com.kolipri.kt.af)null);
   }

   public final String d() {
      return this.c;
   }

   public final void a(com.kolipri.kimp.p var1, String var2) {
      this.b.a();
      this.c = var2;
      this.a = new com.kolipri.kimp.p(var1);
      this.a(this.a);
   }

   public final void b(com.kolipri.kimp.p var1, String var2) {
      this.a = new com.kolipri.kimp.p(var1);
      this.c = var2;
      this.a(var1);
      super.a();
   }

   private void a(com.kolipri.kimp.p var1) {
      com.kolipri.kt.ae var2 = new com.kolipri.kt.ae(super.b_, "history");
      com.kolipri.kimp.o var3 = ((Kalypte)super.b_).m.a(var1);
      com.kolipri.kimp.p var5 = null;
      String var6 = null;
      com.kolipri.kt.ai var7 = super.b_.a.b("message");

      com.kolipri.kimp.s var4;
      while(var3 != null && (var4 = var3.a()) != null) {
         if (var4 != null && this.c != null && var4.e != null && this.c.equals(var4.e)) {
            this.b.a(var4);
         } else if (var4 != null && this.c != null && var4.e != null && this.c.equals("em") && (var4.e.equals("im") || var4.e.equals("sms") || var4.e.equals("smsr"))) {
            this.b.a(var4);
         }
      }

      for(int var8 = this.b.b() - 1; var8 >= 0; --var8) {
         if ((var4 = (com.kolipri.kimp.s)this.b.b(var8)).a.equals(((Kalypte)super.b_).i.c())) {
            var5 = ((Kalypte)super.b_).s();
         } else {
            var5 = ((Kalypte)super.b_).k.a("username", var4.a);
         }

         var6 = var5 != null ? var5.d() : var4.a;
         var2.a(var8, var7, var6 + " (" + com.kolipri.kpr.d.b(Long.parseLong(var4.f)) + ")", var4.d);
      }

      var3.b();
      var2.a(this);
      this.a((com.kolipri.kt.af)var2);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Options", "Buddies");
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Buddies")) {
         bu var4;
         if ((var4 = bu.f(this)) != null) {
            var4.H();
         }

      } else {
         if (var1 != null && var1.equals("Options")) {
            com.kolipri.kt.ae var2 = new com.kolipri.kt.ae(super.b_, "history-options");
            if (this.b.b() > 0) {
               var2.a(10, (com.kolipri.kt.ai)null, "Open Message");
            }

            var2.a(20, (com.kolipri.kt.ai)null, "Send New Message");
            var2.a(40, (com.kolipri.kt.ai)null, "Close Tab");
            var2.a(this);
            com.kolipri.kt.g var3;
            (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var2);
            var3.a(super.b_.c());
         }

      }
   }

   private void G() {
      com.kolipri.kimp.s var1 = (com.kolipri.kimp.s)this.b.b(this.b.b() - 1 - super.f);
      bu var2;
      if ((var2 = bu.f(this)) != null) {
         var2.a(var1);
      }

   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("history-options")) {
         if (var2 == 10) {
            this.G();
         } else if (var2 == 20) {
            (new bl(super.b_, this.a.a("username"), "im")).d();
         } else if (var2 == 40) {
            this.D();
         }

         return true;
      } else {
         if (var1.a().equals("history") && var2 >= 0) {
            this.G();
         }

         return false;
      }
   }

   public final String E() {
      return "History - " + (this.a != null ? this.a.d() : "Unknown");
   }
}
