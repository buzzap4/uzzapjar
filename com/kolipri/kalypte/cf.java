package com.kolipri.kalypte;

public class cf extends com.kolipri.kt.g {
   protected de f = null;
   protected dl g = null;
   protected boolean h = false;
   protected ck i = null;
   public boolean E;
   protected String F;
   protected String G;

   public cf(com.kolipri.kt.r var1) {
      super(var1);
      new com.kolipri.kpr.f();
      this.E = true;
      this.F = "OK";
      this.G = "Cancel";
   }

   public final void a(dl var1) {
      this.g = var1;
   }

   public final void c(com.kolipri.kpr.f var1) {
      for(int var2 = 0; var2 < var1.b(); ++var2) {
         com.kolipri.kimp.p var3;
         if ((var3 = (com.kolipri.kimp.p)var1.b(var2)) != null) {
            this.a(var3);
         }
      }

   }

   public final void a(com.kolipri.kimp.p var1) {
      for(int var2 = 0; this.f != null && var2 < this.f.a.b(); ++var2) {
         com.kolipri.kimp.p var3;
         if ((var3 = (com.kolipri.kimp.p)this.f.a.b(var2)) != null && var3.b == var1.b) {
            this.f.e(var2);
         }
      }

   }

   public final void e() {
      if (this.f != null) {
         this.f.h();
      }

   }

   public final void G() {
      if (this.f != null) {
         this.f.i();
      }

   }

   public final void a(com.kolipri.kpr.f var1, String var2) {
      this.f = new de(super.b_);
      if (var1 != null) {
         this.f.a(var1);
      } else {
         this.f.a(((Kalypte)super.b_).k);
      }

      this.f.f = this.h;
      if (var2 != null && var2.length() > 0) {
         this.f.d = var2;
      }

      this.f.e = this;
      super.a((com.kolipri.kt.af)this.f);
      if (this.E) {
         this.i = new ae(super.b_, this);
         this.i.b(0);
         this.i.b(true);
         this.i.a();
         this.i.z();
         this.d(this.i);
      }

   }

   public final void H() {
      this.E = false;
   }

   public final void c(String var1) {
      this.f.a(var1);
      this.b(0);
      this.b(true);
      super.a((com.kolipri.kt.af)this.f);
      if (this.E) {
         this.i = new ae(super.b_, this);
         this.i.d(var1);
         this.i.b(0);
         this.i.b(true);
         this.i.a();
         this.i.z();
         this.d(this.i);
      }

   }

   public void a() {
      this.a((com.kolipri.kpr.f)null, (String)null);
   }

   public final void a(String var1, String var2) {
      if (var1 != null) {
         this.F = var1;
      }

      if (var2 != null) {
         this.G = var2;
      }

   }

   public void a(com.kolipri.kt.x var1) {
      var1.a(this.F, this.G);
   }

   public void b(String var1) {
      if (var1 != null && var1.equals(this.G)) {
         if (this.g != null) {
            this.g.e_();
         }
      } else if (var1 != null && var1.equals(this.F)) {
         this.I();
      }

      this.f();
   }

   public void b(com.kolipri.kpr.f var1) {
      if (this.g != null) {
         this.g.a(var1);
      }

   }

   public final void I() {
      if (this.f != null) {
         this.b(this.f.b);
      }

   }

   public final boolean a(com.kolipri.kt.al var1) {
      boolean var2 = false;
      var2 = super.a(var1);
      if (var1.b == 6) {
         this.c("");
         this.w();
      }

      return var2;
   }
}
