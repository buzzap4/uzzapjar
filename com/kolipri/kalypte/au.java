package com.kolipri.kalypte;

public final class au extends com.kolipri.kt.g {
   protected com.kolipri.kt.ar a = null;
   protected static String f = "";
   protected static String g = "";
   protected static String h = "";
   protected static String i = "";
   protected static String E = "";
   protected static String F = "";
   protected static String G = "";
   protected static String H = "";
   protected static String I = null;
   protected static String J = "";
   protected com.kolipri.kt.r b_ = null;

   public au(com.kolipri.kt.r var1, String var2) {
      super(var1);
      this.b_ = var1;
      I = var2;
      J = "";
   }

   public static void a(String var0, String var1) {
      g = var0;
      f = var1;
   }

   public static void e() {
      f = "";
      g = "";
      h = "";
      i = "";
      E = "";
      F = "";
      G = "";
   }

   public final String b() {
      if (I.equals("register")) {
         return "* Register account";
      } else if (I.equals("username")) {
         return J;
      } else {
         return J.equals("") ? "Connection successful!\n\nNow please enter your mobile number in full international format including the country code (for example \"+63920_______\")" : J;
      }
   }

   public static void c(String var0) {
      J = var0;
   }

   public final void a(com.kolipri.kt.x var1) {
      if (I.equals("register")) {
         var1.a("Register", "Cancel");
      } else {
         var1.a("OK", "Cancel");
      }
   }

   public final void a() {
      this.a = new com.kolipri.kt.ar(this.b_, "login-options");
      if (I.equals("register")) {
         this.a.a("firstname", "First Name", "Your first name", "Please enter your first name as it will appear on your profile.", h, 60);
         this.a.a("lastname", "Last Name", "Your last name", "Please enter your last (family) name as it will appear on your profile.", i, 60);
         this.a.a("email", "Email Address", "Your email address", "Please enter your current email address. This will be used to send your password should you forget it.", E);
         this.a.a("password", "Password", "Choose your password", "Please enter your desired password. Password should be at least 6 characters in length.", F, 65536, 30);
         this.a.a("password2", "Re-enter password", "Password verification", "Please re-enter your desired password for verification", G, 65536, 30);
         this.a.a("credit", "Credit", "Credit", "Optional.  Enter the Userid of a person who helped you register.", H, 12);
      } else if (I.equals("username")) {
         this.a.a("username", "Enter your UserID", "Your userID", "This is the number or name people will use to contact and message you using Uzzap service.Your User ID must be between 6 to 12 characters, and can only consist of numbers and letters.", f, 12);
      } else if (I.equals("pre-register")) {
         this.a.a("mobile", "Mobile Number", "Your mobile number", "Please enter your mobile phone number in full international format including country code (for example +63918_____)", g, 3, 15);
      }

      super.a((com.kolipri.kt.af)this.a);
   }

   private static String h(String var0) {
      StringBuffer var1 = new StringBuffer();
      if (var0 != null) {
         for(int var2 = 0; var2 < var0.length(); ++var2) {
            char var3;
            if (Character.isLowerCase(var3 = var0.charAt(var2)) || Character.isUpperCase(var3) || Character.isDigit(var3)) {
               var1.append(var3);
            }
         }
      }

      return var1.toString().toLowerCase();
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
      if (var1.equals("Register")) {
         f = h(f);
         com.kolipri.kimp.p var2;
         (var2 = new com.kolipri.kimp.p()).b("username", f);
         var2.b("mobile", g);
         var2.b("firstname", this.a.a("firstname"));
         var2.b("lastname", this.a.a("lastname"));
         var2.b("email", this.a.a("email"));
         var2.b("password", this.a.a("password"));
         var2.b("credit", this.a.a("credit"));
         g = var2.a("mobile");
         h = var2.a("firstname");
         i = var2.a("lastname");
         E = var2.a("email");
         F = var2.a("password");
         G = this.a.a("password2");
         if (h != null && h.length() != 0) {
            if (h.length() != 0 && com.kolipri.kpr.i.e(h)) {
               this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nYour firstname must not contain special symbols.");
            } else if (i != null && i.length() != 0) {
               if (i.length() != 0 && com.kolipri.kpr.i.e(i)) {
                  this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nYour lastname must not contain special symbols.");
               } else if (E != null && E.length() != 0) {
                  if (E.length() >= 3 && !com.kolipri.kpr.i.c(E)) {
                     if (F.length() != 0 && com.kolipri.kpr.i.d(F)) {
                        this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nYour password must not contain special symbols.");
                     } else if (F != null && F.length() >= 6) {
                        if (G != null && G.length() != 0) {
                           if (F.equals(G)) {
                              String var3 = ((Kalypte)this.b_).m() == null ? "" : ((Kalypte)this.b_).m();
                              var2.b("pin", var3);
                              if (((Kalypte)this.b_).i != null) {
                                 ((Kalypte)this.b_).i.a(com.kolipri.kimp.ae.e(var2));
                              }

                              ((Kalypte)this.b_).a(var2);
                              ((Kalypte)this.b_).h.b(f + ".amazilia-registered-number", g);
                              ((Kalypte)this.b_).h.c();
                              this.f();
                              return;
                           }

                           this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nPasswords don't match.");
                        } else {
                           this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nMissing value for 'Re-enter Password'.");
                        }
                     } else {
                        this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nPassword must be at least 6 characters in length.");
                     }
                  } else {
                     this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nInvalid entry for 'Email Address'.");
                  }
               } else {
                  this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nMissing value for 'Email Address'.");
               }
            } else {
               this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nMissing value for 'Last Name'.");
            }
         } else {
            this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nMissing value for 'First Name'.");
         }
      } else {
         if (var1.equals("Cancel")) {
            ((Kalypte)this.b_).q();
            this.f();
            return;
         }

         if (var1.equals("OK")) {
            if (I.equals("pre-register")) {
               g = this.a.a("mobile");
               if (g != null && g.length() != 0) {
                  if (!i(g)) {
                     this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nMobile number must only consist of numbers.");
                     return;
                  }

                  this.H();
                  return;
               }

               this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nMissing value for 'Mobile Number'.");
               return;
            }

            f = this.a.a("username");
            if (f == null || f.length() < 6 || f.length() > 12) {
               this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nUsername can only be between 6 and 12 characters long.");
               return;
            }

            if (f != null && f.length() > 0 && Character.isDigit(f.charAt(0))) {
               this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nYour user ID must not start with a number.");
               return;
            }

            if (f != null && f.length() > 0 && com.kolipri.kpr.i.d(f)) {
               this.j("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nYour user ID must not contain special symbols.");
               return;
            }

            this.G();
         }
      }

   }

