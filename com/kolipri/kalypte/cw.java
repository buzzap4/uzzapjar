package com.kolipri.kalypte;

public final class cw extends com.kolipri.kt.l implements com.kolipri.kimp.j {
   public com.kolipri.kt.l a = null;
   public com.kolipri.kt.l b = null;
   public com.kolipri.kt.l c = null;
   public com.kolipri.kt.l e = null;
   public com.kolipri.kt.l f = null;
   protected String g = null;

   public cw(com.kolipri.kt.r var1) {
      super(var1);
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
   }

   public final void f() {
      super.f();
      ((Kalypte)super.b_).j.b(this);
   }

   public final bu b() {
      return (bu)this.c;
   }

   public final cr d() {
      return (cr)this.a;
   }

   public final String e() {
      return this.g;
   }

   public final void a() {
      this.d(0);
      this.c(0);
      this.a(super.b_.a.b("background-pattern"));
      cr var1;
      (var1 = new cr(super.b_)).a();
      var1.a("");
      this.d(var1);
      this.a = var1;
      com.kolipri.kt.l var2;
      (var2 = new com.kolipri.kt.l(super.b_)).a();
      var2.d(0);
      this.d(var2);
      this.b = var2;
      this.a("disabled");
      com.kolipri.kt.x var3;
      (var3 = new com.kolipri.kt.x(super.b_)).a();
      this.d(var3);
   }

   public final void a(com.kolipri.kt.x var1) {
      if (this.b != null) {
         this.b.a(var1);
      }

   }

   public final void z() {
      this.y();
   }

   private void f(com.kolipri.kt.l var1) {
      if (var1 != null && this.b.k() != var1) {
         this.b.i();
         this.b.d(var1);
         var1.a(true);
         this.w();
         this.y();
         this.v().a(new com.kolipri.kt.n(100, 300, this.v().getWidth(), this.v().getHeight(), super.b_.a));
      }

   }

   public final void g() {
      if (!this.g.equals("messenger")) {
         this.g = "messenger";
         this.f(this.c);
         b var2;
         if ((var2 = ((bu)this.c).f) != null) {
            var2.b().a("");
         }
      }

   }

   public final void G() {
      if (!this.g.equals("mainmenu")) {
         this.g = "mainmenu";
      }

      this.f(this.e);
   }

   public final void H() {
      (new bl(super.b_, "", "im")).c();
   }

   private void a(String var1) {
      this.b.h();
      if (var1.equals("disabled")) {
         dg var2;
         (var2 = new dg(super.b_)).a();
         this.g = "disabled";
         this.f(var2);
         if (this.f != null) {
            this.f.f();
         }

         this.f = null;
         if (this.e != null) {
            this.e.f();
         }

         this.e = null;
         if (this.c != null) {
            this.c.f();
         }

         this.c = null;
      } else if (var1.equals("online")) {
         bu var4;
         (var4 = new bu(super.b_)).a();
         var4.a(false);
         if (this.c != null) {
            this.c.f();
         }

         this.c = var4;
         an var3;
         (var3 = new an(super.b_)).a();
         var3.a(false);
         if (this.e != null) {
            this.e.f();
         }

         this.e = var3;
         this.G();
         if (this.f != null) {
            this.f.f();
         }

         this.f = null;
         if (((Kalypte)super.b_).h.a(((Kalypte)super.b_).h.a("amazilia.username") + ".login-display") != null) {
            if (((Kalypte)super.b_).h.a(((Kalypte)super.b_).h.a("amazilia.username") + ".login-display").equals("buddylist")) {
               this.g();
            } else if (((Kalypte)super.b_).h.a(((Kalypte)super.b_).h.a("amazilia.username") + ".login-display").equals("message")) {
               this.g();
               var3.d();
            }
         }
      } else {
         if (this.f != null) {
            this.f.f();
         }

         this.f = new bb(super.b_);
         this.f.a();
         this.b.d(this.f);
         this.f.a(true);
         this.g = "statusdisplay";
         if (this.e != null) {
            this.e.f();
         }

         this.e = null;
         if (this.c != null) {
            this.c.f();
         }

         this.c = null;
      }

      this.w();
      this.y();
   }

   public final void a(com.kolipri.kimp.m var1) {
      if (var1 instanceof com.kolipri.kimp.y) {
         com.kolipri.kimp.y var2;
         if (!(var2 = (com.kolipri.kimp.y)var1).a.equals("online") || ((Kalypte)super.b_).i == null || !((Kalypte)super.b_).i.c().equals("register")) {
            this.a(var2.a);
            return;
         }
      } else {
         com.kolipri.kimp.w var4;
         if (var1 instanceof com.kolipri.kimp.w && (var4 = (com.kolipri.kimp.w)var1).a != null && var4.a.equals("sleeping")) {
            this.G();
            com.kolipri.kt.l var3;
            if ((var3 = super.b_.c().a()) != null) {
               var3.l();
            }
         }
      }

   }
}
