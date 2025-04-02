package com.kolipri.kalypte;

public final class u extends com.kolipri.kt.k implements com.kolipri.kimp.j {
   private com.kolipri.kt.ab b = null;
   protected au a = null;

   public u(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("", "Cancel");
   }

   public final void a() {
      super.a();
      this.b = new com.kolipri.kt.ab(super.b_);
      this.b.b(2);
      this.b.b(true);
      this.b.a();
      this.d(this.b);
      this.b.c("* Connecting to the Internet\n\nWe are confirming your UserID and Mobile number are available.\nPlease wait...");
      this.g();
      this.b();
   }

   private void b() {
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
      ((Kalypte)super.b_).a("register", "register");
   }

   public final void a(au var1) {
      this.a = var1;
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Cancel")) {
         this.f();
         au var2;
         (var2 = new au(super.b_, "pre-register")).a();
         var2.a(this.v());
      }

      if (var1 != null && var1.equals("Continue")) {
         this.f();
         this.a.G();
      } else if (var1 != null && var1.equals("Close")) {
         this.f();
      }

      ((Kalypte)super.b_).j.b(this);
      this.f();
   }

   public final void a(com.kolipri.kimp.m var1) {
      if (var1 instanceof com.kolipri.kimp.y) {
         if (((com.kolipri.kimp.y)var1).a.equals("success-connect")) {
            this.b.c("* Nearly Finished!\n\nJust a few more details to complete and you will be registered.");
            this.r().d().a("Continue", "Cancel");
            this.w();
         }

         if (((com.kolipri.kimp.y)var1).a.equals("failed-connect")) {
            this.b.c("* Your internet settings may be incorrect\n\n. Please ensure your default Access Point is set to Smart Internet. ");
            this.b(2);
            this.r().d().a("", "Close");
            this.w();
         }
      }

   }
}
