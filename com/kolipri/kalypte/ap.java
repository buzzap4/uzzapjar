package com.kolipri.kalypte;

public final class ap extends com.kolipri.kt.a {
   protected String e;
   protected com.kolipri.kpr.f f = null;

   public ap(com.kolipri.kt.r var1, com.kolipri.kpr.f var2, String var3) {
      super(var1);
      this.f = var2;
      this.e = var3;
   }

   public final void a() {
      super.a();
      String var1 = "";

      for(int var2 = 0; this.f != null && var2 < this.f.b(); ++var2) {
         com.kolipri.kimp.p var3;
         if ((var3 = (com.kolipri.kimp.p)this.f.b(var2)) != null && (var3.a("phone") != null || var3.a("mobile") != null)) {
            if (var3.a("mobile") != null && !var3.a("mobile").equals("")) {
               var1 = var1 + var3.d() + "\n" + var3.a("mobile") + "\n\n";
            } else {
               var1 = var1 + var3.d() + "\n" + var3.c(((Kalypte)super.b_).h.a("kalypte.countrycode")) + "\n\n";
            }
         }
      }

      this.a("* Confirm invitation\n\nClick OK to send your invitation using the details outlined below.\n\n* Your name\n" + this.e + "\n\n" + "* Contacts to invite \n" + var1);
      this.b(true);
      this.b(2);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("OK", "Cancel");
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("OK") && ((Kalypte)super.b_).i != null) {
         for(int var2 = 0; this.f != null && var2 < this.f.b(); ++var2) {
            com.kolipri.kimp.p var3;
            if ((var3 = (com.kolipri.kimp.p)this.f.b(var2)) != null && (var3.a("phone") != null || var3.a("mobile") != null)) {
               String var4;
               if (var3.a("mobile") != null && !var3.a("mobile").equals("")) {
                  var4 = var3.a("mobile");
               } else {
                  var4 = var3.c(((Kalypte)super.b_).h.a("kalypte.countrycode"));
               }

               com.kolipri.kimp.s var5;
               (var5 = new com.kolipri.kimp.s()).e = "smsr";
               var5.c = var4;
               var5.p = true;
               var5.d = this.e;
               ((Kalypte)super.b_).i.a(var5);
            }
         }

         com.kolipri.kt.a var6;
         if (this.f != null && this.f.b() > 0) {
            (var6 = new com.kolipri.kt.a(super.b_)).a();
            var6.a("Thank you. Your friend will receive an SMS shortly. Invite more friends today!");
            var6.a(super.b_.c());
         } else {
            (var6 = new com.kolipri.kt.a(super.b_)).a();
            var6.a("No contact was selected. Invitation was Cancelled.");
            var6.a(super.b_.c());
         }
      }

      this.f();
   }
}
