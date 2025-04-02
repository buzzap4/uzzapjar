package com.kolipri.kalypte;

final class cv extends com.kolipri.kt.g {
   protected com.kolipri.kt.ar a = null;

   public cv(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final String b() {
      return "Please enter your User ID or mobile number in full international format including country code(for example +63920___).";
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("OK", "Cancel");
   }

   public final void a() {
      this.a = new com.kolipri.kt.ar(super.b_, "forgot-password");
      if (this.a != null) {
         this.a.a("username", "User ID / Mobile Number", "User ID/Mobile Number", "Your User ID and Password will be sent to the Email address on your account.\n", "", 30);
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
      if (!var1.equals("Cancel")) {
         if (!var1.equals("OK")) {
            return;
         }

         String var2 = null;
         if (!(var2 = this.a.a("username")).equals("")) {
            ((Kalypte)super.b_).a("register", "register");
            ((Kalypte)super.b_).b(var2);
         }
      }

      this.f();
   }
}
