package com.kolipri.kalypte;

public final class cs implements com.kolipri.kimp.j, com.kolipri.kt.o {
   protected com.kolipri.kt.r a = null;
   protected com.kolipri.kt.a b = null;
   protected String c = "";
   protected String d = "";
   protected String e = null;

   public cs(com.kolipri.kt.r var1, String var2) {
      this.a = var1;
      this.e = var2;
      ((Kalypte)this.a).j.a((com.kolipri.kimp.j)this);
   }

   public final void b() {
      ((Kalypte)this.a).j.b(this);
   }

   private static void a(com.kolipri.kt.r var0, String var1) {
      com.kolipri.kimp.p var2;
      (var2 = new com.kolipri.kimp.p()).b("username", var1);
      var2.b("authorized", "yes");
      ((Kalypte)var0).i.a(com.kolipri.kimp.ae.d(var2));
   }

   public static void a(com.kolipri.kt.r var0, String var1, String var2) {
      com.kolipri.kimp.s var3;
      (var3 = new com.kolipri.kimp.s()).e = "im";
      var3.c = var1;
      var3.d = var2 == null ? "" : var2;
      var3.n = true;
      ((Kalypte)var0).i.a(var3);
   }

   public final void a(com.kolipri.kimp.m var1) {
      com.kolipri.kimp.q var4 = null;
      if (var1 instanceof com.kolipri.kimp.d) {
         var4 = ((com.kolipri.kimp.d)var1).a;
      }

      if (var4 != null) {
         String var2;
         if ((var2 = var4.a("iq.type")) != null) {
            String var3;
            if ((var3 = var4.a("iq/action.name")) == null) {
               return;
            }

            String var8;
            if (var2.equals("response") && var3.equals("save-contact")) {
               if (this.b != null) {
                  var8 = var4.a("iq/vcard/username").toString();
                  if (this.b != null) {
                     this.b.a("* Buddy added\n\nYour new buddy has been added to your buddy list, and an invitation has been sent for your new buddy. You will not be able to see their online status or profile until they have accepted your invitation.");
                     this.b.c = "Close";
                     this.b.y();
                     a(this.a, var8, (String)null);
                  }
               }

               this.b();
               return;
            }

            com.kolipri.kimp.s var5;
            if (var2.equals("error") && var3.equals("save-contact")) {
               if (this.b != null) {
                  var4.a("iq/vcard/username").toString();
                  var5 = null;
                  this.b.a("* Duplicate entry\n\nThe buddy you tried to add is already on your buddy list.");
                  this.b.c = "Close";
                  this.b.y();
               }

               this.b();
               return;
            }

            if (var3.equals("query-profile") && (var2.equals("response") || var2.equals("error") && var4.a("iq/error.amaz-error") != null && var4.a("iq/error.amaz-error").equals("not-authorized"))) {
               if (this.b != null) {
                  this.b.a("* Adding buddy\n\nPlease wait while your buddy database is being updated..");
               }

               var8 = var4.a("iq/vcard/username").toString();
               a(this.a, var8);
               return;
            }

            if (var3.equals("query-profile") && var2.equals("error")) {
               if (this.e.equals("mobile")) {
                  this.c = var4.a("iq/vcard/mobile").toString();
               } else {
                  this.c = var4.a("iq/vcard/username").toString();
               }

               if (this.e.equals("username")) {
                  if (this.b != null) {
                     this.b.a("* No such " + this.c + ".\n\nThe username you wanted to add has not yet been registered.");
                     this.b.c = "Close";
                     this.b.y();
                  }
               } else {
                  this.b();
                  if (this.b != null) {
                     this.b.f();
                  }

                  (var5 = new com.kolipri.kimp.s()).e = "smsr";
                  var5.c = this.c;
                  var5.p = true;
                  var5.d = ((Kalypte)this.a).i.c();
                  ((Kalypte)this.a).i.a(var5);
                  com.kolipri.kimp.p var6;
                  (var6 = new com.kolipri.kimp.p()).b("custom-mobile", this.c);
                  r var7;
                  (var7 = new r(this.a, var6)).g = "\n\nYour contact is not yet a member, would you like to add them as an Other Contact?";
                  var7.a();
                  var7.a(this.a.c());
               }

               this.b();
            }
         }

      }
   }

   public final void a_(String var1) {
      (new StringBuffer()).append("GOT '").append(var1).append("'").toString();
      String var3 = ((Kalypte)this.a).s().a("mobile");
      com.kolipri.kt.a var4;
      if (var1 != null && !var1.equals("")) {
         if (var1.equals(((Kalypte)this.a).i.c())) {
            (var4 = new com.kolipri.kt.a(this.a)).a();
            var4.a("* Own username\n\nYou can not add yourself as a buddy.");
            var4.a(this.a.c());
            this.b();
         } else if (var3.equals(var1)) {
            (var4 = new com.kolipri.kt.a(this.a)).a();
            var4.a("* Own username\n\nYou can not add yourself as a buddy.");
            var4.a(this.a.c());
            this.b();
         } else if (((Kalypte)this.a).k.a(this.e, var1) != null) {
            (var4 = new com.kolipri.kt.a(this.a)).a();
            var4.a("* Duplicate entry\n\nThe buddy you tried to add is already on your buddy list.");
            var4.a(this.a.c());
            this.b();
         } else {
            com.kolipri.kimp.p var5;
            (var5 = new com.kolipri.kimp.p()).b(this.e, var1);
            this.c = var1;
            ((Kalypte)this.a).i.a(com.kolipri.kimp.ae.c((com.kolipri.kpr.b)var5));
            this.b = new com.kolipri.kt.a(this, this.a, this) {
               protected cs e = null;

               public {
                  super.b = "";
                  super.c = "Close";
                  this.e = var3;
               }

               public final void b(String var1) {
                  if (var1.equals("OK")) {
                     com.kolipri.kimp.p var2;
                     (var2 = new com.kolipri.kimp.p()).b("custom-mobile", this.e.d);
                     ((Kalypte)this.t()).i.a(com.kolipri.kimp.ae.d(var2));
                     this.e.b();
                  }

                  this.f();
               }
            };
            this.b.a();
            this.b.a("* Adding buddy\n\nPlease wait while verifying buddy id..");
            this.b.a(this.a.c());
         }
      } else {
         (var4 = new com.kolipri.kt.a(this.a)).a();
         var4.a("No value entered! Please try again.");
         var4.a(this.a.c());
      }
   }

   public final void c_() {
      this.b();
   }

   public final void c(String var1) {
   }

   public final void c() {
      com.kolipri.kt.ad var1;
      (var1 = new com.kolipri.kt.ad(this.a)).a();
      var1.b(50);
      if (this.e.equals("username")) {
         var1.b("Enter buddy ID");
      } else if (this.e.equals("mobile")) {
         var1.a(3);
         var1.b("Enter buddy mobile number");
      }

      var1.a((com.kolipri.kt.o)this);
      var1.b();
   }
}
