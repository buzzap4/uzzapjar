package com.kolipri.kalypte;

public final class br implements dl, com.kolipri.kt.o, cl, com.kolipri.kt.b {
   protected com.kolipri.kt.r a = null;
   protected com.kolipri.kpr.f b = null;
   protected com.kolipri.kpr.f c = new com.kolipri.kpr.f();
   protected String d = null;

   public br(com.kolipri.kt.r var1) {
      this.a = var1;
   }

   public final void c() {
      com.kolipri.kt.ae var1;
      (var1 = new com.kolipri.kt.ae(this.a, "invite-friends")).a(1, (com.kolipri.kt.ai)null, "Add Manually");
      var1.a(2, (com.kolipri.kt.ai)null, "Add from Phonebook");
      var1.a(this);
      var1.a(this);
      com.kolipri.kt.g var2;
      (var2 = new com.kolipri.kt.g(this.a)).a((com.kolipri.kt.af)var1);
      var2.a(this.a.c());
   }

   public final void b(com.kolipri.kpr.f var1) {
      this.c = var1;
      if (this.c != null) {
         com.kolipri.kt.ad var2;
         (var2 = new com.kolipri.kt.ad(this.a)).a();
         var2.a((com.kolipri.kt.o)this);
         var2.b("Your name");
         var2.b();
      }

   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("invite-friends")) {
         switch(var2) {
         case 1:
            this.d = "manual";
            com.kolipri.kt.ad var5;
            (var5 = new com.kolipri.kt.ad(this.a)).a();
            var5.a((com.kolipri.kt.o)this);
            var5.b(50);
            var5.a(3);
            var5.b("Enter the mobile number");
            var5.b();
            break;
         case 2:
            if (!Kalypte.v()) {
               com.kolipri.kt.a var3;
               (var3 = new com.kolipri.kt.a(this.a)).a();
               var3.a("* Phonebook not supported.");
               var3.a(this.a.c());
            } else {
               cc var4;
               (var4 = new cc(this.a)).a();
               var4.a(this);
            }
         }
      }

      return true;
   }

   public final void e_() {
   }

   public final void a(com.kolipri.kpr.f var1) {
      this.b = var1;
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
      com.kolipri.kpr.f var3 = new com.kolipri.kpr.f();
      if (this.b != null || this.b.b() != 0) {
         for(int var4 = 0; var4 < this.b.b(); ++var4) {
            com.kolipri.kimp.p var5 = (com.kolipri.kimp.p)this.b.b(var4);
            com.kolipri.kpr.f var6 = new com.kolipri.kpr.f();
            if (var5 != null) {
               new cb(this.a);
               if (var5.a("phone") != null) {
                  var6 = cb.c(var5.a("phone").toString());
               }

               if (var6.b() > 1) {
                  var3.a(var5);
               } else {
                  var2.a(var5);
               }
            }
         }

         if (var3.b() > 0) {
            bf var8;
            (var8 = new bf(this.a, "mobile")).a(var3);
            var8.G = var2;
            var8.b(true);
            var8.a((cl)this);
            var8.a(this.a.c());
            return;
         }

         if (var2.b() > 0) {
            this.b(var2);
         }
      }

   }

   public final void a_(String var1) {
      (new StringBuffer()).append("GOT TEXT ").append(var1).toString();
      if (var1 != null && !var1.equals("")) {
         if (this.d != null) {
            com.kolipri.kimp.p var5;
            (var5 = new com.kolipri.kimp.p()).b("custom-mobile", var1);
            this.c.a(var5);
            if (this.c != null && this.c.b() > 0) {
               ct var3;
               (var3 = new ct(this.a)).g("invite");
               var3.d(this.c);
               var3.a(this.a.c());
            }

            return;
         }

         if (this.c != null && this.c.b() > 0) {
            ap var4;
            (var4 = new ap(this.a, this.c, var1)).a();
            var4.b(true);
            var4.b(2);
            var4.a(this.a.c());
            return;
         }
      } else {
         if (this.d == null) {
            this.a("No contact was selected.");
         }

         com.kolipri.kt.a var2;
         (var2 = new com.kolipri.kt.a(this.a)).a();
         var2.a("No value entered! Please try again.");
         var2.a(this.a.c());
      }

   }

   public final void c_() {
   }

   public final void c(String var1) {
   }

   private void a(String var1) {
      com.kolipri.kt.a var2;
      (var2 = new com.kolipri.kt.a(this.a)).a();
      var2.a(var1);
      var2.a(this.a.c());
   }
}
