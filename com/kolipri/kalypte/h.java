package com.kolipri.kalypte;

public final class h implements com.kolipri.kt.b {
   protected com.kolipri.kt.r a = null;
   private com.kolipri.kt.g b = null;

   public h(com.kolipri.kt.r var1) {
      this.a = var1;
   }

   public final void a(String var1) {
      com.kolipri.kt.ae var2;
      (var2 = new com.kolipri.kt.ae(this.a, var1)).a(1, (com.kolipri.kt.ai)null, "Add Manually");
      var2.a(2, (com.kolipri.kt.ai)null, "Add from Phonebook");
      var2.a(this);
      this.b = new com.kolipri.kt.g(this.a);
      this.b.a((com.kolipri.kt.af)var2);
      this.b.a(this.a.c());
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("add-other-contact")) {
         switch(var2) {
         case 1:
            r var3;
            (var3 = new r(this.a, (com.kolipri.kimp.p)null)).a();
            var3.a(this.a.c());
            break;
         case 2:
            (new m(this.a)).a(this.a);
         }
      } else if (var1.a().equals("add-buddy-by-mobile")) {
         switch(var2) {
         case 1:
            (new cs(this.a, "mobile")).c();
            break;
         case 2:
            (new x(this.a)).c();
         }
      }

      return true;
   }
}
