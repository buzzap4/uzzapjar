package com.kolipri.kalypte;

public final class bx extends com.kolipri.kt.l implements com.kolipri.kt.b {
   protected de a = null;

   public bx(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void f() {
      super.f();
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Options", "Save");
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Options")) {
         com.kolipri.kt.ae var6;
         (var6 = new com.kolipri.kt.ae(super.b_, "offline-options")).a(10, (com.kolipri.kt.ai)null, "Help");
         var6.a(30, (com.kolipri.kt.ai)null, "Close Tab");
         var6.a(this);
         com.kolipri.kt.g var7;
         (var7 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var6);
         var7.a(super.b_.c());
      } else {
         if (var1 != null && var1.equals("Save")) {
            if (this.a.b.b() > 0) {
               com.kolipri.kimp.p var2;
               if ((var2 = (com.kolipri.kimp.p)this.a.b.b(0)) != null && var2.a("route") != null) {
                  com.kolipri.kpr.b var3;
                  (var3 = new com.kolipri.kpr.b()).b("route", var2.a("route").toString());
                  ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.a(var3));
               }
            } else {
               com.kolipri.kpr.b var4;
               (var4 = new com.kolipri.kpr.b()).b("route", "");
               ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.a(var4));
            }

            cw var5;
            if ((var5 = ((Kalypte)super.b_).n()) != null) {
               var5.G();
            }

            this.D();
         }

      }
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("offline-options")) {
         switch(var2) {
         case 10:
            com.kolipri.kt.a var3;
            (var3 = new com.kolipri.kt.a(super.b_)).a();
            var3.a("* Offline Settings\n\nAllows you to set how your messages will be delivered when UZZAP is off:\n\nChoose \" Available SMS \" to receive messages via SMS when Uzzap is off - Only available for some networks.\n\nChoose \" Email \" to have your messages forwarded to Email when off.\n\nIf no options are selected, your messages will be stored for up to 14 days until you next Login to Uzzap.");
            var3.a(super.b_.c());
            break;
         case 30:
            cw var4;
            if ((var4 = ((Kalypte)super.b_).n()) != null) {
               var4.G();
            }

            this.D();
         }
      }

      return true;
   }

   public final void a() {
      this.b();
      super.a();
   }

   private void b() {
      com.kolipri.kpr.f var1 = new com.kolipri.kpr.f();
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
      com.kolipri.kimp.p var3 = new com.kolipri.kimp.p();
      String var4 = "";
      com.kolipri.kimp.g var5;
      if ((var5 = ((Kalypte)super.b_).i.a()) != null) {
         var4 = var5.e();
      }

      if (com.kolipri.kimp.e.b(var4, ((Kalypte)super.b_).h.a("kalypte.localprefixes"))) {
         var3.b("username", "Available SMS");
         var3.b("status", "online");
         var3.b("route", "sms");
         var1.a(var3);
         if (((Kalypte)super.b_).u.a("route") != null && ((Kalypte)super.b_).u.a("route").equals("sms")) {
            var2.a(var3);
         } else if (((Kalypte)super.b_).u.a("route") == null) {
            var2.a(var3);
         }
      }

      (var3 = new com.kolipri.kimp.p()).b("username", "Email");
      var3.b("status", "offline");
      var3.b("route", "email");
      var1.a(var3);
      if (((Kalypte)super.b_).u.a("route") != null && ((Kalypte)super.b_).u.a("route").equals("email")) {
         var2.a(var3);
      }

      this.a = new de(super.b_, var1);
      this.a.d = "phone";
      this.a.a = var1;
      this.a.g = true;
      this.a.l = true;
      this.a.k = 1;
      this.a.b = var2;
      this.a.a(this);
      com.kolipri.kt.v var6;
      (var6 = new com.kolipri.kt.v(super.b_, this.a)).a();
      var6.a((com.kolipri.kt.af)this.a);
      var6.d("* Offline Settings\n\nChoose how your messages will be delivered when Uzzap is off.\n");
      this.d(var6);
   }

   public final String E() {
      return "Offline Settings";
   }
}
