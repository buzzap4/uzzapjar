package com.kolipri.kalypte;

public final class r extends com.kolipri.kt.g implements com.kolipri.kimp.j {
   protected com.kolipri.kt.ar a = null;
   protected com.kolipri.kimp.p f = null;
   public String g = "";
   protected com.kolipri.kt.a h = null;
   protected da i = null;

   public r(com.kolipri.kt.r var1, com.kolipri.kimp.p var2) {
      super(var1);
      this.f = var2;
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
   }

   private void e() {
      ((Kalypte)super.b_).j.b(this);
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

            if (var2.equals("response") && var3.equals("save-contact") && this.h != null) {
               this.h.a("Buddy updated / added..");
               this.e();
               this.f();
            }
         }

      }
   }

   public final String b() {
      return this.f == null ? "* Add Other Contact" : "* Edit Other Contact" + this.g;
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
         if (this.f == null) {
            this.f = new com.kolipri.kimp.p();
         }

         if (this.a != null && this.f != null) {
            this.f.b("custom-displayname", this.a.a("custom-displayname"));
            this.f.b("custom-email", this.a.a("custom-email"));
            this.f.b("custom-mobile", this.a.a("custom-mobile"));
            if (this.a.a("custom-displayname") != null && this.a.a("custom-displayname").length() > 0 && com.kolipri.kpr.i.e(this.a.a("custom-displayname"))) {
               this.c("* Nickname must not contain special symbols");
               return;
            }

            if (this.a.a("custom-mobile") != null && !this.a.a("custom-mobile").equals("")) {
               if (this.a.a("custom-email").length() != 0 && this.a.a("custom-email").length() < 3) {
                  this.c("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nEmail address has an invalid Entry");
                  return;
               }

               if (this.a.a("custom-email").length() > 0 && com.kolipri.kpr.i.c(this.a.a("custom-email"))) {
                  this.c("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nEmail address has an invalid Entry");
                  return;
               }

               if (this.i != null) {
                  this.f();
                  return;
               }

               ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(this.f));
               this.h = new com.kolipri.kt.a(this, super.b_, this) {
                  public {
                     super.b = "";
                     super.c = "Close";
                  }

                  public final void b(String var1) {
                     this.f();
                  }
               };
               this.h.a();
               this.h.a("Please wait..");
               this.h.a(super.b_.c());
               return;
            }

            this.c("* Mobile number is required. Please fill in.");
            return;
         }
      } else if (var1.equals("Cancel")) {
         this.f();
         this.e();
      }

   }

   public final void a() {
      this.a = new com.kolipri.kt.ar(super.b_, "edit-sms-buddy-options");
      String var1 = null;
      if (this.f != null) {
         var1 = this.f.a("custom-displayname");
      }

      if (var1 == null) {
         var1 = "";
      }

      this.a.a("custom-displayname", "Nickname", "Nickname", "* Nickname\n\nThis is the name that you will see in your buddy list for this contact.", var1, 50);
      if (this.f != null) {
         var1 = this.f.a("custom-mobile");
      }

      if (var1 == null) {
         var1 = "";
      }

      this.a.a("custom-mobile", "Mobile number", "Mobile number", "* Mobile number\n\nThis is the mobile number where SMS messages for this contact will be sent.", var1, 3, 13);
      if (this.f != null) {
         var1 = this.f.a("custom-email");
      }

      if (var1 == null) {
         var1 = "";
      }

      this.a.a("custom-email", "Email Address", "Email Address", "* Custom email\n\nThis is the email address where email messages for this contact will be sent", var1, 50);
      super.a((com.kolipri.kt.af)this.a);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("OK", "Cancel");
   }

   private void c(String var1) {
      com.kolipri.kt.a var2;
      (var2 = new com.kolipri.kt.a(super.b_)).a();
      var2.a(var1);
      var2.a(super.b_.c());
   }
}
