package com.kolipri.kalypte;

public final class dg extends com.kolipri.kt.l implements com.kolipri.kt.b {
   public dg(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a() {
      this.a(new com.kolipri.kt.ao(255, 255, 255));
      com.kolipri.kt.ap var1;
      (var1 = new com.kolipri.kt.ap(super.b_)).a();
      this.d(var1);
      com.kolipri.kt.ah var2;
      (var2 = new com.kolipri.kt.ah(super.b_)).b(super.b_.a.b("logo-large"));
      var2.a();
      var2.b(1);
      var2.b(true);
      this.d(var2);
      com.kolipri.kt.ae var3;
      (var3 = new com.kolipri.kt.ae(super.b_, "disabled-options")).a(10, super.b_.a.b("small-arrow"), "Login to Network", (String)null);
      var3.a(15, super.b_.a.b("small-arrow"), "Register a New Account", (String)null);
      var3.a(20, super.b_.a.b("small-arrow"), "Forgotten Password", (String)null);
      var3.a(30, super.b_.a.b("small-arrow"), "Help", (String)null);
      var3.a(31, super.b_.a.b("small-arrow"), "About Uzzap", (String)null);
      var3.a(40, super.b_.a.b("small-arrow"), "Exit Application", (String)null);
      var3.a(this);
      com.kolipri.kt.v var4;
      (var4 = new com.kolipri.kt.v(super.b_, var3)).a();
      var4.b(true);
      com.kolipri.kt.i var5;
      (var5 = new com.kolipri.kt.i(super.b_, "frame", "kt.tabbedpanel.background.color")).a();
      var5.d(var4);
      this.d(var5);
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      (new StringBuffer()).append("Received entry '").append(var2).append("'").toString();
      switch(var2) {
      case 10:
         k var3;
         (var3 = new k(super.b_)).a();
         var3.a(this.v());
         break;
      case 15:
         au var4;
         (var4 = new au(super.b_, "pre-register")).a();
         var4.a(this.v());
         break;
      case 20:
         cv var5;
         (var5 = new cv(super.b_)).b(2);
         var5.b(true);
         var5.a();
         var5.a(this.v());
         break;
      case 30:
         ad var6;
         (var6 = new ad(super.b_)).b();
         var6.a(this.v());
         break;
      case 31:
         bk var7;
         (var7 = new bk(super.b_)).a();
         var7.a(this.v());
         break;
      case 40:
         super.b_.j();
      }

      return true;
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("", "Exit");
   }

   public final void b(String var1) {
      if (var1.equals("Exit")) {
         super.b_.j();
      }

   }

   public final void z() {
      cw var1;
      if (this.u() != null && this.u().u() != null && this.u().u() instanceof cw && (var1 = (cw)this.u().u()).a != null) {
         var1.a.a(false);
      }

   }

   public final void A() {
      cw var1;
      if (this.u() != null && this.u().u() != null && this.u().u() instanceof cw && (var1 = (cw)this.u().u()).a != null) {
         var1.a.a(true);
      }

   }
}
