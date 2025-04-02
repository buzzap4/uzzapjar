package com.kolipri.kalypte;

final class k extends com.kolipri.kt.g {
   protected com.kolipri.kt.ar a = null;

   public k(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final String b() {
      return "* Login to network";
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Login", "Cancel");
   }

   public final void a() {
      this.a = new com.kolipri.kt.ar(super.b_, "login-options");
      this.a.a("username", "User ID", "Your user ID", "* User ID\n\nUser ID you chose upon registering. User ID can be 6 to 12 characters, and can consist of numbers and letters.", ((Kalypte)super.b_).h.a("amazilia.username"), 12);
      this.a.a("password", "Password", "Your password", "* Password\n\nEnter the personal password currently registered for your user account.", ((Kalypte)super.b_).h.a("amazilia.password"), 65536, 31);
      super.a((com.kolipri.kt.af)this.a);
   }

   public final void e() {
      ((Kalypte)super.b_).a(this.a.a("username"), this.a.a("password"));
      this.f();
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
      if (var1.equals("Login")) {
         cn var2;
         (var2 = new cn(super.b_, this)).a();
         var2.a(super.b_.c());
      } else {
         if (var1.equals("Cancel")) {
            ((Kalypte)super.b_).q();
            this.f();
         }

      }
   }
}
