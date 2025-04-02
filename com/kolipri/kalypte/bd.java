package com.kolipri.kalypte;

public final class bd extends com.kolipri.kt.l implements com.kolipri.kt.b, com.kolipri.kimp.j {
   protected com.kolipri.kt.q a = null;
   protected com.kolipri.kt.r b_ = null;
   protected com.kolipri.kt.a b = null;
   protected com.kolipri.kpr.f c = null;
   protected aq e = null;

   public bd(com.kolipri.kt.r var1) {
      super(var1);
      this.b_ = var1;
      ((Kalypte)this.b_).j.b(this);
      ((Kalypte)this.b_).j.a((com.kolipri.kimp.j)this);
   }

   public final void a() {
      com.kolipri.kt.ab var1;
      (var1 = new com.kolipri.kt.ab(this.b_)).a();
      var1.b(0);
      var1.b(true);
      var1.c("* Select subscription option:");
      var1.b();
      this.d(var1);
      com.kolipri.kt.ae var2;
      (var2 = new com.kolipri.kt.ae(this.b_, "billing-options")).a(1, (com.kolipri.kt.ai)null, "Current Billing Status");
      var2.a(2, (com.kolipri.kt.ai)null, "Purchase a Package");
      var2.a(3, (com.kolipri.kt.ai)null, "Auto-Renew");
      var2.a(4, (com.kolipri.kt.ai)null, "View Purchase History");
      var2.a(this);
      this.a = new com.kolipri.kt.v(this.b_, var2);
      ((com.kolipri.kt.v)this.a).a();
      ((com.kolipri.kt.v)this.a).a((com.kolipri.kt.af)var2);
      this.d((com.kolipri.kt.v)this.a);
   }

   public final String E() {
      return "Subscription Menu";
   }

   public final void b(String var1) {
      if (var1.equals("Cancel")) {
         this.D();
         if (this.b != null) {
            this.b.f();
         }

         this.b = null;
         this.f();
         ((Kalypte)this.b_).j.b(this);
      } else {
         if (var1.equals("Select") && this.a != null && this.a.b()) {
            this.w();
         }

      }
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Select", "Cancel");
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("billing-options")) {
         switch(var2) {
         case 1:
            ((Kalypte)this.b_).i.a(com.kolipri.kimp.i.a(true));
            this.a("Your request is being processed. Please wait...");
            break;
         case 2:
            ((Kalypte)this.b_).i.a(com.kolipri.kimp.i.a());
            this.a("Your request is being processed. Please wait...");
            break;
         case 3:
            this.a("Your request is being processed. Please wait...");
            ((Kalypte)this.b_).i.a(com.kolipri.kimp.i.a(false));
            break;
         case 4:
            cw var3;
            if ((var3 = ((Kalypte)this.b_).n()) != null && var3.b() != null) {
               var3.b().N();
               var3.g();
            }
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
         if (var4.a("iq.type") != null) {
            if (var4.a("iq/action.name") == null) {
               return;
            }

            if (var4.a("iq.amaz-protocol") != null && var4.a("iq.amaz-protocol").equals("subscription") && var4.a("iq.type") != null && var4.a("iq.type").equals("response") && var4.a("iq/action.name") != null && var4.a("iq/action.name").equals("list")) {
               this.c = a(var4);
               if (this.e != null) {
                  this.e.f();
               }

               this.e = null;
               this.e = new aq(this.b_);
               this.e.b("Proceed", "Cancel");

               for(int var5 = 0; var5 < this.c.b(); ++var5) {
                  com.kolipri.kpr.b var6;
                  if ((var6 = (com.kolipri.kpr.b)this.c.b(var5)) != null) {
                     this.e.a(var6.a("name").toString(), var6.a("name"));
                  }
               }

               this.e.a("", "Auto-Renew", 10);
               this.e.a("* Select the option that best suits you:");
               this.e.a();
               this.e.a(this);
               this.e.a(this.b_.c());
               return;
            }

            if (var4.a("iq.amaz-protocol") != null && var4.a("iq.amaz-protocol").equals("subscription")) {
               this.b(var4);
            }
         }

      }
   }

   private static com.kolipri.kpr.f a(com.kolipri.kimp.q var0) {
      com.kolipri.kpr.f var1 = new com.kolipri.kpr.f();
      com.kolipri.kpr.b var2 = null;

      for(int var4 = 0; var4 <= var0.b() + 1; ++var4) {
         String var3;
         if ((var3 = var0.a(var4)) != null && var3.length() >= 1) {
            if (var3.equals("iq/package")) {
               if (var2 != null && var2.b() > 0) {
                  var1.a(var2);
               }

               var2 = new com.kolipri.kpr.b();
            } else if (var3.startsWith("iq/package/") && var2 != null && var3.length() > 11) {
               var2.b(var3.substring(11), var0.b(var4));
            }
         }
      }

      if (var2 != null) {
         var1.a(var2);
      }

      return var1;
   }

