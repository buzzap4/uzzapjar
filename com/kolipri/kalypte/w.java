package com.kolipri.kalypte;

public final class w extends com.kolipri.kt.a {
   protected al e = null;

   public w(com.kolipri.kt.r var1, al var2) {
      super(var1);
      this.e = var2;
   }

   public final void a() {
      super.a();
      this.a("Are you sure you want to disable Buddy Matching? This will make it harder for you to find your friends");
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Yes", "No");
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Yes")) {
         if (((Kalypte)super.b_).y) {
            ((Kalypte)super.b_).y = false;
            ((Kalypte)super.b_).x.f();
         }

         ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.c());
         this.e.g = true;
         this.e.a(1);
         this.e.e(0);
      }

      this.f();
   }
}
