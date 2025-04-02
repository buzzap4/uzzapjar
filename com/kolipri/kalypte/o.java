package com.kolipri.kalypte;

public final class o extends aq {
   private String e = new String("");
   protected bd a = null;

   public o(com.kolipri.kt.r var1, String var2, bd var3) {
      super(var1);
      this.e = var2;
      this.a = var3;
      this.a("* Your Package will be automatically renewed when it expires:");
   }

   public final void a() {
      super.a();
      if (this.e != null && this.e.equals("yes")) {
         super.c.e(0);
      }

   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Save", "Cancel");
   }

   public final void b(String var1) {
      if (var1.equals("Save")) {
         String var2 = super.c.d();
         super.c.a_();
         com.kolipri.kt.a var4;
         if (this.e.equals("yes") && var2 != null && var2.equals("auto-renew")) {
            (var4 = new com.kolipri.kt.a(super.b_)).a();
            var4.a("* Auto-Renew\nYou already have Auto-Renew enabled.");
            var4.a(super.b_.c());
            if (this.a != null) {
               this.a.b();
            }
         } else if (this.e.equals("no") && var2 == null) {
            (var4 = new com.kolipri.kt.a(super.b_)).a();
            var4.a("* Auto-Renew\nAuto-Renew is not active.");
            var4.a(super.b_.c());
            if (this.a != null) {
               this.a.b();
            }
         } else if (var2 != null && var2.equals("auto-renew")) {
            ((Kalypte)super.b_).i.a(com.kolipri.kimp.i.d());
         } else {
            ((Kalypte)super.b_).i.a(com.kolipri.kimp.i.c());
         }
      } else if (this.a != null) {
         this.a.b();
      }

      super.f();
   }
}
