package com.kolipri.kalypte;

public final class z extends com.kolipri.kt.a {
   private boolean e = false;

   private z(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a() {
      super.a();
      z var10000;
      String var10001;
      int var1;
      if ((var1 = ((Kalypte)super.b_).i.b()) > 0) {
         var10000 = this;
         var10001 = "* You still have " + var1 + " messages waiting in your outbox.\nAre you sure you wish to discard these messages and " + (this.e ? "exit" : "log out") + "?";
      } else {
         var10000 = this;
         var10001 = this.e ? "Are you sure you want to quit Uzzap?" : "Are you sure you want to log out of the current session?";
      }

      var10000.a(var10001);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Yes", "No");
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Yes")) {
         if (this.e) {
            super.b_.j();
         } else {
            ((Kalypte)super.b_).q();
         }
      }

      super.b(var1);
   }

   public static void a(com.kolipri.kt.r var0) {
      z var1;
      (var1 = new z(var0)).a();
      var1.a(var0.c());
   }
}
