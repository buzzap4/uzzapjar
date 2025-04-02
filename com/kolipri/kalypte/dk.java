package com.kolipri.kalypte;

public final class dk extends com.kolipri.kt.g implements com.kolipri.kt.o {
   protected dh a = null;
   protected cg f = null;

   public dk(com.kolipri.kt.r var1, cg var2) {
      super(var1);
      this.f = var2;
   }

   public final void g(String var1) {
      this.a = new dh(super.b_, this);
      this.a.a(var1);
      super.a((com.kolipri.kt.af)this.a);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("New Group", "Close");
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("New Group")) {
         com.kolipri.kt.ad var2;
         (var2 = new com.kolipri.kt.ad(super.b_)).a();
         var2.a((com.kolipri.kt.o)this);
         var2.b(50);
         var2.b("Name of new group");
         var2.b();
      } else {
         if (var1 != null && var1.equals("Close")) {
            if (this.f != null) {
               this.f.a(this.a.h());
            }

            this.f();
            this.f();
         }

      }
   }

   public final void a_(String var1) {
      (new StringBuffer()).append("GOT TEXT ").append(var1).toString();
      if (var1 != null && var1.length() > 0) {
         cb var2;
         (var2 = new cb(super.b_)).a();
         var2.a(var1);
         ((Kalypte)super.b_).k.d();
         (new StringBuffer()).append("GOT TEXT 2 ").append(var1).toString();
         this.g();
         this.w();
      }

   }

   public final void c_() {
   }

   public final void c(String var1) {
   }
}
