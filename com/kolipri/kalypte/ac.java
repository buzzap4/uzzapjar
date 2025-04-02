package com.kolipri.kalypte;

public final class ac extends cf implements com.kolipri.kt.b {
   protected com.kolipri.kpr.f a = null;

   public ac(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a(com.kolipri.kpr.f var1) {
      super.a((com.kolipri.kpr.f)var1, (String)null);
      this.a = var1;
      if (super.f != null) {
         super.f.h();
      }

   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Options", "Close");
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Options")) {
         com.kolipri.kt.ae var2;
         (var2 = new com.kolipri.kt.ae(super.b_, "buddy-list-options")).a(10, (com.kolipri.kt.ai)null, "Save selected contacts");
         var2.a(20, (com.kolipri.kt.ai)null, "Discard all");
         var2.a(30, (com.kolipri.kt.ai)null, "Close");
         var2.a(this);
         com.kolipri.kt.g var3;
         (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var2);
         var3.a(super.b_.c());
      } else if (var1 != null && var1.equals("Close")) {
         this.f();
      } else {
         super.b(var1);
      }
   }

   public final void b(com.kolipri.kpr.f var1) {
      if (((Kalypte)super.b_).i != null) {
         for(int var2 = 0; var2 < var1.b(); ++var2) {
            com.kolipri.kimp.p var3;
            if ((var3 = (com.kolipri.kimp.p)var1.b(var2)) != null) {
               var3.b("authorized", "yes");
               ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(var3));
            }
         }
      }

   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      switch(var2) {
      case 10:
         super.I();
         if (this.a != null) {
            this.a.a();
         }

         this.f();
         break;
      case 20:
         if (this.a != null) {
            this.a.a();
         }

         this.f();
         break;
      case 30:
         this.f();
      }

      return true;
   }
}
