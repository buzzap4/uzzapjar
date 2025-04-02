package com.kolipri.kalypte;

final class dj extends com.kolipri.kt.g {
   protected com.kolipri.kt.ar a = null;

   public dj(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final String b() {
      return "* Update profile";
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Update", "Cancel");
   }

   public final void a() {
      com.kolipri.kimp.p var1 = ((Kalypte)super.b_).s();
      this.a = new com.kolipri.kt.ar(super.b_, "edit-profile");
      if (var1 != null) {
         this.a.a("displayname", "Nickname", "Your nickname", "* Nickname\n\nThis is how other people will see you in the service. If empty, your first and last name are used as defaults.", var1.a("displayname"), 50);
         this.a.a("firstname", "First name", "Your first name", "* Your first name\n\nPlease enter your first name as it will appear on your profile.", var1.a("firstname"), 50);
         this.a.a("lastname", "Last name", "Your last name", "* Your last name\n\nPlease enter your last(family) name as it will appear on your profile.", var1.a("lastname"), 50);
         this.a.a("email", "Email address", "Your email address", "* Your email address\n\nPlease enter your current email address.", var1.a("email"), 50);
      }

      super.a((com.kolipri.kt.af)this.a);
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
      if (var1.equals("Update")) {
         if (((Kalypte)super.b_).i != null) {
            com.kolipri.kpr.b var2;
            (var2 = new com.kolipri.kpr.b()).b("displayname", this.a.a("displayname"));
            var2.b("firstname", this.a.a("firstname"));
            var2.b("lastname", this.a.a("lastname"));
            var2.b("email", this.a.a("email"));
            if (this.a.a("displayname") != null && this.a.a("displayname").length() > 0 && com.kolipri.kpr.i.e(this.a.a("displayname"))) {
               this.c("* Nickname must not contain special symbols");
            } else if (this.a.a("lastname") != null && this.a.a("lastname").length() == 0) {
               this.c("* Lastname is too short.");
            } else if (this.a.a("lastname") != null && this.a.a("lastname").length() > 0 && com.kolipri.kpr.i.e(this.a.a("lastname"))) {
               this.c("* Lastname must not contain special symbols");
            } else if (this.a.a("firstname") != null && this.a.a("firstname").length() == 0) {
               this.c("* Firstname is too short.");
            } else if (this.a.a("firstname") != null && this.a.a("firstname").length() > 0 && com.kolipri.kpr.i.e(this.a.a("firstname"))) {
               this.c("* Firstname must not contain special symbols");
            } else if (this.a.a("email").length() == 0) {
               this.c("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nEmail is too short.");
            } else if (this.a.a("email").length() != 0 && this.a.a("email").length() < 3) {
               this.c("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nEmail address has an invalid Entry");
            } else {
               if (this.a.a("email").length() <= 0 || !com.kolipri.kpr.i.c(this.a.a("email"))) {
                  ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.b(var2));
                  com.kolipri.kimp.j var3;
                  (var3 = new com.kolipri.kimp.j(this, super.b_) {
                     public {
                        ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
                     }

                     public final void f() {
                        super.f();
                        ((Kalypte)super.b_).j.b(this);
                     }

                     public final void a() {
                        super.a();
                        this.a("Please wait while updating your profile..");
                     }

                     public final void a(com.kolipri.kt.x var1) {
                        var1.a("", "Close");
                     }

                     public final void b(String var1) {
                        this.f();
                     }

                     public final void a(com.kolipri.kimp.m var1) {
                        com.kolipri.kimp.q var2;
                        if (var1 instanceof com.kolipri.kimp.d && ((com.kolipri.kimp.d)var1).a != null && (var2 = ((com.kolipri.kimp.d)var1).a).a("iq.amaz-protocol") != null && var2.a("iq.amaz-protocol").equals("registry") && var2.a("iq/action.name") != null && var2.a("iq/action.name").equals("save-profile")) {
                           if (var2.a("iq.type") != null && var2.a("iq.type").equals("response")) {
                              this.a("Update complete. Your profile has been successfully updated.\n");
                              return;
                           }

                           this.a("Failed to update your profile. Please try again later.");
                        }

                     }
                  }).a();
                  var3.a(super.b_.c());
                  this.f();
                  return;
               }

               this.c("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nEmail address has an invalid Entry");
            }
         }
      } else if (var1.equals("Cancel")) {
         this.f();
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
