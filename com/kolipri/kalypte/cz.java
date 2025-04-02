package com.kolipri.kalypte;

public final class cz extends com.kolipri.kt.a {
   protected com.kolipri.kimp.p e = null;

   public cz(com.kolipri.kt.r var1, com.kolipri.kimp.p var2) {
      super(var1);
      this.e = var2;
   }

   public final void a() {
      super.a();
      this.a("Are you sure you wish to delete contact '" + this.e.d() + "'?");
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Yes", "No");
   }

   public final void b(String var1) {
      if (var1.equals("Yes")) {
         String var2;
         if ((var2 = this.e.a("amaz-cid")) != null && var2.length() > 0 && ((Kalypte)super.b_).i != null) {
            ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.a(var2));
         }
      } else {
         var1.equals("No");
      }

      this.f();
   }
}