   private void b(com.kolipri.kimp.q var1) {
      String var2 = var1.a("iq.type");
      String var3 = var1.a("iq/action.name");
      String var4 = var1.a("iq/error.amaz-error");
      if (var2 != null && var2.equals("response")) {
         if (var3 != null && var3.equals("subscribe")) {
            if (this.b != null) {
               this.b.f();
            }

            this.b = null;
            return;
         }

         String var5;
         if (var3 != null && var3.equals("inquire-status")) {
            var5 = var1.a("iq/vcard/auto_renew") == null ? "" : var1.a("iq/vcard/auto_renew");
            if (var1.a("iq.id") == null || !var1.a("iq.id").equals("auto-renew")) {
               String var7 = var1.a("iq/vcard/strdate") == null ? "" : var1.a("iq/vcard/strdate");
               this.a("* Billing Status\n\nYou are currently subscribed to " + (var1.a("iq/vcard/name") != null ? var1.a("iq/vcard/name") : "") + " package. Package expires on " + var7 + ".\n\nAuto-Renew is " + (var5.equals("yes") ? "selected." : "not selected."));
               return;
            }

            o var6;
            (var6 = new o(this.b_, var5, this)).a("* Your Package will be automatically renewed when it expires:");
            var6.a("auto-renew", "Auto-Renew");
            var6.a();
            var6.a(this.b_.c());
         } else {
            if (var3 != null && var3.equals("inquire-history")) {
               if (this.b != null) {
                  this.b.f();
               }

               this.b = null;
               return;
            }

            if (var3 != null && var3.equals("cancel-auto-renew")) {
               var5 = var1.a("iq/vcard/strdate") == null ? "" : var1.a("iq/vcard/strdate");
               this.a("* Auto-Renew cancelled\n\nAuto-Renew is now cancelled. You will revert to transactional billing when your current package expires on " + var5 + ".");
               return;
            }

            if (var3 != null && var3.equals("set-auto-renew")) {
               var5 = var1.a("iq/vcard/strdate") == null ? "" : var1.a("iq/vcard/strdate");
               this.a("* Auto-Renew Set\n\nAuto-Renew is now set. Your package will be renewed automatically when it expires on " + var5 + ".");
               return;
            }
         }
      } else {
         if (var4 != null && var2 != null && var2.equals("error")) {
            if (this.b != null) {
               this.b.f();
            }

            this.b = null;
            return;
         }

         if (this.b != null) {
            this.b.f();
         }

         this.b = null;
      }

   }

   private void a(String var1) {
      if (this.b == null) {
         this.b = new com.kolipri.kt.a(this, this.b_, this) {
            protected bd e = null;

            public {
               super.b = "";
               super.c = "Close";
               this.e = var3;
            }

            public final void b(String var1) {
               this.e.b = null;
               this.f();
            }
         };
         this.b.a();
         this.b.a(var1);
         this.b.a(this.b_.c());
      } else {
         this.b.a(var1);
         this.b.c = "Close";
         this.b.y();
      }
   }

   public final void b() {
      if (this.b != null) {
         this.b.f();
      }

      this.b = null;
   }

   public final void a(String var1, boolean var2) {
      if (var1 != null && var1.length() != 0) {
         String var6 = var2 ? "yes" : "no";
         this.a("Your request is being processed. Please wait...");
         ((Kalypte)this.b_).i.a(com.kolipri.kimp.i.a(var1, var6, "no"));
      } else {
         if (this.e != null) {
            this.e.f();
         }

         this.e = new aq(this.b_);
         this.e.b("Proceed", "Cancel");

         for(int var4 = 0; this.c != null && var4 < this.c.b(); ++var4) {
            com.kolipri.kpr.b var5;
            if ((var5 = (com.kolipri.kpr.b)this.c.b(var4)) != null) {
               this.e.a(var5.a("name").toString(), var5.a("name"));
            }
         }

         this.e.a("", "Auto-Renew", 10);
         this.e.a("* Select the option that best suits you:");
         this.e.a();
         this.e.a(this);
         this.e.a(this.b_.c());
         com.kolipri.kt.a var7;
         (var7 = new com.kolipri.kt.a(this.b_)).a();
         var7.a("Please select a package");
         var7.a(this.b_.c());
         this.b();
      }
   }

   public final void d() {
      this.b();
   }
}
