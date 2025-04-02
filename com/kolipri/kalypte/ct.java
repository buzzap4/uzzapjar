package com.kolipri.kalypte;

public final class ct extends cf implements com.kolipri.kt.b, dl {
   protected String a = null;
   public com.kolipri.kpr.f H = new com.kolipri.kpr.f();

   public ct(com.kolipri.kt.r var1) {
      super(var1);
      new com.kolipri.kpr.f();
   }

   public final void d(com.kolipri.kpr.f var1) {
      this.H = var1;
      this.a("* Save money by inviting your friends.");
      this.H();
      super.a();
      super.f.a = this.H;
      super.f.g = false;
      this.w();
   }

   public final void g(String var1) {
      this.a = var1;
   }

   public final void a(com.kolipri.kt.x var1) {
      if (this.H.b() > 1) {
         var1.a("Options", "OK");
      } else {
         var1.a("", "OK");
      }
   }

   public final void b(String var1) {
      if (this.H == null || this.H.b() == 0) {
         this.f();
      }

      if (var1.equals("Options")) {
         com.kolipri.kt.ae var7;
         (var7 = new com.kolipri.kt.ae(super.b_, "buddy-list-options")).a(30, (com.kolipri.kt.ai)null, "Select All");
         var7.a(31, (com.kolipri.kt.ai)null, "De-Select All");
         var7.a(32, (com.kolipri.kt.ai)null, "Cancel");
         var7.a(this);
         com.kolipri.kt.g var8;
         (var8 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var7);
         var8.a(super.b_.c());
      } else {
         if (var1.equals("OK")) {
            this.I();

            for(int var2 = 0; super.f.b != null && var2 < super.f.b.b(); ++var2) {
               com.kolipri.kimp.p var3;
               if ((var3 = (com.kolipri.kimp.p)super.f.b.b(var2)) != null) {
                  String var4;
                  if (var3.a("mobile") != null && !var3.a("mobile").equals("")) {
                     var4 = var3.a("mobile");
                  } else {
                     var4 = var3.c(((Kalypte)super.b_).h.a("kalypte.countrycode"));
                  }

                  com.kolipri.kimp.s var5;
                  (var5 = new com.kolipri.kimp.s()).e = "smsr";
                  var5.c = var4;
                  var5.p = true;
                  var5.d = ((Kalypte)super.b_).i.c();
                  ((Kalypte)super.b_).i.a(var5);
                  if (this.a == null) {
                     ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(var3));
                  }
               }
            }

            if (super.f.b.b() > 0) {
               com.kolipri.kt.a var6;
               (var6 = new com.kolipri.kt.a(super.b_)).a();
               var6.a("An invitation was sent to your friend.");
               var6.a(super.b_.c());
            }

            this.f();
         }

      }
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      switch(var2) {
      case 30:
         this.e();
         this.w();
         break;
      case 31:
         this.G();
         this.w();
         break;
      case 32:
         this.f();
      }

      return true;
   }

   public final void e_() {
      this.f();
   }

   public final void a(com.kolipri.kpr.f var1) {
   }
}
