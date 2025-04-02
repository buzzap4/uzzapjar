package com.kolipri.kalypte;

public final class ao extends cf {
   protected com.kolipri.kimp.p a = null;

   public ao(com.kolipri.kt.r var1, com.kolipri.kimp.p var2) {
      super(var1);
      this.a = new com.kolipri.kimp.p(var2);
   }

   public final void a() {
      super.a((com.kolipri.kpr.f)((Kalypte)super.b_).k.c("username"), (String)null);
   }

   public final void b(com.kolipri.kpr.f var1) {
      if (((Kalypte)super.b_).i != null && this.a != null && this.a.a("username") != null) {
         com.kolipri.kimp.s var2;
         (var2 = new com.kolipri.kimp.s()).c = this.a.a("username");
         var2.e = "im";
         var2.m = var1;
         ((Kalypte)super.b_).i.a(var2);
      }

   }
}
