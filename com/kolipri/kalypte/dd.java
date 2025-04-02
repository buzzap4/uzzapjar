package com.kolipri.kalypte;

public final class dd extends com.kolipri.kt.g {
   protected com.kolipri.kt.ar a = null;
   protected String j = null;
   protected String f = null;

   public dd(com.kolipri.kt.r var1, String var2, String var3) {
      super(var1);
      this.j = var2;
      this.f = var3;
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

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Login", "Cancel");
   }

   public final String b() {
      String var1 = null;
      if (this.j.equals("yahoo")) {
         var1 = "* Connect to Yahoo\n";
      } else if (this.j.equals("msn")) {
         var1 = "* Connect to MSN\n";
      } else if (this.j.equals("retryyahoo")) {
         var1 = "* Yahoo!\nInvalid username and password.";
         this.j = "yahoo";
      } else if (this.j.equals("retrymsn")) {
         var1 = "* MSN\nInvalid username and password.";
         this.j = "msn";
      }

      return var1;
   }

   public final void a() {
      String var1 = ((Kalypte)super.b_).i.c();
      String var2 = "";
      String var3 = "";
      if (this.j != null) {
         if (this.j.equals("yahoo")) {
            var2 = "Yahoo ID";
            var3 = "(eg. abs)";
         } else if (this.j.equals("msn")) {
            var2 = "MSN ID";
            var3 = "(eg. abs@hotmail.com)";
         }
      }

      if (var1 == null) {
         var1 = "unknown";
      }

      this.a = new com.kolipri.kt.ar(super.b_, this.j + "-options");
      this.a.a("username", var2, "Your " + this.f + " ID", "* " + this.f + " ID\n\nYour " + this.f + " ID " + var3, ((Kalypte)super.b_).h.a(var1 + "." + this.j + ".username"), 50);
      this.a.a("password", "Password", "Your " + this.f + " Password", "* " + this.f + " password\n\nPlease enter the password for your " + this.f + " account here.", ((Kalypte)super.b_).h.a(var1 + "." + this.j + ".password"), 65536, 50);
      super.a((com.kolipri.kt.af)this.a);
   }

   public final void b(String var1) {
      if (var1.equals("Login")) {
         ((Kalypte)super.b_).a(this.j, this.a.a("username"), this.a.a("password"));
         this.f();
      } else {
         if (var1.equals("Cancel")) {
            this.f();
         }

      }
   }
}
