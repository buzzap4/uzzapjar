package com.kolipri.kalypte;

public final class d extends com.kolipri.kt.af {
   protected com.kolipri.kpr.f a = new com.kolipri.kpr.f();
   protected com.kolipri.kpr.f b = new com.kolipri.kpr.f();
   protected com.kolipri.kimp.p c = null;
   public com.kolipri.kt.l d = null;
   public boolean e = false;
   public boolean f = false;
   public String g = "";

   public d(com.kolipri.kt.r var1, com.kolipri.kimp.p var2, com.kolipri.kpr.f var3) {
      super(var1);
      this.a(var3);
      this.c = var2;
   }

   public final String a() {
      return "contact-list-menu-entries";
   }

   private void a(com.kolipri.kpr.f var1) {
      this.a.a();
      this.e = false;

      for(int var2 = 0; var1 != null && var2 < var1.b(); ++var2) {
         this.a.a(var1.b(var2));
      }

   }

   public final String a(int var1) {
      String var2 = "";
      if (this.a != null && this.c != null) {
         if (this.g.equals("mobile")) {
            var2 = this.a.b(var1).toString() + "(Phone number)";
         } else {
            var2 = this.a.b(var1).toString() + "(Email address)";
         }
      }

      return var2;
   }

   public final com.kolipri.kt.ai b(int var1) {
      com.kolipri.kt.ai var2 = null;
      com.kolipri.kimp.p var3;
      if (this.f && (var3 = (com.kolipri.kimp.p)this.a.b(var1)) != null && var3.a("status") != null) {
         if (var3.a("status").equals("freeforchat")) {
            var2 = super.i.a.b("online");
         } else {
            var2 = super.i.a.b(var3.a("status"));
         }

         if (var2 == null) {
            var2 = super.i.a.b("offline");
         }
      }

      return var2;
   }

   public final com.kolipri.kt.d b() {
      com.kolipri.kt.ai var1;
      return (var1 = super.i.a.b("freeforchat")) != null ? var1.a() : new com.kolipri.kt.d(0, 0);
   }

   public final com.kolipri.kt.ai c(int var1) {
      if (this.e) {
         return null;
      } else {
         return this.j(var1) ? super.i.a.b("tickbox-selected") : super.i.a.b("tickbox-not-selected");
      }
   }

   public final int d(int var1) {
      int var2 = 0;
      com.kolipri.kt.ai var3;
      if (!this.e && (var3 = super.i.a.b("tickbox-selected")) != null) {
         var2 = var3.a().a + 2;
      }

      return var2;
   }

   public final int c() {
      return this.a.b();
   }

   private boolean j(int var1) {
      boolean var2 = false;
      if (this.a != null) {
         for(int var3 = 0; var3 < this.b.b(); ++var3) {
            if (this.b.b(var3) == this.a.b(var1)) {
               var2 = true;
               break;
            }
         }
      }

      return var2;
   }

   private void k(int var1) {
      if (this.a != null) {
         this.b.a();
      }

      this.b.a(this.a.b(var1));
   }

   private void h() {
      if (this.b != null) {
         this.b.a(0);
      }

   }

   private void l(int var1) {
      if (this.j(var1)) {
         this.h();
      } else {
         this.k(var1);
      }
   }

   public final boolean e(int var1) {
      this.l(var1);
      if (this.d != null) {
         this.d.w();
         this.d.b("Select");
      }

      return false;
   }
}
