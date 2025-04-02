package com.kolipri.kalypte;

public final class az extends com.kolipri.kt.g implements com.kolipri.kt.b {
   protected com.kolipri.kt.ae a = null;
   protected f f = null;

   public az(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a(f var1) {
      this.f = var1;
   }

   public final void a() {
      this.a = new com.kolipri.kt.ae(super.b_, "emoticons");

      for(int var1 = 0; var1 < i.a(); ++var1) {
         cm var2;
         if ((var2 = i.a(var1)) != null && !var2.a.equals(":-)") && !var2.a.equals(":-(")) {
            this.a.a(var1, super.b_.a.b(var2.b), "");
         }
      }

      this.a.a(this);
      super.a(this.a, true);
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      cm var3;
      if ((var3 = i.a(var2)) != null) {
         (new StringBuffer()).append("Got '").append(var3.a).append("'").toString();
         if (this.f != null) {
            this.f.a(var3.a);
         }
      }

      return true;
   }
}
