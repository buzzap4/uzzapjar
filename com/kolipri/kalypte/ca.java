package com.kolipri.kalypte;

public final class ca extends com.kolipri.kt.a {
   public ca(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a() {
      super.a();
      this.a("Automatic buddy matching allows your address book contacts to be automatically listed in Uzzap once they register to the service. Service requires that your phone addressbook be uploaded to the server.\n\nWould you like to enable automatic buddy matching?");
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Yes", "No");
   }

   public final void b(String var1) {
      if (((Kalypte)super.b_).i != null) {
         if (var1 != null && var1.equals("Yes")) {
            cw var3;
            if ((var3 = ((Kalypte)super.b_).n()) != null && var3.b() != null) {
               var3.b().c(true);
               var3.g();
            }
         } else {
            com.kolipri.kpr.b var2;
            (var2 = new com.kolipri.kpr.b()).b("abm-active", "no");
            ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.a(var2));
         }
      }

      super.b(var1);
   }
}
