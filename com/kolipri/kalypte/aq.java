package com.kolipri.kalypte;

public class aq extends com.kolipri.kt.k {
   protected com.kolipri.kt.v b = null;
   private String a = null;
   public g c;
   private String e;
   private String f = null;
   private bd g = null;

   public aq(com.kolipri.kt.r var1) {
      super(var1);
      this.c = new g(super.b_);
   }

   public final void a(String var1, String var2) {
      this.c.a(var1, var2);
   }

   public final void b(String var1, String var2) {
      this.e = var1;
      this.f = var2;
   }

   public final void a(bd var1) {
      this.g = var1;
   }

   public void a(com.kolipri.kt.x var1) {
      if (var1 != null) {
         var1.a(this.e, this.f);
      }

   }

   public void b(String var1) {
      if (!var1.equals("Cancel")) {
         if (this.g != null) {
            this.g.a(this.c.d(), this.c.a_());
         }
      } else {
         this.g.d();
      }

      this.f();
   }

   public final void a(String var1) {
      this.a = var1;
   }

   public void a() {
      super.a();
      this.c(4);
      com.kolipri.kt.ab var1;
      (var1 = new com.kolipri.kt.ab(super.b_)).a();
      var1.b(0);
      var1.b(true);
      var1.c(this.a);
      var1.b();
      this.d(var1);
      this.b = new com.kolipri.kt.v(super.b_, this.c);
      this.b.a();
      this.b.b(4);
      this.b.b(true);
      this.d(this.b);
   }

   public final boolean a(int var1, int var2) {
      boolean var3;
      if (var3 = super.a(var1, var2)) {
         this.f();
      }

      return var3;
   }

   public final void f() {
      super.f();
   }

   public final void a(String var1, String var2, int var3) {
      this.c.a(var1, var2, var3);
   }
}
