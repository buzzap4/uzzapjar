package com.kolipri.kalypte;

public final class ah extends com.kolipri.kt.a {
   public ah(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Yes", "No");
   }

   public final void a() {
      super.a();
      this.a("* Clear history\n\nThis will delete your entire messaging history. Do you want to proceed?");
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Yes")) {
         com.kolipri.kimp.ad.a();
      }

      this.f();
   }
}
