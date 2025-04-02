package com.kolipri.kalypte;

public final class as extends com.kolipri.kt.l implements com.kolipri.kt.b, com.kolipri.kimp.j {
   protected com.kolipri.kt.r b_ = null;
   protected com.kolipri.kt.aa a = null;
   protected com.kolipri.kt.x b;

   public as(com.kolipri.kt.r var1) {
      super(var1);
      this.b_ = var1;
      ((Kalypte)this.b_).j.a((com.kolipri.kimp.j)this);
   }

   private void d() {
      ((Kalypte)this.b_).j.b(this);
   }

   public final void a() {
      super.a();
      ((Kalypte)this.b_).i.a(com.kolipri.kimp.i.b());
      this.a = new com.kolipri.kt.aa(this.b_);
      this.a.a("* Fetching your last 14 transactions.Please wait..\n");
      this.a.a(this);
      this.a.a();
      this.d(this.a);
   }

   public final void b() {
      this.a(this.b);
      this.y();
      this.w();
   }

   private static com.kolipri.kpr.f a(com.kolipri.kpr.f var0) {
      com.kolipri.kpr.f var1 = new com.kolipri.kpr.f();

      for(int var2 = 0; var0 != null && var2 < var0.b(); ++var2) {
         com.kolipri.kpr.b var3;
         if ((var3 = (com.kolipri.kpr.b)var0.b(var2)) != null) {
            com.kolipri.kpr.b var4;
            (var4 = new com.kolipri.kpr.b()).b("Date/Time", var3.a("strdate") == null ? "" : var3.a("strdate"));
            var4.b("Amount ", var3.a("price") == null ? "" : var3.a("price"));
            var4.b("Item ", var3.a("name") == null ? "" : var3.a("name"));
            var1.a(var4);
         }
      }

      return var1;
   }

   public final void a(com.kolipri.kt.x var1) {
      this.b = var1;
      var1.a(this.a.d() ? "Options" : "Refresh", this.a.d() ? "Scroll >" : "Close");
   }

   public final void b(String var1) {
      if (var1.equals("Scroll >")) {
         this.a.b();
      } else if (var1.equals("Options")) {
         com.kolipri.kt.ae var2;
         (var2 = new com.kolipri.kt.ae(this.b_, "billing-history")).a(1, (com.kolipri.kt.ai)null, "Refresh");
         var2.a(2, (com.kolipri.kt.ai)null, "Close");
         var2.a(this);
         com.kolipri.kt.g var3;
         (var3 = new com.kolipri.kt.g(this.b_)).a((com.kolipri.kt.af)var2);
         var3.a(this.b_.c());
      } else if (var1.equals("Refresh")) {
         this.a((String)null, "  Fetching your last 14 transactions.Please wait..\n");
         ((Kalypte)this.b_).i.a(com.kolipri.kimp.i.b());
      } else {
         if (var1.equals("Close")) {
            this.D();
            this.d();
         }

      }
   }

   public final String E() {
      return "Purchase History";
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("billing-history")) {
         switch(var2) {
         case 1:
            ((Kalypte)this.b_).i.a(com.kolipri.kimp.i.b());
            this.a((String)null, "  Fetching your last 14 transactions.Please wait..\n");
            break;
         case 2:
            this.D();
         }
      }

      return true;
   }

   public final void a(com.kolipri.kimp.m var1) {
      com.kolipri.kimp.q var4 = null;
      if (var1 instanceof com.kolipri.kimp.d) {
         var4 = ((com.kolipri.kimp.d)var1).a;
      }

      if (var4 != null) {
         if (var4.a("iq.amaz-protocol") != null && var4.a("iq.amaz-protocol").equals("subscription") && var4.a("iq/action.name") != null && var4.a("iq/action.name").equals("inquire-history")) {
            if (var4.a("iq.type") != null && var4.a("iq.type").equals("response")) {
               com.kolipri.kpr.f var5 = a(a(var4));
               if (this.a != null) {
                  this.a.a("* Your last " + var5.b() + " transactions\n");
                  this.a.a(var5);
                  this.a.w();
                  this.a(this.b);
                  this.y();
                  this.w();
               }

               return;
            }

            if (var4.a("iq/error") != null && var4.a("iq/error").length() > 0) {
               this.a("Unknown Error\n", var4.a("iq/error") + "\n\n");
               return;
            }

            if (var4.a("iq/error.amaz-error") != null && var4.a("iq/error.amaz-error").equals("no-history")) {
               this.a("No Subscription Made\n", "You have not yet subscribed to any package. You will be charged on a per transaction basis for messages sent.\n\nLogging in, receiving messages, and public chatrooms are free.\n\nYou can save money by subscribing to the unlimited package that suits you.\n");
               return;
            }

            if (var4.a("iq/error.amaz-error") != null && var4.a("iq/error.amaz-error").equals("on-free-trial")) {
               this.a("Beta Trial Period\n", "* This service is currently in a free Beta trial period. There are currently no charges for data or sending messages. Even after the Beta it will always be free to login and to receive messages!\n");
            }
         }

      }
   }

   private void a(String var1, String var2) {
      this.a.c(var1);
      this.a.a(var2);
      this.a.c(false);
      this.a.w();
      com.kolipri.kpr.f var3 = new com.kolipri.kpr.f();
      this.a.a(var3);
      this.a(this.b);
      this.y();
      this.w();
   }

   private static com.kolipri.kpr.f a(com.kolipri.kimp.q var0) {
      com.kolipri.kpr.f var1 = new com.kolipri.kpr.f();
      com.kolipri.kimp.p var2 = null;

      for(int var4 = 0; var4 < var0.b(); ++var4) {
         String var3;
         if ((var3 = var0.a(var4)) != null && var3.length() >= 1) {
            if (var3.equals("iq/vcard")) {
               if (var2 != null && var2.b() > 0) {
                  var1.a(var2);
               }

               var2 = new com.kolipri.kimp.p();
            } else if (var3.startsWith("iq/vcard/") && var2 != null && var3.length() > 9) {
               var2.b(var3.substring(9), var0.b(var4));
            }
         }
      }

      if (var2 != null) {
         var1.a(var2);
      }

      return var1;
   }
}
