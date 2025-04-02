package com.kolipri.kalypte;

final class co extends com.kolipri.kt.g {
   protected com.kolipri.kt.ar a = null;

   public co(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final String b() {
      return "* Change password";
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Update", "Cancel");
   }

   public final void a() {
      com.kolipri.kimp.p var1 = ((Kalypte)super.b_).s();
      this.a = new com.kolipri.kt.ar(super.b_, "edit-profile");
      if (var1 != null) {
         this.a.a("old", "Old password", "Your old password", "", 65536, 30);
         this.a.a("new1", "New password", "Enter your new password", "", 65536, 30);
         this.a.a("new2", "Verification", "Re-type new password", "", 65536, 30);
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
         com.kolipri.kimp.p var2;
         String var3 = (var2 = ((Kalypte)super.b_).s()) == null ? null : var2.a("password");
         String var4 = this.a.a("old");
         String var5 = this.a.a("new1");
         String var6 = this.a.a("new2");
         if (var4 != null && var5 != null && var6 != null && var4.length() >= 1 && var5.length() >= 1 && var6.length() >= 1) {
            if (var5.length() > 0 && com.kolipri.kpr.i.d(var5)) {
               this.c("Password must not contain special symbols");
            } else if (!var5.equals(var6)) {
               this.c("Passwords do not match.");
            } else if (var5.length() < 6) {
               this.c("Password is too short");
            } else if (var3 == null) {
               this.c("No existing password (?)");
            } else {
               if (var4.equals(var3)) {
                  if (((Kalypte)super.b_).i != null) {
                     ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.b(var5));
                     this.f();
                     com.kolipri.kimp.j var8;
                     (var8 = new com.kolipri.kimp.j(this, super.b_, var5) {
                        protected String e;

                        public {
                           this.e = var3;
                           ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
                        }

                        public final void f() {
                           super.f();
                           ((Kalypte)super.b_).j.b(this);
                        }

                        public final void a() {
                           super.a();
                           this.a("Please wait while updating your password..");
                        }

                        public final void a(com.kolipri.kt.x var1) {
                           var1.a("", "Close");
                        }

                        public final void b(String var1) {
                           this.f();
                        }

                        public final void a(com.kolipri.kimp.m var1) {
                           com.kolipri.kimp.q var2;
                           if (var1 instanceof com.kolipri.kimp.d && ((com.kolipri.kimp.d)var1).a != null && (var2 = ((com.kolipri.kimp.d)var1).a).a("iq.amaz-protocol") != null && var2.a("iq.amaz-protocol").equals("registry") && var2.a("iq/action.name") != null && var2.a("iq/action.name").equals("change-password")) {
                              if (var2.a("iq.type") != null && var2.a("iq.type").equals("response")) {
                                 com.kolipri.kimp.p var3;
                                 if ((var3 = ((Kalypte)super.b_).s()) != null) {
                                    var3.b("password", this.e);
                                 }

                                 this.a("Update complete. Your password has been changed.");
                                 return;
                              }

                              this.a("Failed to update your password. Please try again later.");
                           }

                        }
                     }).a();
                     var8.a(super.b_.c());
                  }

                  return;
               }

               this.c("Existing password not correct.");
            }
         } else {
            com.kolipri.kt.a var7;
            (var7 = new com.kolipri.kt.a(super.b_)).a();
            var7.a("Please fill in all input fields.");
            var7.a(super.b_.c());
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