   private void H() {
      com.kolipri.kt.o var1;
      (var1 = new com.kolipri.kt.o(this, this.b_, this) {
         private au e = null;

         public {
            this.e = var3;
         }

         public final boolean a(com.kolipri.kt.al var1) {
            boolean var2 = false;
            if (var1.b == 5 || var1.b < 1 || var1.b > 7) {
               this.b();
               var2 = true;
            }

            if (!var2) {
               var2 = super.a(var1);
            }

            return var2;
         }

         public final void a() {
            super.a();
            this.a("* Next your User ID \n\nPlease enter your desired new User ID\n\n This is the number or name people will use to contact and message you using Uzzap service.Your User ID must be between 6 to 12 characters, and can only consist of numbers and letters.");
         }

         private void b() {
            com.kolipri.kt.ad var1;
            (var1 = new com.kolipri.kt.ad(this.t())).a();
            var1.c(au.f);
            var1.b(12);
            var1.b("Enter your UserID");
            var1.a((com.kolipri.kt.o)this);
            var1.b();
         }

         public final void c_() {
            this.f();
         }

         public final void c(String var1) {
         }

         public final void a_(String var1) {
            if (var1 == null || var1.length() >= 6 && var1.length() <= 12) {
               if (var1 != null && var1.length() > 0 && Character.isDigit(var1.charAt(0))) {
                  this.a("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nYour User ID must not start with a number.");
                  this.w();
               } else if (var1 != null && var1.length() > 0 && com.kolipri.kpr.i.d(var1)) {
                  this.a("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nYour User ID must not contain special symbols.");
                  this.w();
               } else {
                  if (au.J.trim().length() == 0) {
                     this.e.g(var1);
                  } else {
                     this.e.G();
                  }

                  au.f = var1;
                  this.f();
               }
            } else {
               this.a("* Incorrect data\n\nPlease make sure to fill out all fields as instructed:\n\nUser ID can only be between 6 and 12 characters long.");
               this.w();
            }
         }

         public final void a(com.kolipri.kt.x var1) {
            var1.a("OK", "Cancel");
         }

         public final void b(String var1) {
            if (var1.equals("OK")) {
               this.b();
            } else {
               if (var1.equals("Cancel")) {
                  this.f();
                  this.e = null;
               }

            }
         }
      }).a();
      var1.a(this.b_.c());
   }

   public final void g(String var1) {
      f = var1;
      this.f();
      u var2;
      (var2 = new u(this.b_)).b(1);
      var2.b(true);
      var2.a(this);
      var2.a();
      var2.a(this.v());
   }

   public final void G() {
      com.kolipri.kimp.p var1;
      (var1 = new com.kolipri.kimp.p()).b("username", f == null ? "" : f);
      var1.b("mobile", g == null ? "" : g);
      ((Kalypte)this.b_).b(var1);
      ((Kalypte)this.b_).i.a(com.kolipri.kimp.ae.f(var1));
      this.f();
   }

   private static boolean i(String var0) {
      boolean var1 = true;
      if (var0.length() < 1 || var0.length() > 15) {
         var1 = false;
      }

      if (!Character.isDigit(var0.charAt(0)) && var0.charAt(0) != '+') {
         var1 = false;
      } else {
         for(int var2 = 1; var2 <= var0.length() - 1; ++var2) {
            if (!Character.isDigit(var0.charAt(var2))) {
               var1 = false;
               var2 = var0.length();
            }
         }
      }

      return var1;
   }

   private void j(String var1) {
      com.kolipri.kt.a var2;
      (var2 = new com.kolipri.kt.a(this.b_)).a();
      var2.a(var1);
      var2.b(true);
      var2.a(this.b_.c());
   }
}
