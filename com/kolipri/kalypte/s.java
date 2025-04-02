package com.kolipri.kalypte;

public final class s extends com.kolipri.kt.g {
   protected com.kolipri.kimp.p a = null;
   protected com.kolipri.kt.ar f = null;

   private s(com.kolipri.kt.r var1, com.kolipri.kimp.p var2) {
      super(var1);
      this.a = var2;
   }

   public final String b() {
      return "* Edit Buddy";
   }

   public final boolean a(com.kolipri.kt.al var1) {
      boolean var2 = false;
      if (var1.b == 5 || var1.b < 1 || var1.b > 7) {
         if (super.b != null && super.b.b()) {
            this.f();
         }

         var2 = true;
      }

      if (!var2) {
         var2 = super.a(var1);
      }

      return var2;
   }

   public final void b(String var1) {
      if (var1.equals("OK")) {
         if (this.a == null) {
            this.a = new com.kolipri.kimp.p();
         }

         if (this.f != null && this.a != null) {
            this.a.b("custom-displayname", this.f.a("custom-displayname"));
            this.a.b("custom-email", this.f.a("custom-email"));
            if (this.f.a("custom-displayname") != null && this.f.a("custom-displayname").length() > 0 && com.kolipri.kpr.i.e(this.f.a("custom-displayname"))) {
               this.c("* Nickname must not contain special symbols");
               return;
            }

            if (this.f.a("custom-email").length() != 0 && this.f.a("custom-email").length() < 3) {
               this.c("* Email address has an invalid Entry");
               return;
            }

            if (this.f.a("custom-email").length() > 0 && com.kolipri.kpr.i.c(this.f.a("custom-email"))) {
               this.c("* Email address has an invalid Entry");
               return;
            }

            ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(this.a));
            this.f();
            return;
         }
      } else if (var1.equals("Cancel")) {
         this.f();
      }

   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("OK", "Cancel");
   }

   public final void a() {
      this.f = new com.kolipri.kt.ar(super.b_, "edit-sms-buddy-options");
      String var1 = null;
      if (this.a != null) {
         var1 = this.a.a("custom-displayname");
      }

      if (var1 == null) {
         var1 = "";
      }

      this.f.a("custom-displayname", "Nickname", "Nickname", (String)null, var1, 50);
      if (this.a != null) {
         var1 = this.a.a("custom-email");
      }

      if (var1 == null) {
         var1 = "";
      }

      this.f.a("custom-email", "Email address", "Email", (String)null, var1, 50);
      super.a((com.kolipri.kt.af)this.f);
   }

   public static void a(com.kolipri.kt.r var0, com.kolipri.kimp.p var1) {
      if (var1 != null && var1.a("type") != null && var1.a("type").equals("amazilia")) {
         com.kolipri.kimp.p var2;
         (var2 = new com.kolipri.kimp.p()).a((com.kolipri.kpr.b)var1);
         if (var2.a("username") != null) {
            s var4;
            (var4 = new s(var0, var2)).a();
            var4.a(var0.c());
            return;
         }

         r var3;
         (var3 = new r(var0, var2)).a();
         var3.a(var0.c());
      }

   }

   private void c(String var1) {
      com.kolipri.kt.a var2;
      (var2 = new com.kolipri.kt.a(super.b_)).a();
      var2.a(var1);
      var2.b(true);
      var2.a(super.b_.c());
   }
}
