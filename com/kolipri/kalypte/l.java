package com.kolipri.kalypte;

public final class l extends com.kolipri.kt.a {
   protected com.kolipri.kt.r b_ = null;
   protected String e;
   protected String f;

   public l(com.kolipri.kt.r var1, String var2, String var3, String var4) {
      super(var1);
      this.b_ = var1;
      this.e = var2;
      this.f = var4;
      super.c = "Cancel";
      super.b = "Confirm";
   }

   public final void b(String var1) {
      if (var1.equals("Confirm")) {
         ((Kalypte)this.b_).i.a(com.kolipri.kimp.i.a(this.e, this.f, "yes"));
      } else if (var1.equals("Cancel")) {
      }

      this.f();
   }

   public final void a() {
      super.a();
      this.a("* Please confirm your request\n\nThank you for selecting a " + this.e + " package. Please confirm to proceed.\n\n" + (this.f.equals("yes") ? "You selected Auto-Renew option. Your package will automatically be renewed when it expires." : "You did not select Auto-Renew. When your package expires, you will be automatically on transactional billing."));
   }
}
