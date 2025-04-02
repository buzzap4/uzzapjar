package com.kolipri.kalypte;

public final class bv extends cf {
   public bv(com.kolipri.kt.r var1) {
      super(var1);
      new com.kolipri.kpr.f();
   }

   public final void a(com.kolipri.kpr.f var1) {
      this.a("Reading phonebook..");
      super.a();
      super.f.d = "phone";
      super.f.a = var1;
      super.f.g = false;
      this.J();
      this.w();
   }

   public final void f() {
      super.f();
   }

   private synchronized void J() {
      if (super.c != null) {
         if (super.f.a != null && super.f.a.b() != 0) {
            ((com.kolipri.kt.ab)super.c).c("Select the contacts you want to add then click Ok.\n");
         } else {
            ((com.kolipri.kt.ab)super.c).c("(no contacts found on your phone)\n");
         }
      }

      this.w();
   }
}
