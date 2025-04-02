package com.kolipri.kalypte;

public final class ar extends com.kolipri.kt.ab implements com.kolipri.kt.b {
   public ar(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Close Tab", "Menu");
   }

   public final void b(String var1) {
      cw var2;
      if (var1 != null && var1.equals("Close Tab")) {
         if ((var2 = ((Kalypte)super.b_).n()) != null) {
            var2.G();
         }

         this.D();
      } else {
         if (var1 != null && var1.equals("Menu") && (var2 = ((Kalypte)super.b_).n()) != null) {
            var2.G();
         }

      }
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var2 == 10) {
         this.D();
      }

      return true;
   }

   public final void a() {
      super.a();
      this.c(com.kolipri.kpr.o.a("/battery.txt"));
   }

   public final String E() {
      return "Battery Saving Mode";
   }
}
