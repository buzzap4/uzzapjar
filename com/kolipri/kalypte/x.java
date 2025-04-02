package com.kolipri.kalypte;

public final class x implements dl, cl, com.kolipri.kimp.j {
   protected <undefinedtype> a = null;
   protected com.kolipri.kpr.f b;
   protected com.kolipri.kt.r c;
   public int d;
   public int e;

   public x(com.kolipri.kt.r var1) {
      new com.kolipri.kpr.f();
      this.b = new com.kolipri.kpr.f();
      new com.kolipri.kpr.f();
      this.c = null;
      this.d = 0;
      this.e = 0;
      this.c = var1;
      ((Kalypte)this.c).j.a((com.kolipri.kimp.j)this);
   }

   private static void a(com.kolipri.kt.r var0, String var1) {
      com.kolipri.kimp.p var2;
      (var2 = new com.kolipri.kimp.p()).b("username", var1);
      var2.b("authorized", "yes");
      ((Kalypte)var0).i.a(com.kolipri.kimp.ae.d(var2));
   }

   private static void a(com.kolipri.kt.r var0, String var1, String var2) {
      com.kolipri.kimp.s var3;
      (var3 = new com.kolipri.kimp.s()).e = "im";
      var3.c = var1;
      var3.d = var2 == null ? "" : var2;
      var3.n = true;
      ((Kalypte)var0).i.a(var3);
   }

   public final void a() {
      ((Kalypte)this.c).j.b(this);
   }

   public final void a(com.kolipri.kimp.m var1) {
      com.kolipri.kimp.q var4 = null;
      if (var1 instanceof com.kolipri.kimp.d) {
         var4 = ((com.kolipri.kimp.d)var1).a;
      }

      String var2;
      String var3;
      if (var4 != null && (var2 = var4.a("iq.type")) != null && (var3 = var4.a("iq/action.name")) != null) {
         String var5;
         if (var2.equals("response") && var3.equals("save-contact")) {
            if (this.a != null) {
               var4.a("iq/vcard/username").toString();
               var5 = null;
               this.a.a("* Buddy added\n\nYour new buddy has been added to your buddy list, and an invitation has been sent for your new buddy. You will not be able to see their online status or profile until they have accepted your invitation.");
               this.a.c = "Close";
               this.a.y();
            }
         } else if (!var3.equals("query-profile") || !var2.equals("response") && (!var2.equals("error") || var4.a("iq/error.amaz-error") == null || !var4.a("iq/error.amaz-error").equals("not-authorized"))) {
            if (var3.equals("query-profile") && (var2.equals("response") || var2.equals("error") && var4.a("iq/error.amaz-error") != null && var4.a("iq/error.amaz-error").equals("database-error"))) {
               if (var4.a("iq/vcard/username") != null) {
                  var5 = var4.a("iq/vcard/username").toString();
                  a(this.c, var5);
               }

               ++this.d;
            } else if (var3.equals("query-profile") && var2.equals("error")) {
               var5 = "";
               String var6 = "";
               if (var4.a("iq/vcard/mobile") != null) {
                  var5 = var4.a("iq/vcard/mobile");
               }

               if (var4.a("iq/vcard/displayname") != null) {
                  var6 = var4.a("iq/vcard/displayname");
               }

               com.kolipri.kimp.p var7;
               (var7 = new com.kolipri.kimp.p()).b("custom-displayname", var6);
               var7.b("custom-mobile", var5);
               this.b.a(var7);
               com.kolipri.kimp.s var8;
               (var8 = new com.kolipri.kimp.s()).e = "smsr";
               var8.c = var5;
               var8.p = true;
               var8.d = ((Kalypte)this.c).i.c();
               ((Kalypte)this.c).i.a(var8);
               ++this.d;
            }
         } else {
            if (this.a != null) {
               var5 = var4.a("iq/vcard/username").toString();
               a(this.c, var5);
               a(this.c, var5, (String)null);
            }

            ++this.d;
         }
      }

      this.d();
   }

   private void d() {
      if (this.d == this.e) {
         if (this.a != null) {
            this.a.a("* The number you added is not yet registered");
            this.a.c = "Close";
            this.a.y();
         }

         if (this.a != null) {
            this.a.f();
         }

         if (this.b.b() > 0) {
            ct var1;
            (var1 = new ct(this.c)).d(this.b);
            var1.a(this.c.c());
         }

         this.a();
      }

   }

   public final void c() {
      if (!Kalypte.v()) {
         com.kolipri.kt.a var2;
         (var2 = new com.kolipri.kt.a(this.c)).a();
         var2.a("* Phonebook not supported on this device.");
         var2.a(this.c.c());
      } else {
         cc var1;
         (var1 = new cc(this.c)).a();
         var1.a(this);
      }
   }

   public final void b(com.kolipri.kpr.f var1) {
      new com.kolipri.kpr.f();
      String var4 = ((Kalypte)this.c).s().a("mobile");

      for(int var5 = 0; var1 != null && var5 < var1.b(); ++var5) {
         com.kolipri.kimp.p var6;
         if ((var6 = (com.kolipri.kimp.p)var1.b(var5)) != null && var4 != null && (var6.a("mobile") == null || !var4.equals(var6.a("mobile")) && ((Kalypte)this.c).k.a("mobile", var6.a("mobile")) == null) && var6.c(((Kalypte)this.c).h.a("kalypte.countrycode")) != null) {
            com.kolipri.kimp.p var7 = new com.kolipri.kimp.p();
            String var8 = "";
            if (var6.a("displayname") != null) {
               var8 = var6.a("displayname");
            } else if (var6.a("firstname") != null) {
               var8 = var6.a("firstname");
            } else if (var8.length() > 0 && var6.a("lastname") != null) {
               var8 = var8 + " ";
               var8 = var8 + var6.a("lastname");
            }

            if (var8 != null || !var8.equals("")) {
               var7.b("displayname", var8);
            }

            var7.b("mobile", var6.c(((Kalypte)this.c).h.a("kalypte.countrycode")));
            ((Kalypte)this.c).i.a(com.kolipri.kimp.ae.c((com.kolipri.kpr.b)var7));
            ++this.e;
         }
      }

      if (this.e != 0) {
         this.a = new com.kolipri.kt.a(this, this.c, this) {
            protected x e = null;

            public {
               super.b = "";
               super.c = "Cancel";
               this.e = var3;
            }

            public final void b(String var1) {
               if (var1.equals("OK")) {
                  cc var2;
                  (var2 = new cc(this.t())).a();
                  var2.a(this.e);
                  this.f();
               } else {
                  this.e.a();
                  this.f();
               }
            }
         };
         this.a.a();
         this.a.b = "";
         this.a.a("* Adding buddy\n\nPlease wait while verifying buddy id..");
         this.a.a(this.c.c());
      }

   }

   public final void a(com.kolipri.kpr.f var1) {
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
      com.kolipri.kpr.f var3 = new com.kolipri.kpr.f();
      if (var1 != null || var1.b() != 0) {
         for(int var4 = 0; var4 < var1.b(); ++var4) {
            com.kolipri.kimp.p var5 = (com.kolipri.kimp.p)var1.b(var4);
            com.kolipri.kpr.f var6 = new com.kolipri.kpr.f();
            if (var5 != null) {
               new cb(this.c);
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
            (var8 = new bf(this.c, "mobile")).a(var3);
            var8.G = var2;
            var8.b(true);
            var8.a((cl)this);
            var8.a(this.c.c());
            return;
         }

         if (var2.b() > 0) {
            this.b(var2);
         }
      }

   }

   public final void e_() {
      this.a();
   }
}
