package com.kolipri.kalypte;

public final class ai extends com.kolipri.kt.g {
   protected com.kolipri.kt.ar a = null;
   protected com.kolipri.kt.r b_;
   protected String f;
   protected String g;
   protected String h;
   protected String i = null;
   public String E = null;
   protected <undefinedtype> F = null;
   protected com.kolipri.kt.a G = null;

   public ai(com.kolipri.kt.r var1) {
      super(var1);
      this.b_ = var1;
   }

   public ai(com.kolipri.kt.r var1, String var2) {
      super(var1);
      this.b_ = var1;
      this.g = var2;
   }

   public final void a(com.kolipri.kt.x var1) {
      if (this.f.equals("mobile")) {
         var1.a("OK", "Cancel");
      } else {
         if (this.f.equals("pin")) {
            var1.a("OK", "Exit");
         }

      }
   }

   public final void c(String var1) {
      this.f = var1;
   }

   public final String b() {
      return this.f != null && this.f.equals("mobile") ? "Please check your mobile number:" : "Enter your Pin \n\n or \"Exit\" to check your SMS Inbox";
   }

   public final void a() {
      this.i = ((Kalypte)this.b_).h.a("amazilia.username");
      this.g = ((Kalypte)this.b_).h.a(this.i.toString() + ".amazilia-registered-number");
      this.E = ((Kalypte)this.b_).h.a(this.i.toString() + ".amazilia-registered-number");
      if (this.f != null) {
         this.a = new com.kolipri.kt.ar(this.b_, "validation-options");
         if (this.f.equals("mobile")) {
            this.a.a("mobile", "Your mobile number", "Your mobile number", "Please enter your mobile phone number in full international format including country code (for example +63918_____)", this.g, 3, 13);
         } else if (this.f != null && this.f.equals("pin")) {
            this.h = ((Kalypte)this.b_).m();
            this.a.a("pin", "Enter your Pin", "Enter your Pin", this.h, 0, 6);
         }

         super.a((com.kolipri.kt.af)this.a);
      }

   }

   public final void b(String var1) {
      com.kolipri.kimp.p var2;
      if (var1.equals("OK")) {
         if (this.f != null && this.f.equals("mobile")) {
            this.g = this.a.a("mobile");
            if (this.g == null || this.g.length() == 0) {
               this.g("Missing value for mobile number.");
               return;
            }

            if (this.g.length() < 10) {
               this.g("Mobile is in invalid format.");
               return;
            }

            String var4 = "";
            String var3 = null;
            if (this.E != null) {
               var4 = this.E.substring(this.E.length() - 10, this.E.length());
            }

            if ((var3 = this.g.substring(this.g.length() - 10, this.g.length())) == null || var4 == null || !var4.equals(var3)) {
               this.a("Your pin will be resent to this " + this.g, "resent", "Back", "OK", this.g);
               super.f();
               return;
            }

            this.f();
            this.c("pin");
            this.a();
            this.a(this.b_.c());
         } else if (this.f != null && this.f.equals("pin")) {
            this.h = this.a.a("pin");
            if (this.h != null && this.h.length() != 0) {
               (var2 = new com.kolipri.kimp.p()).b("username", this.i);
               var2.b("mobile", this.g);
               var2.b("pin", this.h.toUpperCase());
               ((Kalypte)this.b_).c(var2);
               ((Kalypte)this.b_).c(var2);
               ((Kalypte)this.b_).a("register", "register");
               super.f();
               this.g = null;
               this.E = null;
               this.i = null;
               this.f = null;
               if (this.F != null) {
                  this.F.f();
               }

               return;
            }

            this.g("Missing value for pin");
            return;
         }
      } else {
         if (var1.equals("Exit")) {
            if (this.g != null && this.i != null) {
               (var2 = new com.kolipri.kimp.p()).b("username", this.i);
               var2.b("mobile", this.g);
               ((Kalypte)this.b_).d(var2);
               ((Kalypte)this.b_).a("register", "register");
            }

            super.f();
            return;
         }

         super.f();
      }

   }

   private void g(String var1) {
      this.G = new com.kolipri.kt.a(this.b_);
      this.G.a();
      this.G.a(var1);
      this.G.a(this.b_.c());
   }

   public final void a(String var1, String var2, String var3, String var4, String var5) {
      this.i = ((Kalypte)this.b_).h.a("amazilia.username");
      if (var5 == null) {
         this.g = ((Kalypte)this.b_).h.a(this.i.toString() + ".amazilia-registered-number");
      } else {
         this.g = var5;
      }

      if (this.F != null) {
         this.F.f();
      }

      this.F = null;
      this.F = new com.kolipri.kt.a(this, this.b_, this, var2) {
         private ai h;
         protected String e;
         protected String f;
         protected com.kolipri.kimp.p g;
         private final ai i;

         public {
            this.i = var1;
            this.h = null;
            this.e = null;
            this.g = null;
            this.h = var3;
            this.e = var4;
            super.c = "OK";
         }

         public final void c(String var1) {
            this.f = var1;
         }

         public final void a() {
            super.a();
         }

         public final void b(String var1) {
            if (!var1.equals("OK")) {
               if (var1.equals("Back")) {
                  this.g("mobile");
               } else {
                  if (this.h != null) {
                     this.h.f();
                  }

                  this.f();
               }
            } else {
               if (this.e != null && this.e.equals("pin")) {
                  this.g("pin");
               } else if (this.e != null && this.e.equals("resent")) {
                  this.g = new com.kolipri.kimp.p();
                  this.g.b("username", ((Kalypte)this.t()).h.a("amazilia.username") == null ? "" : ((Kalypte)this.t()).h.a("amazilia.username"));
                  this.g.b("mobile", this.f);
                  ((Kalypte)this.t()).e(this.g);
                  ((Kalypte)this.t()).a("register", "register");
               } else if (this.e != null) {
                  this.e.equals("inbox");
               }

               this.f();
            }
         }

         private void g(String var1) {
            if (this.h != null) {
               this.h.f();
            }

            this.h = null;
            this.h = new ai(this.t(), this.f == null ? "" : this.f);
            this.h.c(var1);
            this.h.a();
            this.h.a(this.t().c());
         }
      };
      this.F.a();
      this.F.a(var1);
      this.F.c = var3;
      this.F.b = var4;
      if (this.g != null) {
         this.F.c(this.g);
      }

      this.F.a(this.b_.c());
   }
}
