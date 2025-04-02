package com.kolipri.kalypte;

public final class cn extends com.kolipri.kt.a {
   protected k e = null;

   public cn(com.kolipri.kt.r var1, k var2) {
      super(var1);
      this.e = var2;
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Yes", "No");
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Yes")) {
         ((Kalypte)super.b_).h.b("kolipri.xmpp.autologin", "yes");
         ((Kalypte)super.b_).h.c();
      } else if (var1 != null && var1.equals("No")) {
         ((Kalypte)super.b_).h.b("kolipri.xmpp.autologin", "no");
         ((Kalypte)super.b_).h.c();
      }

      if (this.e != null) {
         this.e.e();
      }

      this.f();
   }

   public final void a() {
      super.a();
      this.a("Would you like to log in automatically with your username/password when the application is started?");
   }
}
